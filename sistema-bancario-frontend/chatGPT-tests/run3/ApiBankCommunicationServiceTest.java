import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

import imd.ufrn.model.api.AccountRequest;
import imd.ufrn.model.api.AccountResponse;
import imd.ufrn.model.api.TransferRequest;

public class ApiBankCommunicationServiceTest {

    @InjectMocks
    private ApiBankCommunicationService apiBankCommunicationService;

    @Mock
    private RestClient restClient;

    private final String baseUrl = "http://localhost:8080/banco";

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateAccount_Success() {
        int accountNumber = 12345;
        int accountType = 1;
        double balance = 1000.0;

        when(restClient.post()
                .uri(eq(baseUrl + "/conta"))
                .contentType(eq(MediaType.APPLICATION_JSON))
                .body(any(AccountRequest.class))
                .retrieve()
                .body(Boolean.class))
                .thenReturn(true);

        boolean result = apiBankCommunicationService.createAccount(accountNumber, accountType, balance);
        assertTrue(result);
        verify(restClient, times(1)).post();
    }

    @Test
    public void testGetAccountByNumber_Success() {
        int accountNumber = 12345;
        AccountResponse mockResponse = new AccountResponse(accountNumber, 1000.0);

        when(restClient.get()
                .uri(eq(baseUrl + "/conta/{accountNumber}"), eq(accountNumber))
                .retrieve()
                .body(AccountResponse.class))
                .thenReturn(mockResponse);

        AccountResponse result = apiBankCommunicationService.getAccountByNumber(accountNumber);
        assertNotNull(result);
        assertEquals(accountNumber, result.getAccountNumber());
        assertEquals(1000.0, result.getBalance());
        verify(restClient, times(1)).get();
    }

    @Test
    public void testCheckBalance_Success() {
        int accountNumber = 12345;
        double expectedBalance = 1000.0;

        when(restClient.get()
                .uri(eq(baseUrl + "/conta/saldo/{accountNumber}"), eq(accountNumber))
                .retrieve()
                .body(Double.class))
                .thenReturn(expectedBalance);

        double result = apiBankCommunicationService.checkBalance(accountNumber);
        assertEquals(expectedBalance, result);
        verify(restClient, times(1)).get();
    }

    @Test
    public void testCredit_Success() {
        int accountNumber = 12345;
        double creditValue = 500.0;
        double expectedBalance = 1500.0;

        when(restClient.put()
                .uri(eq(baseUrl + "/conta/credito/{accountNumber}"), eq(accountNumber))
                .contentType(eq(MediaType.APPLICATION_JSON))
                .body(eq(creditValue))
                .retrieve()
                .body(Double.class))
                .thenReturn(expectedBalance);

        double result = apiBankCommunicationService.credit(accountNumber, creditValue);
        assertEquals(-expectedBalance, result);  // Negativo conforme o método.
        verify(restClient, times(1)).put();
    }

    @Test
    public void testDebit_Success() {
        int accountNumber = 12345;
        double debitValue = 200.0;
        double expectedBalance = 800.0;

        when(restClient.put()
                .uri(eq(baseUrl + "/conta/debito/{accountNumber}"), eq(accountNumber))
                .contentType(eq(MediaType.APPLICATION_JSON))
                .body(eq(debitValue))
                .retrieve()
                .body(Double.class))
                .thenReturn(expectedBalance);

        Optional<Double> result = apiBankCommunicationService.debit(accountNumber, debitValue);
        assertTrue(result.isPresent());
        assertEquals(expectedBalance, result.get());
        verify(restClient, times(1)).put();
    }

    @Test
    public void testDebit_InsufficientFunds() {
        int accountNumber = 12345;
        double debitValue = 2000.0;

        when(restClient.put()
                .uri(eq(baseUrl + "/conta/debito/{accountNumber}"), eq(accountNumber))
                .contentType(eq(MediaType.APPLICATION_JSON))
                .body(eq(debitValue))
                .retrieve()
                .body(Double.class))
                .thenReturn(null);

        Optional<Double> result = apiBankCommunicationService.debit(accountNumber, debitValue);
        assertFalse(result.isPresent());
        verify(restClient, times(1)).put();
    }

    @Test
    public void testTransfer_Success() {
        int originAccountNumber = 12345;
        int destinationAccountNumber = 54321;
        double transferValue = 500.0;

        TransferRequest transferRequest = new TransferRequest(originAccountNumber, destinationAccountNumber, transferValue);

        when(restClient.put()
                .uri(eq(baseUrl + "/conta/transferencia"))
                .contentType(eq(MediaType.APPLICATION_JSON))
                .body(eq(transferRequest))
                .retrieve()
                .body(Boolean.class))
                .thenReturn(true);

        boolean result = apiBankCommunicationService.transfer(originAccountNumber, destinationAccountNumber, transferValue);
        assertTrue(result);
        verify(restClient, times(1)).put();
    }

    @Test
    public void testPayFees_Success() {
        double fee = 10.0;

        apiBankCommunicationService.payFees(fee);
        verify(restClient, times(1)).put();
    }
}
