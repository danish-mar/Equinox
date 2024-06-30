package com.keqing.equinox.model.User;

import com.keqing.equinox.model.Account;

public class User {

    // user details [new class usage suggested]
    UserDetails userDetails;

    int userId;
    String username;

    // will be used later for authentication
    String authKey;

    String password;
    Account connectedAccount;

    public User(int id, String username, String password, Account accountLinked, UserDetails userDetails) {

        this.userId = id;
        this.username = username;
        this.password = password;
        this.connectedAccount = accountLinked;
        this.userDetails = userDetails;

    }

    public boolean isLinkedWithAccount(){
        return connectedAccount != null;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public void connectAccount(Account accountLinked) {
        this.connectedAccount = accountLinked;
    }

    public void disconnectAccount(){
        connectedAccount = null;
    }

    public Account getConnectedAccount() {
        return connectedAccount;
    }



}
