/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.midterm.question.pkg5;



/**
 *
 * @author ahnaf
 */
public class Triangle extends GeometricShape{
    
    public static double base, height;
    public static GeometricShape geo;
    
    Triangle(){
        
    }
    
    Triangle(String color, boolean isFilled, double base, double height){
        this.color=color;
        this.isFilled=isFilled;
        this.base=base;
        this.height=height;
        
    }
    
    
    double getBase(){
        return base;
    }
    
    void setBase(double base){
        this.base=base;
        
    }
    
    double getHeight(){
        return height;
        
    }
    
    void setHeight(double height){
        this.height=height;
    }
    
    double triPerimeter(Triangle Triangle){
        double side= Math.sqrt(Triangle.base*Triangle.base+Triangle.height*Triangle.height);
        return(Triangle.base+Triangle.height+side);
        
        
    }
    
    double triArea(Triangle Triangle){
        return(0.5*Triangle.base*Triangle.height);
        
    }
    
      public String toString(){
        return (base+height+geo.name+geo.color+geo.isFilled);
    }
    

    
}
