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
public class ClothingItem extends Product{
    public String fabricType;

    public ClothingItem() {
    }

    
    
    public ClothingItem(String fabricType) {
        this.fabricType = fabricType;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }
    
    @Override
    public void changePrice(double percentage){
        this.price=price*(1-(percentage/100));
        
    }

    @Override
    public String toString() {
        return "ClothingItem{" + "fabricType=" + fabricType + '}';
    }

    @Override
    public void setWarranty(String warranty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    
    
    
}
