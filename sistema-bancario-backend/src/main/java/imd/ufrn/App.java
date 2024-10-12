package imd.ufrn;

import imd.ufrn.controller.BankController;
import imd.ufrn.repository.BankRepository;
import imd.ufrn.service.BankService;

public class App {
    public static void main(String[] args) {
        try {
            BankRepository bankRepository = new BankRepository();
            BankService bankService = new BankService(bankRepository);
            BankController bankController = new BankController(bankService);
            bankController.startServer();
            System.out.println("Servidor iniciado na porta 8080...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
