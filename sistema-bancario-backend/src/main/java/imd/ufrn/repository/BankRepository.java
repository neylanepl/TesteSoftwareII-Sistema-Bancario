package imd.ufrn.repository;

import imd.ufrn.model.Account;

import java.util.HashMap;
import java.util.Map;

public class BankRepository {

    private Map<Integer, Account> accountStorage = new HashMap<>();

    // Método para salvar uma conta no repositório
    public void saveAccount(Account account) {
        accountStorage.put(account.getAccountNumber(), account);
    }

    // Método para recuperar uma conta pelo número da conta
    public Account getAccountByAccountNumber(int accountNumber) {
        return accountStorage.get(accountNumber);
    }

    // Método para obter todas as contas
    public Map<Integer, Account> findAll() {
        return accountStorage;
    }
}
