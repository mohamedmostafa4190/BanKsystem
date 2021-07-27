package com.company;

public class ATM {
    private String name;
    private double cashCap;

    public ATM() {
    }

    public ATM(String name, double cashCap) {
        this.name = name;
        this.cashCap = cashCap;
    }

    public String getName() {
        return name;
    }

    public double getCashCap() {
        return cashCap;
    }

    public void setCashCap(double cashCap) {
        this.cashCap = cashCap;
    }
}
