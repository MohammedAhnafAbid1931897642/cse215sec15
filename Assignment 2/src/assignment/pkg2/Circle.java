/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;
//importing Java Maths library
import java.lang.Math; 
/**
 *
 * @author ahnaf
 */
public class Circle {
    //constructing setters and getters for CIRCLE
    
    //initializing variables
    
    public static double radius;
    
  
    
    double getRadius(){
        return radius;
    }
    
    void setRadius(double radius){
        this.radius=radius;
    }
    
    double circCircumference(Circle Circle){
        return(2*Math.PI*Circle.radius);
    }
    
    double circArea(Circle Circle){
        return(Math.PI*radius*radius);
        
    }
    void drawCircle(){
        
    }
}
