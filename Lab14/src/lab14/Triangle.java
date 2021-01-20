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
public class Triangle extends GeometricObject{
    double side1, side2, side3, area;
    
    Triangle() {
    }
    

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    
    
    void setArea(double side1, double side2, double side3){
        double s=(side1+side2+side3)/2;
        area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    
    
}
