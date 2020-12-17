/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;
import java.lang.Math; //Importing the maths library for square root function
/**
 *
 * @author ahnaf
 */
public class Triangle extends GeometricObject{

    public float side1,side2,side3;
    
    public Triangle(){
    
    }
    
    void setTriangle(float s1, float s2, float s3){
        this.side1=s1;
        this.side2=s2;
        this.side3=s3; 
    }
    
    float getside1(){
        return side1;
    }
    
    float getside2(){
        return side2;
    }
    
    float getside3(){
        return side3;
    }
    
    double getArea(){
        float h=(side1+side2+side3)/2;
        double area= Math.sqrt(h*(h-side1)*(h-side2)*(h-side3));
        return(area);
    }
    
    float getPerimeter(){
        return(side1+side2+side3);
    }
    
    public String toString(){
        return side1+" "+side2+" "+side3;
    }
    
}
