package com.company;

public class Account {
    private String name;
    private String phoneNum;
    private int pinCode;
    private double accountBalance;

    public Account() {
    }

    public Account(String name, String phoneNum, int pinCode, double accountBalance) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.pinCode = pinCode;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getPinCode() {
        return pinCode;
    }
    public void deposit(double value){
        accountBalance += value;
    }
    public void widthdraw(double value){
        accountBalance -= value;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", pinCode=" + pinCode +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
