package com.keqing.equinox;


import com.keqing.equinox.model.Account;
import com.keqing.equinox.model.User.User;
import com.keqing.equinox.model.User.UserDetails;

public class Main {
    public static void main(String[] args) {

        User user = new User(0,"denizuh","keqing123",null,new UserDetails("Danish","K","danishs2007@gmail.com", "9503458883","new osmanpura, aurangabad"));

        Account account = new Account(1,500,user,1412);

        System.out.println("Account : " + account.getAccountNumber());
        System.out.println("|-- Account Holder's Name : " + user.getConnectedAccount().getAccountHolder().getUserDetails().getFullName());
        System.out.println("|-------- "+"Account Balance : $ " + user.getConnectedAccount().getBalance());


    }
}