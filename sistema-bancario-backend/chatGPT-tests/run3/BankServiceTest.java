import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import imd.ufrn.model.Account;
import imd.ufrn.model.BonusAccount;
import imd.ufrn.model.SavingsAccount;
import imd.ufrn.repository.BankRepository;

public class BankServiceTest {

    @InjectMocks
    private BankService bankService;

    @Mock
    private BankRepository bankRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateAccount_Success() {
        int accountNumber = 1;
        double balance = 100.0;

        bankService.createAccount(accountNumber, 1, balance);
        verify(bankRepository, times(1)).saveAccount(any(Account.class));
    }

    @Test
    public void testCreateAccount_InvalidAccountType() {
        int accountNumber = 1;
        double balance = 100.0;

        boolean result = bankService.createAccount(accountNumber, 5, balance);
        assertFalse(result);
        verify(bankRepository, times(0)).saveAccount(any(Account.class));
    }

    @Test
    public void testRealizeDebit_Success() {
        int accountNumber = 1;
        double balance = 200.0;
        double debitValue = 50.0;

        Account account = new Account(accountNumber, balance);
        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        Optional<Double> result = bankService.realizeDebit(accountNumber, debitValue);
        assertTrue(result.isPresent());
        assertEquals(150.0, result.get());
        verify(bankRepository, times(1)).saveAccount(account);
    }

    @Test
    public void testRealizeDebit_InsufficientFunds() {
        int accountNumber = 1;
        double balance = 100.0;
        double debitValue = 150.0;

        Account account = new Account(accountNumber, balance);
        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        Optional<Double> result = bankService.realizeDebit(accountNumber, debitValue);
        assertFalse(result.isPresent());
        verify(bankRepository, times(0)).saveAccount(account);
    }

    @Test
    public void testRealizeCredit_Success() {
        int accountNumber = 1;
        double balance = 100.0;
        double creditValue = 50.0;

        Account account = new Account(accountNumber, balance);
        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        double result = bankService.realizeCredit(accountNumber, creditValue, false);
        assertEquals(150.0, result);
        verify(bankRepository, times(1)).saveAccount(account);
    }

    @Test
    public void testRealizeTransfer_Success() {
        int originAccountNumber = 1;
        int destinationAccountNumber = 2;
        double balance = 200.0;
        double transferValue = 50.0;

        Account originAccount = new Account(originAccountNumber, balance);
        Account destinationAccount = new Account(destinationAccountNumber, balance);
        when(bankRepository.getAccountByAccountNumber(originAccountNumber)).thenReturn(originAccount);
        when(bankRepository.getAccountByAccountNumber(destinationAccountNumber)).thenReturn(destinationAccount);

        boolean result = bankService.realizeTransfer(originAccountNumber, destinationAccountNumber, transferValue);
        assertTrue(result);
        assertEquals(150.0, originAccount.getBalance());
        assertEquals(250.0, destinationAccount.getBalance());
        verify(bankRepository, times(2)).saveAccount(any(Account.class));
    }

    @Test
    public void testCheckBalance() {
        int accountNumber = 1;
        double balance = 100.0;

        Account account = new Account(accountNumber, balance);
        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        double result = bankService.checkBalance(accountNumber);
        assertEquals(balance, result);
    }

    @Test
    public void testPayFees() {
        Map<Integer, Account> accounts = mock(Map.class);
        Account savingsAccount = new SavingsAccount(1, 100.0);

        when(bankRepository.findAll()).thenReturn(accounts);
        when(accounts.entrySet()).thenReturn(Map.of(1, savingsAccount).entrySet());

        bankService.payFees(10.0);
        assertEquals(110.0, savingsAccount.getBalance());
        verify(bankRepository, times(1)).saveAccount(savingsAccount);
    }
}
