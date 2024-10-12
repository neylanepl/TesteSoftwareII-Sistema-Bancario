package imd.ufrn;

import imd.ufrn.presentation.BankTerminalPresentation;

public class App {

    private BankTerminalPresentation bankTerminalPresentation;

    public static void main(String[] args) {
        // Inicializar manualmente o programa em vez de usar SpringApplication
        App app = new App();
        app.run(args);
    }

    public App() {
        // Injeção manual de dependências
        this.bankTerminalPresentation = new BankTerminalPresentation();
    }

    public void run(String... args) {
        // Método que substitui o CommandLineRunner do Spring Boot
        try {
            bankTerminalPresentation.initialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
