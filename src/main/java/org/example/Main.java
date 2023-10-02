package org.example;

public class Main {
    public static void main(String[] args) {
            Client XXX1 = new Client("Enrico", "Hose", "0001");
            Client XXX2 = new Client("Alex", "Schuh", "0002");
            Client XXX3 = new Client("Iskren", "Hemd", "0003");

             Account account1 = new Account("1", BigDecimal.ZERO, "XXX1");
             Account account2 = new Account("2", BigDecimal.ZERO, "XXX2");
             Account account3 = new Account("3", BigDecimal.ZERO, "XXX3");

             account1.deposit(new BigDecimal("100.00"));
             account1.payout(new BigDecimal("120.00"));
    }
}