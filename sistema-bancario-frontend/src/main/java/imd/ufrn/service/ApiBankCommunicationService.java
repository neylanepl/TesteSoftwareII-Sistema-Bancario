package imd.ufrn.service;

import imd.ufrn.model.api.AccountRequest;
import imd.ufrn.model.api.AccountResponse;
import imd.ufrn.model.api.TransferRequest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

public class ApiBankCommunicationService {

    private final String baseUrl = "http://localhost:8080/banco";
    public UrlService urlService = new UrlService();

    // public ApiBankCommunicationService(UrlService urlService) {
    //     this.urlService = urlService;
    // }

    // Método para criar uma conta
    public boolean createAccount(int accountNumber, int accountType, double balance) {
        try {
            AccountRequest accountRequest = new AccountRequest(accountNumber, accountType, balance);
            String requestBody = convertAccountRequestToJson(accountRequest);

            URL url = new URL(baseUrl + "/contas");
            HttpURLConnection connection = (HttpURLConnection) urlService.createConnection(url);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = requestBody.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = connection.getResponseCode();
            return responseCode == HttpURLConnection.HTTP_CREATED; // 201 Created

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para buscar uma conta pelo número
    public AccountResponse getAccountByNumber(int accountNumber) {
        try {
            URL url = new URL(baseUrl + "/contas/" + accountNumber);
            HttpURLConnection connection = (HttpURLConnection) urlService.createConnection(url);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = in.readLine()) != null) {
                        response.append(line);
                    }
                    return parseAccountResponseFromJson(response.toString());
                }
            } else {
                return null; // Conta não encontrada
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Método para checar o saldo da conta
    public double checkBalance(int accountNumber) {
        AccountResponse account = getAccountByNumber(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            return 0.0;
        }
    }

    // Método para debitar valor de uma conta
    public Optional<Double> debit(int accountNumber, double valueToDebit) {
        try {
            URL url = new URL(baseUrl + "/contas/" + accountNumber + "/debitar?valor=" + valueToDebit);
            HttpURLConnection connection = (HttpURLConnection) urlService.createConnection(url);
            connection.setRequestMethod("PATCH");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = in.readLine()) != null) {
                        response.append(line);
                    }
                    AccountResponse updatedAccount = parseAccountResponseFromJson(response.toString());
                    return Optional.of(updatedAccount.getBalance());
                }
            } else {
                return Optional.empty(); // Falha no débito
            }

        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    // Método para creditar valor em uma conta
    public double credit(int accountNumber, double valueToCredit) {
        try {
            URL url = new URL(baseUrl + "/contas/" + accountNumber + "/creditar?valor=" + valueToCredit);
            HttpURLConnection connection = (HttpURLConnection) urlService.createConnection(url);
            connection.setRequestMethod("PATCH");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = in.readLine()) != null) {
                        response.append(line);
                    }
                    AccountResponse updatedAccount = parseAccountResponseFromJson(response.toString());
                    return updatedAccount.getBalance();
                }
            } else {
                return 0.0; // Falha no crédito
            }

        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    // Método para transferir valor entre contas
    public boolean transfer(int originAccountNumber, int destinationAccountNumber, double valueToTransfer) {
        try {
            TransferRequest transferRequest = new TransferRequest(originAccountNumber, destinationAccountNumber, valueToTransfer);
            String requestBody = convertTransferRequestToJson(transferRequest);

            URL url = new URL(baseUrl + "/transferencias");
            HttpURLConnection connection = (HttpURLConnection) urlService.createConnection(url);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = requestBody.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = connection.getResponseCode();
            return responseCode == HttpURLConnection.HTTP_OK; // Sucesso na transferência

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para aplicar taxas em contas poupança
    public void payFees(double fee) {
        try {
            URL url = new URL(baseUrl + "/contas/poupanca/render?taxa=" + fee);
            HttpURLConnection connection = (HttpURLConnection) urlService.createConnection(url);
            connection.setRequestMethod("PATCH");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Taxas aplicadas com sucesso!");
            } else {
                System.out.println("Erro ao aplicar taxas.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Funções auxiliares para converter objetos em JSON manualmente
    private String convertAccountRequestToJson(AccountRequest accountRequest) {
        return String.format("{\"accountNumber\":%d,\"accountType\":%d,\"balance\":%.2f}",
                accountRequest.getAccountNumber(), accountRequest.getAccountType(), accountRequest.getBalance());
    }

    private String convertTransferRequestToJson(TransferRequest transferRequest) {
        return String.format("{\"originAccountNumber\":%d,\"destinationAccountNumber\":%d,\"valueToTransfer\":%.2f}",
                transferRequest.getTo(), transferRequest.getFrom(), transferRequest.getAmount());
    }

    private AccountResponse parseAccountResponseFromJson(String json) {
        // Implementação básica para extrair os campos manualmente
        String[] parts = json.replace("{", "").replace("}", "").replace("\"", "").split(",");
        AccountResponse accountResponse = new AccountResponse();
        for (String part : parts) {
            String[] keyValue = part.split(":");
            switch (keyValue[0].trim()) {
                case "accountNumber":
                    accountResponse.setAccountNumber(Integer.parseInt(keyValue[1].trim()));
                    break;
                case "accountType":
                    accountResponse.setAccountType(Integer.parseInt(keyValue[1].trim()));
                    break;
                case "balance":
                    accountResponse.setBalance(Double.parseDouble(keyValue[1].trim()));
                    break;
            }
        }
        return accountResponse;
    }
}
