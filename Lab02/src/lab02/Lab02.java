/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class Lab02 {

    /**
     * @param args the command line arguments
     */
    //TASK 1
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer to check for even or odd: ");
        int userGivenInteger = input.nextInt();
        int result= userGivenInteger%2;
        
        switch(result){
            case(0):
                System.out.println("Integer is even");
                break;
            default:
                System.out.println("Integer is odd");
                break;
        
                
                
        }
        //TASK 2
        System.out.println("Please enter an integer to check for prime or not: ");
        int userGivenInteger2 = input.nextInt();
        int flag=0;
        for(int i=1; i<=userGivenInteger2; i++){
            if(userGivenInteger2%i==0){
                flag=flag+1;
            }
        }
        
        switch(flag){
            case(2):
                System.out.println("Integer is prime");
                break;
            default:
                System.out.println("Integer is not prime");
                break;
                
        }
        System.out.println("Please enter decimal number for BMI check: ");
        float userGivenInteger3 = input.nextFloat();
     
        
        //TASK 3 WITH if-else if-else
        if(userGivenInteger3<18.5){
            System.out.println("underweight");
        }
        else{
            if(userGivenInteger3>=18.5&&userGivenInteger3<=24.9){
                    System.out.println("healthy");
            }
            else{
                if(userGivenInteger3>=25&&userGivenInteger3<=29.9){
                    System.out.println("overweight");
                }
                
                else{
                    if(userGivenInteger3>=30&&userGivenInteger3<=39.9){
                        System.out.println("obese");
                        
                        
                    }
                    else{
                        System.out.println("Invalid BMI");
                    }
        }
            
        }
            
        }
        //TASK 3 WITH TERNARY OPERATOR
        String compare1= userGivenInteger3<18.5? "underweight":"";
        System.out.println(compare1);
        String compare2= (userGivenInteger3>=18.5&&userGivenInteger3<=24.9)? "healthy":"";
        System.out.println(compare2);
        String compare3= (userGivenInteger3>=25&&userGivenInteger3<=29.9)? "overweight":"";
        System.out.println(compare3); 
        String compare4= (userGivenInteger3>=30&&userGivenInteger3<=39.9)? "obese":"";
        System.out.println(compare4);
        String compare5= userGivenInteger3>=39.9? "Invalid BMI":"";
        System.out.println(compare5);
        
        
        
                
        
       
        
}
}
