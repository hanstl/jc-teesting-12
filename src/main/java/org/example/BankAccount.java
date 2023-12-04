package org.example;

public class BankAccount {

    private int acc_no;
    private String name;
    private double amount;

    public void setAccount(int a, String n, double amt) {
        this.acc_no = a;
        this.name = n;
        this.amount = amt;
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
            System.out.println(amt + " withdrawn");
        }
        return amount;
    }

    public String checkBalance() {
        String cetakBalance = "Balance is: " + String.valueOf(amount);
        return cetakBalance;
    }

    public String display() {
        String cetak = String.valueOf(acc_no) + " " + String.valueOf(name) + " " + String.valueOf(amount);
        return cetak;
    }
}
