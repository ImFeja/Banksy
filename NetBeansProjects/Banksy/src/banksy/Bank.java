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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

    private List<Customer> Customer = new ArrayList<>();
    private static int accNumber;

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

    public Customer addCustomer(String name, String address, double bal, double credit, String pin) {
        Customer aCustomer = new Customer(accNumber, name, address, bal, credit, pin);
        accNumber++;
        this.Customer.add(aCustomer);
        return aCustomer;
    }

    public void checkBal(int n, String filename) {
        try {

            for (Customer m : this.Customer) {

                System.out.println(" " + m.getBal());

            }
        } catch (Exception e) {
            System.err.println("Oopsiewoopsie, sumtin went wong in checkBal: " + e);
        }
    }

    public Customer findCustomer(String name, String pin) {
        for (Customer c : this.Customer) {
            System.out.println(c.getName());
            if (c.getName().equals(name) && c.getPin().equals(pin)) {
                //found customer
                return c;
            }
        }
        //no customer found
        return null;
    }

//    public Customer loginCustomer(String name, String pin){
//          for (Customer c : this.Customer) {
//            if (c.getName().equals(name) && c.getPin().equals(pin)) {
//                //found customer
//                return c;
//            }
//        }
//        //Couldn't log in
//        return null;
//    }
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
//                    //if over credit limit track them down
//                    if(m.overCredit(m.getBal(), m.getCredit())){
//                        
//                    }
                Customer customer = addCustomer(name, address, bal, lim, pin);

            }
        } catch (Exception e) {
            System.err.println("Oopsiewoopsie, sumtin went wong in loadCustomer: " + e);
        }
    }

    public void updateCustomer(String filename, int acNum) {
        try {
            Scanner input = new Scanner(new File(filename));
            PrintWriter output = new PrintWriter(new File(filename));
            
            

        } catch (Exception e) {
            
            System.err.println("Oopsiewoopsie, sumtin went wong in updateCustomer ÚwÚ: " + e);

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
                output.println(c.getCredit());
                output.println(c.getPin());
            }
            output.close();

        } catch (Exception e) {
            System.err.println("Oopsiewoopsie, sumtin went wong in saveCustomers: " + e);
        }
    }
    
    //public static void changeBal(String replaceWith, String type) {
    //try {
      //  // input the (modified) file content to the StringBuffer "input"
        //BufferedReader file = new BufferedReader(new FileReader("customer.txt"));
        //StringBuffer inputBuffer = new StringBuffer();
        //String line;

       // while ((line = file.readLine()) != null) {
         //   line = replaceWith;
           // inputBuffer.append(line);
            //inputBuffer.append('\n');
        //}
        //file.close();

        // write the new string with the replaced line OVER the same file
        //FileOutputStream fileOut = new FileOutputStream("customer.txt");
        //fileOut.write(inputBuffer.toString().getBytes());
        //fileOut.close();

    //} catch (Exception e) {
       // System.out.println("Problem reading file.");
    //}
//}
    

}
