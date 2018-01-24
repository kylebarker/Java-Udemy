package com.kylebarker;

public class Bank_Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //************************************************
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
    //************************************************
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalanace(){
        return this.balance;
    }
    //************************************************
    public void setCustomerName(String name){
        this.customerName = name;
    }

    public String getName(){
        return this.customerName;
    }
    //************************************************
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }
    //************************************************
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    //************************************************

    


}
