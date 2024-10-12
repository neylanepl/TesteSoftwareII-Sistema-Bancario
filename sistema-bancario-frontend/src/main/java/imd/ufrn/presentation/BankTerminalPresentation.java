package imd.ufrn.presentation;

import java.util.Optional;
import java.util.Scanner;

import imd.ufrn.model.api.AccountResponse;
import imd.ufrn.service.ApiBankCommunicationService;
import imd.ufrn.service.UrlService;

public class BankTerminalPresentation {

    private ApiBankCommunicationService apiBankCommunication = new ApiBankCommunicationService();
    private Scanner scanner = new Scanner(System.in);

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String GREEN_BACKGROUND = "\u001B[32m";
    public static final String RED_BACKGROUND = "\u001B[31m";

    public void initialize() {
        mainLoop();
    }

    private void mainLoop() {
        while (true) {
            System.out.println("");
            System.out.println("-----------------------------------");
            System.out.println("");

            int opt = showOptionsAndReturnOption();

            System.out.println("");
            System.out.println("");

            switch (opt) {
                case 0:
                    exitChosen();
                case 1:
                    createAccountChosen();
                    break;
                case 2:
                    realizeDebit();
                    break;
                case 3:
                    realizeCredit();
                    break;
                case 4:
                    realizeTransfer();
                    break;
                case 5:
                    checkBalance();
                    break;
                case 6:
                    runPayFees();
                    break;
                case 7:
                    consultAccount();
                    break;
                default:
                    wrongOption();
                    break;
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Digite enter para prosseguir para a próxima operação...");
            scanner.nextLine();
            scanner.nextLine();
        }
    }

    private void checkBalance() {
        System.out.println("Digite o número da conta que deseja consultar o saldo: ");
        int accountNumber = scanner.nextInt();
        double balance = apiBankCommunication.checkBalance(accountNumber);
        System.out.printf("Saldo atual da conta número %d: %.2f \n", accountNumber, balance);
    }

    private boolean isNotPositive(double value) {
        return value < 0;
    }

    private void wrongOption() {
        System.out.println(RED_BACKGROUND + "Opção inválida. Tente novamente." + ANSI_RESET);
    }

    private void exitChosen() {
        System.out.println("Fechando o programa...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println(GREEN_BACKGROUND + "Programa fechado com sucesso!" + ANSI_RESET);
        scanner.close();
        System.exit(0);
    }

    public int showOptionsAndReturnOption() {
        System.out.println("Escolha uma opção: ");
        System.out.println("    0- Sair");
        System.out.println("    1- Criar conta");
        System.out.println("    2- Realizar débito");
        System.out.println("    3- Realizar crédito");
        System.out.println("    4- Realizar transferência");
        System.out.println("    5- Consultar saldo");
        System.out.println("    6- Render juros");
        System.out.println("    7- Consultar Conta");

        return scanner.nextInt();
    }

    public void createAccountChosen() {
        System.out.println("Para criar uma conta digite o número da conta: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Digite o tipo da conta:");
        System.out.println("    1- Conta normal");
        System.out.println("    2- Conta poupança");
        System.out.println("    3- Conta Bônus");
        int accountType = scanner.nextInt();
        double balance = 0.0;
        if (accountType == 1 || accountType == 2) {
            System.out.println("Digite o saldo inicial:");
            balance = scanner.nextDouble();
        }

        System.out.println("Criando conta de número: " + accountNumber);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        boolean isSuccess = apiBankCommunication.createAccount(accountNumber, accountType, balance);
        if (isSuccess) {
            System.out.println(GREEN_BACKGROUND + "Conta criada com sucesso!" + ANSI_RESET);
        } else {
            System.out.println(RED_BACKGROUND + "Falha ao criar conta, verifique o tipo da conta inserido e tente novamente." + ANSI_RESET);
        }
    }

    public void realizeDebit() {
        System.out.println("Digite o número da conta que deseja realizar o débito: ");
        int accountNumber = scanner.nextInt();
        System.out.printf("Digite quanto deseja debitar da conta %d: ", accountNumber);
        double valueToDebit = scanner.nextDouble();

        if (isNotPositive(valueToDebit)) {
            System.out.println(RED_BACKGROUND + "O valor não pode ser negativo." + ANSI_RESET);
            return;
        }

        Optional<Double> newBalance = apiBankCommunication.debit(accountNumber, valueToDebit);
        if (!newBalance.isPresent()) {
            System.out.printf(RED_BACKGROUND + "Não foi possível realizar a operação pois a conta não possui saldo suficiente" + ANSI_RESET);
        } else {
            System.out.printf(GREEN_BACKGROUND + "Valor debitado com sucesso, saldo atual: %.2f: " + ANSI_RESET, newBalance.get());
        }
    }

    public void realizeCredit() {
        System.out.println("Digite o número da conta em que deseja realizar o crédito: ");
        int accountNumber = scanner.nextInt();
        System.out.printf("Digite quanto deseja creditar na conta %d: ", accountNumber);
        double valueToCredit = scanner.nextDouble();

        if (isNotPositive(valueToCredit)) {
            System.out.println(RED_BACKGROUND + "O valor não pode ser negativo." + ANSI_RESET);
            return;
        }

        double newBalance = apiBankCommunication.credit(accountNumber, valueToCredit);
        System.out.printf(GREEN_BACKGROUND + "Valor creditado com sucesso, saldo atual: %.2f " + ANSI_RESET, newBalance);
    }

    public void realizeTransfer() {
        System.out.println("Digite o número da conta de origem: ");
        int originAccountNumber = scanner.nextInt();
        System.out.println("Digite o número da conta de destino: ");
        int destinationAccountNumber = scanner.nextInt();
        System.out.println("Digite o valor a ser transferido: ");
        double valueToTransfer = scanner.nextDouble();

        if (isNotPositive(valueToTransfer)) {
            System.out.println(RED_BACKGROUND + "O valor não pode ser negativo." + ANSI_RESET);
            return;
        }

        boolean isSuccess = apiBankCommunication.transfer(originAccountNumber, destinationAccountNumber, valueToTransfer);
        if (isSuccess) {
            System.out.println(GREEN_BACKGROUND + "Valor transferido com sucesso!" + ANSI_RESET);
        } else {
            System.out.println(RED_BACKGROUND + "Falha ao transferir. A conta de origem não possui saldo o suficiente." + ANSI_RESET);
        }
    }

    public void runPayFees() {
        System.out.println("Digite a taxa em porcentagem que deseja aplicar(Exemplo 5,5):");
        double fee = scanner.nextDouble();
        apiBankCommunication.payFees(fee);
        System.out.println(GREEN_BACKGROUND + "Taxa aplicada com sucesso em todas as contas do tipo poupança." + ANSI_RESET);
    }

    public void consultAccount() {
        System.out.println("Digite o número da conta:");
        int accountNumber = scanner.nextInt();

        AccountResponse account = apiBankCommunication.getAccountByNumber(accountNumber);

        if (account != null) {
            System.out.println("Tipo de Conta: " + (account.getAccountType() == 2 ? "Conta Poupança" : (account.getAccountType() == 3 ? "Conta Bônus" : "Conta Normal")));
            System.out.println("Número da Conta: " + account.getAccountNumber());
            System.out.println("Saldo: " + account.getBalance());

            if (account.getAccountType() == 3) {
                System.out.println("Bônus: " + account.getPunctuation());
            }
        } else {
            System.out.println("Conta não encontrada!");
        }
    }
}
