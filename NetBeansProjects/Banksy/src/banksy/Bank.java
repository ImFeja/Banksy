/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

    private List<Customer> Customer = new ArrayList<>();
    private static int accNumber = 1;
    private static int pinNum = 1000;

    public Bank(String customerList) {
        loadCustomer(customerList);
    }

    public void addBal(double addBal, int accNum) {
        Scanner input = new Scanner(System.in);
        double current = this.Customer.get(accNum).getBal();
        Customer.get(accNum).balance = current + addBal;
    }

    public void subBal(double subBal, int accNum) {
        Scanner input = new Scanner(System.in);
        double current = this.Customer.get(accNum).getBal();
        Customer.get(accNum).balance = current - subBal;
    }

    public Customer addCustomer(String name, String address, double bal, double credit, boolean type) {
        Customer aCustomer = new Customer(accNumber, name, address, bal, credit, pinNum, type);
        accNumber++;
        pinNum++;
        this.Customer.add(aCustomer);
        return aCustomer;
    }

    public void checkBal(int n, String filename) {
        try {

            for (Customer m : this.Customer) {

                System.out.println(" " + m.getBal());

            }
        } catch (Exception e) {
            System.err.println("Oopsiewoopsie, sumtin went wong *RAWR XD*: " + e);
        }
    }

    public Customer findCustomer(int accNum) {
        for (Customer c : this.Customer) {
            if (c.getAccNum() == accNum) {
                //found customer
                return c;
            }
        }
        //no customer found
        return null;
    }

    public void loadCustomer(String filename) {
        try {

            Scanner input = new Scanner(new File(filename));
            while (input.hasNext()) {

                //adds everything that will be listed
                accNumber = input.nextInt();
                input.nextLine();
                String name = input.nextLine();
                String address = input.nextLine();
                double bal = input.nextDouble();
                input.nextLine();
                pinNum = input.nextInt();
                input.nextLine();
                double lim = input.nextDouble();
                input.nextLine();
                boolean type = input.nextBoolean();
                input.nextLine();
                Customer c = addCustomer(name, address, bal, lim, type);
                //if over credit limit track them down

            }
        } catch (Exception e) {
            System.err.println("Oopsiewoopsie, sumtin went wong *UWU*: " + e);
        }
    }

    public void saveCustomers(String filename) {
        try {
            PrintWriter output = new PrintWriter(new File(filename));
            for (Customer c : this.Customer) {
                output.println(c.getAccNum());
                output.println(c.getName());
                output.println(c.getAddress());
                output.println(c.getBal());
                output.println(c.getPin());
                output.println(c.getCredit());
                output.println(c.getType());

            }
            output.close();
        } catch (Exception e) {
            System.err.println("Oopsiewoopsie, sumtin went wong *OWO*: " + e);
        }
    }

}
