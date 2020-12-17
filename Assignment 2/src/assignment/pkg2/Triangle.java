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
public class Triangle {
    //constructing setters and getters for TRIANGLE
    
    //initializing variables
    
    public static double base, height;
    
    
    
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
    
    void drawTriangle(){
        
    }
    
    
}
