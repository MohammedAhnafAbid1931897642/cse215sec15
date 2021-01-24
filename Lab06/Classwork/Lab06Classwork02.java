/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06.classwork02;
import java.util.Scanner;

/**
 *
 * @author ferdous
 */
public class Lab06Classwork02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the maximum number:");
        int maxNumber = input.nextInt();
	int previousNumber = 0;
	int nextNumber = 1;
		 
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	for (int i=1;i<=maxNumber;i++)
	{
	    System.out.print(previousNumber+" ");
	            
            int sum = previousNumber + nextNumber;
	    previousNumber = nextNumber;
	    nextNumber = sum;
    }
    
}
}   
