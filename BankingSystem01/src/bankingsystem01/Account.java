/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingsystem01;

/**
 *
 * @author (-_-)(-_-)
 */
public class Account {
        private String name;
    private String accnum;
    private double balance;
    private String passcode;

    // Default constructor
    public Account() {
        this.name = "";
        this.accnum = "";
        this.balance = 0.0;
        this.passcode = "";
    }

    // Parameterized constructor
    public Account(String name, String accnum, double balance, String passcode) {
        this.name = name;
        this.accnum = accnum;
        this.balance = balance;
        this.passcode = passcode;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getAccnum() {
        return accnum;
    }

    public double getBalance() {
        return balance;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccnum(String accnum) {
        this.accnum = accnum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }
    
    public void deposit(double amount) {
    balance += amount;
}
    public void withdraw(double amount) {
    balance -= amount;
}
}
