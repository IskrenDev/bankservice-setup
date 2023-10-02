package org.example;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private String accountNumber;

    private BigDecimal accountBalance;

    private String client;

//Geld einzahlen
    public void deposit(BigDecimal balance) {
        this.accountBalance = this.accountBalance.add(balance); //hier wird addiert mit add
        System.out.println("Einzahlung: " + balance + "€\n");
        System.out.println("Aktueller Kontostand von " + this.client + ": " + this.accountBalance + " €\n");
    }

    //Geld abheben
    public void payout(BigDecimal balance) {
        if (this.accountBalance.compareTo(balance)<0) {
            System.out.println("Auszahlung nicht möglich");
            return;
        }
        this.accountBalance = this.accountBalance.subtract(balance);
        System.out.println("Auszahlung: " + balance + " €\n");
        System.out.println("Aktueller Kontostand von " + this.client + ": " + this.accountBalance + " €\n");
    }

    public Account(String accountNumber, BigDecimal accountBalance, String client) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(accountBalance, account.accountBalance) && Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountBalance, client);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", client='" + client + '\'' +
                '}';
    }

}
