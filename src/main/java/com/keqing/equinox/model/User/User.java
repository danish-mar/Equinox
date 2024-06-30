package com.keqing.equinox.model;

public class User {

    // user details [new class usage suggested]
    UserDetails userDetails;

    int userId;
    String username;

    // will be used later for authentication
    String authKey;

    String password;
    Account accountLinked;

    public User(int id, String username, String password, Account accountLinked, UserDetails userDetails) {

        this.userId = id;
        this.username = username;
        this.password = password;
        this.accountLinked = accountLinked;
        this.userDetails = userDetails;

    }

    public boolean isLinkedWithAccount(){
        return accountLinked != null;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }
}
