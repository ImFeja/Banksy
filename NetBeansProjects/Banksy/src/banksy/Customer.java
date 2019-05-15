/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksy;

import java.util.Scanner;

/**
 *
 * @author OGfej
 */
public class Customer {

    private String name;
    private String address;
    public double balance;
    private double credit;
    private String pin;
    private int accountNum;

    //id the custructor for a customer
    public Customer(int accountNum, String name, String address, double balance, double credit, String pin) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.credit = credit;
        this.pin = pin;
        this.accountNum = accountNum;

    }

    //adds to the customers balance when called
    public void addBal(double addBal, int accNum) {
        if (addBal > 0) {
            Scanner input = new Scanner(System.in);
            double current = this.getBal();
            this.balance = current + addBal;
        }
    }

    //subrtacts from the customers balance when called
    public void subBal(double subBal, int accNum) {
        Scanner input = new Scanner(System.in);
        double current = this.getBal();
        this.balance = current - subBal;
    }

    //gets the customers name
    public String getName() {
        return this.name;
    }

    //gets the customers address
    public String getAddress() {
        return this.address;
    }

    //gets the customers pin / password
    public String getPin() {
        return this.pin;
    }

    //gets the customers credit 
    public double getCredit() {
        return this.credit;
    }

    //gets the customers balance
    public double getBal() {
        return this.balance;
    }

    //gets the customers account number
    public int getAccNum() {
        return this.accountNum;
    }

    //Use when making purchase, are you over your credit limit? If it will go over it will return true, so use if = true then block it.
    public boolean overCredit(double b, double n) {
        b = this.balance;

        if (b - n < this.credit) {
            return true;
        } else {
            return false;
        }

    }

}
