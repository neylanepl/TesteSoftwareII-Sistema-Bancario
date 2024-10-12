package imd.ufrn.controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import imd.ufrn.model.api.AccountRequest;
import imd.ufrn.model.api.TransferRequest;
import imd.ufrn.service.BankService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Optional;

public class BankController {

    private BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    public void startServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        ObjectMapper objectMapper = new ObjectMapper();

        // Criar conta
        server.createContext("/banco/conta", (HttpExchange exchange) -> {
            if ("POST".equals(exchange.getRequestMethod())) {
                AccountRequest accountRequest = objectMapper.readValue(exchange.getRequestBody(), AccountRequest.class);
                boolean result = bankService.createAccount(accountRequest.getAccountNumber(), accountRequest.getAccountType(), accountRequest.getBalance());
                String response = result ? "Conta criada com sucesso!" : "Falha ao criar conta!";
                sendResponse(exchange, response);
            }
        });

        // Consultar saldo
        server.createContext("/banco/conta/saldo/", (HttpExchange exchange) -> {
            if ("GET".equals(exchange.getRequestMethod())) {
                Integer accountNumber = Integer.parseInt(exchange.getRequestURI().getPath().split("/")[4]);
                Double balance = bankService.checkBalance(accountNumber);
                String response = "Saldo da conta: " + balance;
                sendResponse(exchange, response);
            }
        });

        // Transferência
        server.createContext("/banco/conta/transferencia", (HttpExchange exchange) -> {
            if ("PUT".equals(exchange.getRequestMethod())) {
                TransferRequest transferRequest = objectMapper.readValue(exchange.getRequestBody(), TransferRequest.class);
                boolean result = bankService.realizeTransfer(transferRequest.getFrom(), transferRequest.getTo(), transferRequest.getAmount());
                String response = result ? "Transferência realizada com sucesso!" : "Falha na transferência!";
                sendResponse(exchange, response);
            }
        });

        server.setExecutor(null);
        server.start();
    }

    private void sendResponse(HttpExchange exchange, String response) throws IOException {
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
