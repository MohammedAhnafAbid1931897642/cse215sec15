/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg2;
import java.lang.Math;
/**
 *
 * @author ahnaf
 */
public class MyRectangle2D {
    private double x,y, height, width;
    
    void setHeight(){
        this.height=height;
        
    }
    
    double getHeight(){
        return height;
        
    }
    
    void setWidth(){
      this.width=width;
        
    }
    
    double getWidth(){
        return width;
        
    }
    
    MyRectangle2D(){
        this.x=0;
        this.y=0;
        this.width=1;
        this.height=1;
        
    }
    
    void constructRectangle(double x, double y, double width, double height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        
        
    }
    
    double getArea(){
        return(width*height);
    }
    
    double getPerimeter(){
        return(2*(width+height));
    }
    
    boolean contains(double x, double y){
        if(Math.sqrt(x*x+y*y)==Math.sqrt(this.x*this.x+this.y*this.y))
            return true;
        else
            return false;
        
    }
    
    boolean contains(MyRectangle2D r){
        if(Math.sqrt(r.height*r.height+r.width*r.width)==Math.sqrt(this.height*this.height+this.width*this.width))
            return true;
        else
            return false;
           
        
    }
    
    
}
