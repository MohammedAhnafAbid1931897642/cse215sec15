/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author ahnaf
 */
public class Calculator {
    
    public double add(double a, double b){
        return a+b;
    }
    public double subtract(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        if(b!=0){
            return a/b;
        }
        else{
            System.out.println("division by zero");
            return -1.0;
        }
    }
    
    
}
