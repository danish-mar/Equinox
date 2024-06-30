package com.keqing.equinox.model.Transaction;

import com.keqing.equinox.model.Account;

import java.security.Timestamp;

public class Transaction {
    int transactionId;
    Timestamp timestamp;
    float amount;
    Account initiatedBy;
    Account initiatedTo;
    String transactionType;
    boolean transactionCompleted;
    boolean transactionFailed;
    String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public boolean isTransactionCompleted() {
        return transactionCompleted;
    }

    public void setTransactionCompleted(boolean transactionCompleted) {
        this.transactionCompleted = transactionCompleted;
    }

    public boolean isTransactionFailed() {
        return transactionFailed;
    }

    public void setTransactionFailed(boolean transactionFailed) {
        this.transactionFailed = transactionFailed;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public float getAmount() {
        return amount;
    }

    public Account getInitiatedBy() {
        return initiatedBy;
    }

    public Account getInitiatedTo() {
        return initiatedTo;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public Transaction(int transactionId, Timestamp timestamp, float amount, Account initiatedBy, Account initiatedTo) {
        this.transactionId = transactionId;
        this.timestamp = timestamp;
        this.amount = amount;
        this.initiatedBy = initiatedBy;
        this.initiatedTo = initiatedTo;
        if(amount < 0){
            this.transactionType = "debit";
        }else{
            this.transactionType = "credit";
        }
    }
}
