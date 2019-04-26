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
    
    private List<Customer> Customer= new ArrayList<>();
    
    public Bank(){
        
    }
    
    public Bank(String Customer){
        
    }
    
    
    
    
    
    
    
    
    
    public void checkBal(int n, String filename){
        try{
            
            for(Customer m: this.Customer){
            
            System.out.println(" " + m.getBal() );
            
            }
        }catch(Exception e){
            System.err.println("Oopsiewoopsie, sumtin went wong: " +e);
        }
    }
    
    
    public void findCustomer(int n, String filename){
        try{
            
            Scanner output = new Scanner(new File(filename));
            
            for(Customer m: this.Customer){
                
                    
                
            }
            
        }catch(Exception e){
            System.err.println("Oopsiewoopsie, sumtin went wong: " + e);
        }
    }
    
    
}
