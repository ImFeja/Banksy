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

    public Customer(int accountNum, String name, String address, double balance, double credit, String pin) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.credit = credit;
        this.pin = pin;
        this.accountNum = accountNum;

    }

    public void addBal(double addBal, int accNum) {
        Scanner input = new Scanner(System.in);
        double current = this.getBal();
        this.balance = current + addBal;
    }

    public void subBal(double subBal, int accNum) {
        Scanner input = new Scanner(System.in);
        double current = this.getBal();
        this.balance = current - subBal;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPin() {
        return this.pin;
    }

    public double getCredit() {
        return this.credit;
    }

    public double getBal() {
        return this.balance;
    }

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

//        public static void changeBal(String replaceWith, String type) throws FileNotFoundException, IOException {
//    try {
//      // input the (modified) file content to the StringBuffer "input"
//        BufferedReader file = new BufferedReader(new FileReader("customer.txt"));
//        StringBuffer inputBuffer = new StringBuffer();
//        String line;
//
//        while ((line = file.readLine()) != null) {
//            line = replaceWith;
//            inputBuffer.append(line);
//            inputBuffer.append('\n');
//        }
//        file.close();
//
//         //write the new string with the replaced line OVER the same file
//         FileOutputStream fileOut = new FileOutputStream("customer.txt");
//        fileOut.write(inputBuffer.toString().getBytes());
//        fileOut.close();
//
//    }catch (Exception e) {
//        System.out.println("Oopsiewoopsie, sumtin went wong");
//    }
//}
//    
}
