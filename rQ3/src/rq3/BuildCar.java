/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rq3;

/**
 *
 * @author ahnaf
 */
public class BuildCar {
    String registration_no;
    String color;
    boolean is_Purchased;

    public BuildCar() {
    }

    public BuildCar(String color) {
        this.color = color;
    }

    public BuildCar(String color, boolean is_Purchased) {
        this.color = color;
        this.is_Purchased = is_Purchased;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIs_Purchased() {
        return is_Purchased;
    }

    public void setIs_Purchased(boolean is_Purchased) {
        this.is_Purchased = is_Purchased;
    }
    
    public void setPurchasedStatus(boolean is_Purchased){
        is_Purchased=true;
    }

    @Override
    public String toString() {
        return "BuildCar{" + "registration_no=" + registration_no + ", color=" + color + ", is_Purchased=" + is_Purchased + '}';
    }
    
    
    
}
