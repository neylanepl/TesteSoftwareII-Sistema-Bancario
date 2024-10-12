import static org.mockito.Mockito.*;
import static org.junit.Assert.*; // Asserções do JUnit 4
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import imd.ufrn.model.Account;
import imd.ufrn.model.BonusAccount;
import imd.ufrn.model.SavingsAccount;
import imd.ufrn.repository.BankRepository;
import imd.ufrn.service.BankService;

public class BankServiceTest {

    @Mock
    private BankRepository bankRepository;

    @InjectMocks
    private BankService bankService;

    @Before // Usando JUnit 4, @Before é o equivalente a @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this); // Método para iniciar mocks no JUnit 4
    }

    // Teste para criar conta
    @Test
    public void testCreateAccount_Success() {
        int accountNumber = 1234;
        int accountType = 1; // Tipo de conta 1 é uma conta regular
        double balance = 100.0;

        boolean result = bankService.createAccount(accountNumber, accountType, balance);

        assertTrue(result); // Verifique se o resultado é true
        verify(bankRepository, times(1)).saveAccount(any(Account.class)); // Verifique se o repositório foi chamado
    }

    @Test
    public void testCreateAccount_InvalidType() {
        int accountNumber = 1234;
        int accountType = 5; // Tipo de conta inválido
        double balance = 100.0;

        boolean result = bankService.createAccount(accountNumber, accountType, balance);

        assertFalse(result); // Verifique se o resultado é false
        verify(bankRepository, never()).saveAccount(any(Account.class)); // O repositório não deve ser chamado
    }

    // Teste para realizar débito
    @Test
    public void testRealizeDebit_Success() {
        int accountNumber = 1234;
        double balance = 100.0;
        double debitValue = 50.0;

        Account account = new Account(accountNumber, balance);
        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        Optional<Double> result = bankService.realizeDebit(accountNumber, debitValue);

        assertTrue(result.isPresent()); // Verifique se o débito foi realizado
        assertEquals(50.0, result.get(), 0.01); // Verifique o novo saldo
        verify(bankRepository, times(1)).saveAccount(account); // Verifique se a conta foi salva
    }

    @Test
    public void testRealizeDebit_InsufficientBalance() {
        int accountNumber = 1234;
        double balance = 50.0;
        double debitValue = 100.0;

        Account account = new Account(accountNumber, balance);
        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        Optional<Double> result = bankService.realizeDebit(accountNumber, debitValue);

        assertFalse(result.isPresent()); // O débito não deve ocorrer
        verify(bankRepository, never()).saveAccount(any(Account.class)); // O repositório não deve salvar a conta
    }

    // Teste para realizar crédito
    @Test
    public void testRealizeCredit_Success() {
        int accountNumber = 1234;
        double balance = 100.0;
        double creditValue = 50.0;

        Account account = new Account(accountNumber, balance);
        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        double result = bankService.realizeCredit(accountNumber, creditValue, false);

        assertEquals(150.0, result, 0.01); // Verifique o novo saldo
        verify(bankRepository, times(1)).saveAccount(account); // Verifique se a conta foi salva
    }

    @Test
    public void testRealizeCredit_InvalidValue() {
        int accountNumber = 1234;
        double balance = 100.0;
        double creditValue = -50.0; // Valor inválido

        Account account = new Account(accountNumber, balance);
        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        double result = bankService.realizeCredit(accountNumber, creditValue, false);

        assertEquals(balance, result, 0.01); // O saldo não deve mudar
        verify(bankRepository, never()).saveAccount(any(Account.class)); // O repositório não deve salvar a conta
    }

    // Teste para realizar transferência
    @Test
    public void testRealizeTransfer_Success() {
        int originAccountNumber = 1234;
        int destinationAccountNumber = 5678;
        double balance = 200.0;
        double transferValue = 50.0;

        Account originAccount = new Account(originAccountNumber, balance);
        Account destinationAccount = new Account(destinationAccountNumber, 100.0);
        
        when(bankRepository.getAccountByAccountNumber(originAccountNumber)).thenReturn(originAccount);
        when(bankRepository.getAccountByAccountNumber(destinationAccountNumber)).thenReturn(destinationAccount);

        boolean result = bankService.realizeTransfer(originAccountNumber, destinationAccountNumber, transferValue);

        assertTrue(result); // Verifique se a transferência foi bem-sucedida
        verify(bankRepository, times(3)).saveAccount(any(Account.class)); // Ambas as contas devem ser salvas
    }

    @Test
    public void testRealizeTransfer_FailedDebit() {
        int originAccountNumber = 1234;
        int destinationAccountNumber = 5678;
        double balance = 100.0;
        double transferValue = 150.0;

        Account originAccount = new Account(originAccountNumber, balance);
        when(bankRepository.getAccountByAccountNumber(originAccountNumber)).thenReturn(originAccount);

        boolean result = bankService.realizeTransfer(originAccountNumber, destinationAccountNumber, transferValue);

        assertFalse(result); // A transferência não deve ocorrer
        verify(bankRepository, never()).saveAccount(any(Account.class)); // Nenhuma conta deve ser salva
    }

    // Teste para verificar saldo
    @Test
    public void testCheckBalance() {
        int accountNumber = 1234;
        double balance = 100.0;

        Account account = new Account(accountNumber, balance);
        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        double result = bankService.checkBalance(accountNumber);

        assertEquals(balance, result, 0.01); // Verifique se o saldo está correto
    }
}
