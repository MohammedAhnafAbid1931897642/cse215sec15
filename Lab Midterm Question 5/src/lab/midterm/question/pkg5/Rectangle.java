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
public class Rectangle extends GeometricShape{
    
    public static double length, width;
    public static GeometricShape geo;
    
    Rectangle(){
        
    }
    

    
    Rectangle(String color, boolean isFilled, double length, double width){
        this.color=color;
        this.isFilled=isFilled;
        this.length=length;
        this.width=width;
        
    }
    
    
    double recPerimeter(Rectangle Rectangle){
        return(2*(Rectangle.length+Rectangle.width));
        
    }
    
    double recArea(Rectangle Rectangle){
        return(Rectangle.length*Rectangle.width);
    }
    
    public String toString(){
        return (length+width+geo.name+geo.color+geo.isFilled);
    }
    
    
}
