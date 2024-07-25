package com.perscholar.BankingSystem;

public class Account<T> {

    private Integer accountNumber;
    private double balance;
    private T accountHolder;

    public Account(Integer accountNumber, double balance, T accountHolder){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public T getAccountHolder() {
        return accountHolder;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountHolder(T accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public String toString(){
        return "Account { Account Number "+ accountNumber+
                ", accountHolder "+accountHolder+
                ",balance "+balance+ "}";
    }

}
