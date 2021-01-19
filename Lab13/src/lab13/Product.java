/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author ahnaf
 */
public abstract class Product{
    public String name;
    public double price=100, percentage;
   

    public Product() {
        
    }
    


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    public abstract void changePrice(double percentage);
    
    public abstract String toString();

    public abstract void setWarranty(String warranty);
    

    

    
 
    
    
    
    
}
