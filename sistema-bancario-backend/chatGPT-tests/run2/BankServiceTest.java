import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.Optional;
import java.util.HashMap;

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

    @Mock
    private BankRepository bankRepository;

    @InjectMocks
    private BankService bankService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    // Test for creating an account
    @Test
    void testCreateAccount_AccountCreatedSuccessfully() {
        int accountNumber = 1;
        int accountType = 1; // Regular account
        double balance = 500.0;

        boolean result = bankService.createAccount(accountNumber, accountType, balance);

        assertTrue(result);
        verify(bankRepository, times(1)).saveAccount(any(Account.class));
    }

    @Test
    void testCreateAccount_InvalidAccountType() {
        int accountNumber = 1;
        int accountType = 99; // Invalid account type
        double balance = 500.0;

        boolean result = bankService.createAccount(accountNumber, accountType, balance);

        assertFalse(result);
        verify(bankRepository, never()).saveAccount(any(Account.class));
    }

    // Test for realizing debit
    @Test
    void testRealizeDebit_Success() {
        int accountNumber = 1;
        double balance = 500.0;
        double debitValue = 200.0;
        Account account = new Account(accountNumber, balance);

        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        Optional<Double> result = bankService.realizeDebit(accountNumber, debitValue);

        assertTrue(result.isPresent());
        assertEquals(300.0, result.get());
        verify(bankRepository, times(1)).saveAccount(account);
    }

    @Test
    void testRealizeDebit_InsufficientBalance() {
        int accountNumber = 1;
        double balance = 100.0;
        double debitValue = 200.0;
        Account account = new Account(accountNumber, balance);

        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        Optional<Double> result = bankService.realizeDebit(accountNumber, debitValue);

        assertFalse(result.isPresent());
        verify(bankRepository, never()).saveAccount(any(Account.class));
    }

    // Test for realizing credit
    @Test
    void testRealizeCredit_Success() {
        int accountNumber = 1;
        double balance = 500.0;
        double creditValue = 200.0;
        Account account = new Account(accountNumber, balance);

        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        double result = bankService.realizeCredit(accountNumber, creditValue, false);

        assertEquals(700.0, result);
        verify(bankRepository, times(1)).saveAccount(account);
    }

    @Test
    void testRealizeCredit_InvalidValue() {
        int accountNumber = 1;
        double balance = 500.0;
        double creditValue = -100.0; // Invalid credit value
        Account account = new Account(accountNumber, balance);

        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        double result = bankService.realizeCredit(accountNumber, creditValue, false);

        assertEquals(balance, result);
        verify(bankRepository, never()).saveAccount(any(Account.class));
    }

    // Test for realizing transfer
    @Test
    void testRealizeTransfer_Success() {
        int originAccountNumber = 1;
        int destinationAccountNumber = 2;
        double originBalance = 500.0;
        double destinationBalance = 300.0;
        double transferValue = 100.0;

        Account originAccount = new Account(originAccountNumber, originBalance);
        Account destinationAccount = new Account(destinationAccountNumber, destinationBalance);

        when(bankRepository.getAccountByAccountNumber(originAccountNumber)).thenReturn(originAccount);
        when(bankRepository.getAccountByAccountNumber(destinationAccountNumber)).thenReturn(destinationAccount);

        boolean result = bankService.realizeTransfer(originAccountNumber, destinationAccountNumber, transferValue);

        assertTrue(result);
        verify(bankRepository, times(2)).saveAccount(any(Account.class)); // Both accounts should be saved
    }

    @Test
    void testRealizeTransfer_InsufficientFunds() {
        int originAccountNumber = 1;
        int destinationAccountNumber = 2;
        double originBalance = 100.0;
        double transferValue = 200.0;

        Account originAccount = new Account(originAccountNumber, originBalance);

        when(bankRepository.getAccountByAccountNumber(originAccountNumber)).thenReturn(originAccount);

        boolean result = bankService.realizeTransfer(originAccountNumber, destinationAccountNumber, transferValue);

        assertFalse(result);
        verify(bankRepository, never()).saveAccount(any(Account.class));
    }

    // Test for checking balance
    @Test
    void testCheckBalance() {
        int accountNumber = 1;
        double balance = 500.0;
        Account account = new Account(accountNumber, balance);

        when(bankRepository.getAccountByAccountNumber(accountNumber)).thenReturn(account);

        double result = bankService.checkBalance(accountNumber);

        assertEquals(balance, result);
    }

    // Test for paying fees
    @Test
    void testPayFees() {
        double fee = 2.0; // 2% fee

        Account savingsAccount1 = new SavingsAccount(1, 1000.0);
        Account savingsAccount2 = new SavingsAccount(2, 2000.0);

        Map<Integer, Account> accounts = new HashMap<>();
        accounts.put(1, savingsAccount1);
        accounts.put(2, savingsAccount2);

        when(bankRepository.findAll()).thenReturn(accounts);

        bankService.payFees(fee);

        assertEquals(1020.0, savingsAccount1.getBalance());
        assertEquals(2040.0, savingsAccount2.getBalance());
        verify(bankRepository, times(2)).saveAccount(any(Account.class));
    }
}