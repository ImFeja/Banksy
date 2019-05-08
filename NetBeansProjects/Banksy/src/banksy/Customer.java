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
    private boolean type; //true = credit, false equals checking

    public Customer(String name, String address, double balance, double credit, String pin, boolean type) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.credit = credit;
        this.pin = pin;

    }

    public void addBal(double addBal, int accNum) {
        Scanner input = new Scanner(System.in);
        double current = this.getBal();
        balance = current + addBal;
    }

    public void subBal(double subBal, int accNum) {
        Scanner input = new Scanner(System.in);
        double current = this.getBal();
        balance = current - subBal;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }
    
    public String getPin(){
        return this.pin;
    }
    
    public double getCredit(){
        return this.credit;
    }
       

    public double getBal() {
        return this.balance;
    }
    
    public boolean getType(){
        return this.type;
        
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
