package com.juaracoding;

public class BankAccount {

    int acc_no;
    String name;
    double amount;

    public void setAccount(int a, String n, double amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    public double deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
        return amount;
    }


    public double withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdraw");
        }
        return amount;
    }

    public void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    public void display() {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Customer 1 : " + acc_no + " " + name + " " + amount);

    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccount( 271110, "Restu Herlambang", 20000);

        account.display();
        account.checkBalance();

        account.deposit(30000);
        account.checkBalance();

        account.withdraw(10600);
        account.checkBalance();
    }

}
