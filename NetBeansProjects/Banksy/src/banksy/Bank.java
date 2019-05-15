/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

    //creates a list of customers
    private List<Customer> Customer = new ArrayList<>();
    private int accNumber;

    //is the constructor for bank
    public Bank(String customerList) {
        loadCustomer(customerList);
    }

    //adds to the customers balance when called
    public void addBal(double addBal, int accNum) {
        Scanner input = new Scanner(System.in);
        double current = this.Customer.get(accNum).getBal();
        Customer.get(accNum).balance = current + addBal;
    }

    //subrtacts from the customers balance when called
    public void subBal(double subBal, int accNum) {
        Scanner input = new Scanner(System.in);
        double current = this.Customer.get(accNum).getBal();
        Customer.get(accNum).balance = current - subBal;
    }

    //adds a customer to the customer list
    public Customer addCustomer(String name, String address, double bal, double credit, String pin) {
        Customer aCustomer = new Customer(accNumber, name, address, bal, credit, pin);
        accNumber++;
        this.Customer.add(aCustomer);
        return aCustomer;
    }

    //finds a customer
    public Customer findCustomer(String name, String pin) {
        for (Customer c : this.Customer) {

            if (c.getName().equals(name) && c.getPin().equals(pin)) {
                //found customer
                return c;
            }
        }
        //no customer found
        return null;
    }

    //loads the list of customers
    public void loadCustomer(String filename) {
        try {

            Scanner input = new Scanner(new File(filename));
            while (input.hasNext()) {
                //adds everything that will be listed
                input.nextLine();
                String name = input.nextLine();
                String address = input.nextLine();
                double bal = input.nextDouble();
                input.nextLine();
                double lim = input.nextDouble();
                input.nextLine();
                String pin = input.nextLine();
                Customer customer = addCustomer(name, address, bal, lim, pin);

            }
        } catch (Exception e) {
            System.err.println("Oopsiewoopsie, sumtin went wong in loadCustomer: " + e);
        }
    }

    //updates the customer list
    public void updateCustomer(String filename, int acNum) {
        try {
            Scanner input = new Scanner(new File(filename));
            PrintWriter output = new PrintWriter(new File(filename));

        } catch (Exception e) {

            System.err.println("Oopsiewoopsie, sumtin went wong in updateCustomer ÚwÚ: " + e);

        }
    }

    //saves the custoemrs to the text file
    public void saveCustomers(String filename) {
        try {
            PrintWriter output = new PrintWriter(new File(filename));
            for (Customer c : this.Customer) {
                output.println(c.getAccNum());
                output.println(c.getName());
                output.println(c.getAddress());
                output.println(c.getBal());
                output.println(c.getCredit());
                output.println(c.getPin());
            }
            output.close();

        } catch (Exception e) {
            System.err.println("Oopsiewoopsie, sumtin went wong in saveCustomers: " + e);
        }
    }

}
