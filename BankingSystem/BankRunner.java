package com.perscholar.BankingSystem;

public class BankRunner {
    public static void main(String[] args) {
        Bank chase = new Bank();
        SavingAccount savingAccount = new SavingAccount(0206,28000.0,"Vijay",5.0);
        chase.addAccount(savingAccount);

        Bank citiBank = new Bank();
        CheckingAccount checkingAccount = new CheckingAccount(1129,30000.0,"Luxmi",500.0);
        citiBank.addAccount(checkingAccount);

        Transaction<SavingAccount> savingAccountTransaction = new Transaction<>(savingAccount,100,true);
        savingAccountTransaction.execute();

        Transaction<CheckingAccount> checkingAccountTransaction = new Transaction<>(checkingAccount,200,false);
        checkingAccountTransaction.execute();

        System.out.println("Saving Account Balance "+savingAccount.getBalance());
        System.out.println("Checking account balance "+checkingAccount.getBalance());

        System.out.println("Retrieve Account "+chase.getAccount(0206));
        System.out.println("Retrieve Account "+citiBank.getAccount(1129));
    }
}
