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
public class GeometricShape {
    public static String name, color; 
    public static boolean isFilled;
    
    GeometricShape(){
        
    }
    
    GeometricShape(String color){
        this.color=color;
        
    }
    
    GeometricShape(String color, boolean isFilled){
        this.color=color;
        this.isFilled=isFilled;
        
    }
    
    String getColor(){
        return color;
    }
    
    void setColor(String color){
        this.color=color;
        
    }
    
    boolean isFilled(){
        return isFilled;
    }
    
    void setFilled(Boolean isFilled){
        this.isFilled=isFilled;
    }
    
    public String toString(){
        return(name+color+isFilled);
    }
    
}
