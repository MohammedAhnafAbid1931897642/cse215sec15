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
public class Rectangle extends GeometricObject {
    
    public double length, width;
    
    Rectangle(){
        
    }
    
    double getLength(){
        return length;
        
    }
    
    void setLength(double length){
        this.length=length;
        
    }
    
    void setWidth(double width){
        this.width=width;
        
    }
    
    double getWidth(){
        return width;
        
    }
    
    double getPerimeter(){
        return(2*(length+width));
        
    }
    
    double getArea(){
        return(length*width);
    }
    
     public String toString(){
        return length+" "+width;
    }
}
