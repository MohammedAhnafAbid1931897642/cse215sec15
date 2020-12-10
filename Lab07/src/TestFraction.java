
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahnaf
 */
public class TestFraction {
    
    public static void main(String[] args) {
        Fraction F1= new Fraction(); // 1st fraction as object of Fraction
        Fraction F2= new Fraction(); // 2nd fraction as object of Fraction
        Fraction F3= new Fraction(); // 3rd fraction as object of Fraction 
        
        Scanner user_input = new Scanner(System.in);
        
        System.out.println("Enter numerator and denominator of Fraction 1: ");
            F1.setNumerator(user_input);
            F1.setDenominator(user_input);
            System.out.println();
        
            
        System.out.println("Enter numerator and denominator of Fraction 2: ");
            F2.setNumerator(user_input);
            F2.setDenominator(user_input);
            System.out.println();
            
        System.out.println("F1: ");
        System.out.println(F1);
        
        System.out.println("F2: ");
        System.out.println(F2);
        
        System.out.println("Adding Fraction 1 and Fraction 2: ");
        F3.add(F1, F2);
        System.out.println(F3);
        
        System.out.println("Subtracting Fraction 2 from Fraction 1: ");
        F3.sub(F1, F2);
        System.out.println(F3);
        
        System.out.println("Multiplying Fraction 1 by Fraction 2: ");
        F3.multiplication(F1, F2);
        System.out.println(F3);
        
        System.out.println("Dividing Fraction 1 by Fraction 2: ");
        F3.division(F1, F2);
        System.out.println(F3);
                                                           
        
        
        
        
    
    }
    
}
