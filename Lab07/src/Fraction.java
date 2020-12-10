/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class Fraction {
    public int numerator;
    public int denominator;
    

    
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }
    
    public void setNumerator(Scanner scan){
        System.out.println("Enter numerator: ");
        this.numerator = scan.nextInt();
    }
    
    public void setDenominator(Scanner scan){
        System.out.println("Enter denominator: ");
        this.denominator=scan.nextInt();
    }
    
    public String toString(){
        return(numerator+"/"+denominator);
    }
    
    public void add(Fraction fraction1, Fraction fraction2){
        int a=fraction1.getNumerator();
        int b=fraction1.getDenominator();
        int c=fraction2.getNumerator();
        int d=fraction2.getDenominator();
        
        numerator=(a*d+c*b);
        denominator=(b*d);
        
        
        
        
    }
    
    public void sub(Fraction fraction1, Fraction fraction2){
        int a=fraction1.getNumerator();
        int b=fraction1.getDenominator();
        int c=fraction2.getNumerator();
        int d=fraction2.getDenominator();
        
        numerator=(a*d-c*b);
        denominator=(b*d);
        
        
        
        
    }
    
    public void multiplication(Fraction fraction1, Fraction fraction2){
        int a=fraction1.getNumerator();
        int b=fraction1.getDenominator();
        int c=fraction2.getNumerator();
        int d=fraction2.getDenominator();
        
        numerator=(a*c);
        denominator=(b*d);
        
        
        
        
    }
    
    public void division(Fraction fraction1, Fraction fraction2){
        int a=fraction1.getNumerator();
        int b=fraction1.getDenominator();
        int c=fraction2.getNumerator();
        int d=fraction2.getDenominator();
        
        numerator=(a*d);
        denominator=(b*c);
        
        
        
        
    }
}
