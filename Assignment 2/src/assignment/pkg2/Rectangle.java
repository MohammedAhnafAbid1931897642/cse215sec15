/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author ahnaf
 */
public class Rectangle {
    //constructing setters and getters for RECTANGLE
    
    //initializing variables
    public static double length, width;
    
    
    
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
    
    
    
    double recPerimeter(Rectangle Rectangle){
        return(2*(Rectangle.length+Rectangle.width));
        
    }
    
    double recArea(Rectangle Rectangle){
        return(Rectangle.length*Rectangle.width);
    }
    
    void drawRectangle(){
        
    }
    
    
    
    
}
