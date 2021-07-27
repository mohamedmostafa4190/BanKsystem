package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account user = new Account("Ali Ahmed", "+2058793145", 4444, 100000);
        Bank bank = new Bank("Bank Misr");
        System.out.println("please choose the nearest ATM to you");
        int choice;
        System.out.println("1- Login with PIN\n 2- Create an Account \n please Enter number of your Choice: ");
        do {
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("please Enter your 4-digit PIN");
                int pinCode = input.nextInt();
                if (pinCode == user.getPinCode()) {
                    System.out.println("\tWelcome," + user.getName() + "\n");
                    System.out.println("1- Deposit\n 2- Withdraw\n 3- press 0 to Exit\n choose number: ");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.println("please Enter how much to Deposit");
                        double depositValue = input.nextDouble();
                        user.deposit(depositValue);
                        System.out.println("Your Account now = " + user.toString());
                    }
                }
            } else if (choice == 2) {
                System.out.println("Creating new Account ....\n");
                System.out.println("please Enter Your name: ");
                String name = input.next();
                System.out.println("please Enter Your phone number: ");
                String phone = input.next();
                System.out.println("please Enter Your 4-digit PIN");
                int newPinCode = input.nextInt();
                bank.addAccount(new Account(name, phone, newPinCode, 0));
                System.out.println("you created an account successfully \n1- press 0 to exit ");

            } else {
                System.out.println("Sorry didn't understand You");
            }
        } while (choice != 0);
    }
}
