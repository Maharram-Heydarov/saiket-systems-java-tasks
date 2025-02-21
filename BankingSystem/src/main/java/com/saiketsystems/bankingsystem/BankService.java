package com.saiketsystems.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankService {
    private final BankAccount account;
    private final List<Transaction> transactions = new ArrayList<>();

    public BankService(BankAccount account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
        transactions.add(new Transaction("Deposit", amount));
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
        transactions.add(new Transaction("Withdrawal", amount));
    }

    public BankAccount getAccount() {
        return account;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
