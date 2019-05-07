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
public class Teller {
    
    public void teller(){
        
    }
    
    public double toUSD(int n){
        return n * 0.75;
    }
    
    public double toEuro(int n){
        return n * 0.66;
    }
    
    public double toYen(int n){
        return n * 82.78;
    }
    
    
    public double fromUSD(int n){
     return n *  1.35;  
    }
    
    public double fromEuro(int n){
        return n* 1.33;
    }
    
    public double fromYen(int n){
        return n * 0.012;
    }
    
    
    
    
    
}
