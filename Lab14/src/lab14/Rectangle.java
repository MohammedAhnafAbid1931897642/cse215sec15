/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

/**
 *
 * @author ahnaf
 */
public class Rectangle extends GeometricObject{
    double side1, side2;

    Rectangle() {
   
    }
    
    
    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    
    
    void setArea(double side1, double side2){
        area=side1*side2;
        
    }
    
}
