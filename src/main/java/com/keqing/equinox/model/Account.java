package com.keqing.equinox.model;

import com.keqing.equinox.model.Transaction.Transaction;
import com.keqing.equinox.model.User.User;

import java.util.ArrayList;
import java.util.Objects;

public class Account {

    int accountNumber;
    private float balance = 0;
    User AccountHolder;
    private final int AccountPin;
    boolean isActive = false;

    ArrayList<Transaction> transactions = new ArrayList<>();

    public int getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public User getAccountHolder() {
        return AccountHolder;
    }

    public Account(int accountNumber, int balance, User accountHolder, int accountPin) {
        this.isActive = true;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.AccountHolder = accountHolder;
        this.AccountPin = accountPin;
        accountHolder.connectAccount(this);
    }
}
