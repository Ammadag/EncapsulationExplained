package com.example.learningtasks.java;



public class BankAccount {
    private double balance;


    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        account.deposit(300.0);
        System.out.println("Deposited Amount = " + account.getBalance());
        account.withdraw(400.0);
        System.out.println("Withdrawal Amount = " + account.getBalance());
        System.out.println("Your Balance = " + account.getBalance());
    }
}
