/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahnaf
 */
public class Main{
    
    public static void main(String args[]){
        
        String warranty;
        
        Product p1 = new ElectronicDevice();
        ClothingItem p2 = new ClothingItem();
        ElectronicDevice p3 = new ElectronicDevice();
        
        p3.changePrice(10);
        p2.changePrice(-20);
        
        
        p1.setWarranty("6 months");
        
        List<Product> l1= new ArrayList<>();
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        
        for(int i=0; i<l1.size(); i++){
            Product p= l1.get(i);
        
            System.out.println(p.toString());
        }
        
        
        
    }

   
    
    
}
