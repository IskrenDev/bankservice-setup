package org.example;  // Der Buchstabe 'v' am Anfang wurde entfernt

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BankService {
    private List<Account> accounts;

    public BankService(List<Account> accounts, int accountNumberCounter) {
        this.accounts = accounts;
        this.accountNumberCounter = accountNumberCounter;
    }

    public String createAccount (Client client) {
        Account accountToSave = new Account(
                UUID.randomUUID().toString();
        BigDecimal.ZERO;

    );
        accounts.add(accountToSave);
        return accountToSave.getAccountNumber();
    }

    public boolean transferMoney(
            String senderAccountNumber,
            BigDecimal amount,
            String receiverAccountNumber
    ) {
        Account sender = getAccountByAccountNumber(senderAccountNumber);
        Account receiver = getAccountByAccountNumber(receiverAccountNumber);
        if (sender != null && receiver != null) {
            if (amount.compareTo(BigDecimal.ZERO) > 0) {
                    sender.getAccountBalance().compareTo(BigDecimal.ZERO)) > 0)
                }
    }
}
