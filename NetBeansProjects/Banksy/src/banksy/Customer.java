/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksy;

/**
 *
 * @author OGfej
 */
public class Customer {
    
    private String name;
    private String address;
    private double balance;
    private double credit;
    
    
    public Customer(String name, String address, double balance, double credit){
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.credit = credit;

    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public double getBal(){
       return this.balance;
    }
    
    //Use when making purchase, are you over your credit limit? If it will go over it will return true, so use if = true then block it.
    public boolean overCredit(double b, double n){
        b = this.balance;
        
        if(b - n < this.credit){
            return true;
        }else{
            return false;
        }
        
        
    }
           
    
}
