/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author ahnaf
 */
public class Triangle extends GeometricObject {
    
    public double side1, side2, side3;
    
    Triangle(){
        
    }
    
    public void constructTriangle(double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        
    }
    
    public double getside1(){
        return side1;
    }
    
    public double getside2(){
        return side2;
    }
    
    public double getside3(){
        return side3;
    }
    
    double getArea(){
        double h=(side1+side2+side3)/2;
        double area= Math.sqrt(h*(h-side1)*(h-side2)*(h-side3));
        return(area);
    }
    
    double getPerimeter(){
        double perimeter=side1+side2+side3;
        return(perimeter);
    }
    
    public String toString(){
        return side1+" "+side2+" "+side3;
    }
}
