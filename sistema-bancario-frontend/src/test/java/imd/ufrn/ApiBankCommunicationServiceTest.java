package imd.ufrn;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;

import imd.ufrn.model.api.AccountRequest;
import imd.ufrn.model.api.AccountResponse;
import imd.ufrn.model.api.TransferRequest;
import imd.ufrn.service.ApiBankCommunicationService;
import imd.ufrn.service.UrlService;

public class ApiBankCommunicationServiceTest {
    @Mock
    private HttpURLConnection connection;

    @Mock
    private UrlService urlServiceMock;

    private URL url;

    @InjectMocks
    private ApiBankCommunicationService apiBankCommunicationService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this); // Inicializa os mocks
        url = new URL("http://testUrl");
        when(apiBankCommunicationService.urlService.createConnection(any())).thenReturn(connection); // Simula a abertura da conexão
         
    }

    @Test
    public void testCreateAccount_Success() throws Exception {
        int accountNumber = 1;
        int accountType = 1;
        double balance = 100.0;
        AccountRequest accountRequest = new AccountRequest(accountNumber, accountType, balance);

        // Simula a resposta da conexão
        when(connection.getResponseCode()).thenReturn(HttpURLConnection.HTTP_OK);
        InputStream inputStream = new ByteArrayInputStream("true".getBytes());
        when(connection.getInputStream()).thenReturn(inputStream);

        boolean result = apiBankCommunicationService.createAccount(accountNumber, accountType, balance);
        assertTrue(result);
        verify(connection, times(1)).getResponseCode();
    }

    @Test
    public void testGetAccountByNumber_Success() throws Exception {
        int accountNumber = 1;
        String mockResponseJson = "{\"accountNumber\": 1, \"balance\": 100.0}";

        // Simula a resposta da conexão
        when(connection.getResponseCode()).thenReturn(HttpURLConnection.HTTP_OK);
        InputStream inputStream = new ByteArrayInputStream(mockResponseJson.getBytes());
        when(connection.getInputStream()).thenReturn(inputStream);

        AccountResponse result = apiBankCommunicationService.getAccountByNumber(accountNumber);
        assertNotNull(result);
        assertEquals(accountNumber, (int) result.getAccountNumber());
        assertEquals(100.0, result.getBalance(), 0.01); 
        verify(connection, times(1)).getResponseCode();
    }

    @Test
    public void testCheckBalance_Success() throws Exception {
        int accountNumber = 1;
        String mockResponseJson = "100.0";

        // Simula a resposta da conexão
        when(connection.getResponseCode()).thenReturn(HttpURLConnection.HTTP_OK);
        InputStream inputStream = new ByteArrayInputStream(mockResponseJson.getBytes());
        when(connection.getInputStream()).thenReturn(inputStream);

        double result = apiBankCommunicationService.checkBalance(accountNumber);
        assertEquals(100.0, result, 0.01);
        verify(connection, times(1)).getResponseCode();
    }

    @Test
    public void testCredit_Success() throws Exception {
        int accountNumber = 1;
        double creditValue = 50.0;
        String mockResponseJson = "150.0";

        // Simula a resposta da conexão
        when(connection.getResponseCode()).thenReturn(HttpURLConnection.HTTP_OK);
        InputStream inputStream = new ByteArrayInputStream(mockResponseJson.getBytes());
        when(connection.getInputStream()).thenReturn(inputStream);

        double result = apiBankCommunicationService.credit(accountNumber, creditValue);
        assertEquals(150.0, result, 0.01);
        verify(connection, times(1)).getResponseCode();
    }

    @Test
    public void testDebit_Success() throws Exception {
        int accountNumber = 1;
        double debitValue = 50.0;
        String mockResponseJson = "50.0";

        // Simula a resposta da conexão
        when(connection.getResponseCode()).thenReturn(HttpURLConnection.HTTP_OK);
        InputStream inputStream = new ByteArrayInputStream(mockResponseJson.getBytes());
        when(connection.getInputStream()).thenReturn(inputStream);

        Optional<Double> result = apiBankCommunicationService.debit(accountNumber, debitValue);
        assertTrue(result.isPresent());
        assertEquals(50.0, result.get(), 0.01);
        verify(connection, times(1)).getResponseCode();
    }

    @Test
    public void testDebit_InsufficientFunds() throws Exception {
        int accountNumber = 1;
        double debitValue = 150.0;

        // Simula a resposta da conexão
        when(connection.getResponseCode()).thenReturn(HttpURLConnection.HTTP_OK);
        InputStream inputStream = new ByteArrayInputStream("null".getBytes());
        when(connection.getInputStream()).thenReturn(inputStream);

        Optional<Double> result = apiBankCommunicationService.debit(accountNumber, debitValue);
        assertFalse(result.isPresent());
        verify(connection, times(1)).getResponseCode();
    }

    @Test
    public void testTransfer_Success() throws Exception {
        int originAccountNumber = 1;
        int destinationAccountNumber = 2;
        double transferValue = 50.0;
        TransferRequest transferRequest = new TransferRequest(originAccountNumber, destinationAccountNumber, transferValue);

        // Simula a resposta da conexão
        when(connection.getResponseCode()).thenReturn(HttpURLConnection.HTTP_OK);
        InputStream inputStream = new ByteArrayInputStream("true".getBytes());
        when(connection.getInputStream()).thenReturn(inputStream);

        boolean result = apiBankCommunicationService.transfer(originAccountNumber, destinationAccountNumber, transferValue);
        assertTrue(result);
        verify(connection, times(1)).getResponseCode();
    }

    @Test
    public void testPayFees_Success() throws Exception {
        double fee = 10.0;

        // Simula a resposta da conexão
        when(connection.getResponseCode()).thenReturn(HttpURLConnection.HTTP_OK);
        InputStream inputStream = new ByteArrayInputStream("true".getBytes());
        when(connection.getInputStream()).thenReturn(inputStream);

        apiBankCommunicationService.payFees(fee);
        verify(connection, times(1)).getResponseCode();
    }
}
