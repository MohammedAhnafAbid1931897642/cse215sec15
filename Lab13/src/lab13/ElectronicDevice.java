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
public class ElectronicDevice extends Product{
    public static String model, warranty;

    public ElectronicDevice() {
    }
    
    

    public ElectronicDevice(String model, String warranty) {
        this.model = model;
        this.warranty = warranty;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWarranty() {
        return warranty;
    }
    
    
    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }
    
    
   

    @Override
    public String toString() {
        return "ElectronicDevice{" + "model=" + model + ", warranty=" + warranty + '}';
    }

    @Override
    public void changePrice(double percentage) {
        this.price=price*(1-(percentage/100));
    }
    
    
    
}
