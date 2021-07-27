package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<ATM> atmList;
    private List<Account> accountList;


    public Bank() {
    }
    public Bank(String name){
        this.name = name;
        atmList = new ArrayList<>();
        accountList = new ArrayList<>();
        atmList.add(new ATM("A70", 500000));
        atmList.add( new ATM("123", 600000));
        atmList.add( new ATM("QNB", 20000));

    }

    public Bank(String name, List<ATM> atmList) {
        this.name = name;
        this.atmList = atmList;
    }
    public void addAccount(Account e){
        accountList.add(e);
    }

    public List<ATM> getAtmList() {
        return atmList;
    }

    public String getName() {
        return name;
    }

}
