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

    public Bank() {

    }

    public Bank(String Customer) {

    }
    

    public void checkBal(int n, String filename) {
        try {

            for (Customer m : this.Customer) {

                System.out.println(" " + m.getBal());

            }
        } catch (Exception e) {
            System.err.println("Oopsiewoopsie, sumtin went wong: " + e);
        }
    }

    public void findCustomer(String filename) {
        try {

            Scanner input = new Scanner(new File(filename));
            while (input.hasNext()) {
                for (Customer m : this.Customer) {
                    //adds everything that will be listed
                    int accNum = input.nextInt();
                    input.nextLine();
                    String name = input.nextLine();
                    String address = input.nextLine();
                    int pin = input.nextInt();
                    input.nextLine();
                    int bal = input.nextInt();
                    input.nextLine();
                    boolean type = input.nextBoolean();
                    int lim = input.nextInt();
                    input.nextLine();
                    //if over credit limit track them down

                }
            }
        } catch (Exception e) {
            System.err.println("Oopsiewoopsie, sumtin went wong: " + e);
        }
    }

}
