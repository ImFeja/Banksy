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
    private int credit;
    
    
    public Customer(String name, String address, double balance, int credit){
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
           
    
}
