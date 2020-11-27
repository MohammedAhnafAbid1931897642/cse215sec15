/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;
import java.util.Scanner;

/**
 *
 * @author ahnaf
 */
public class Lab05 {
    

 
    //---------------------TASK 1--------------------------------------------------------------------------------------------
    
    public static int countVowels(String yourString){
        int vowelCount=0;
       
        for(int i=0; i<yourString.length(); i++){
            char ch= yourString.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                vowelCount=vowelCount+1;
            }
         
                
        }
        return vowelCount;
    }
    
    
    //---------------------TASK 2--------------------------------------------------------------------------------------------
    
    public static boolean isPalindrome(String yourString){
        int n= yourString.length();
        char arr1[] = new char [n];
        char arr2[] = new char [n];
        int count=0;
        
        for(int i=0; i<n; i++)//Extracting individual characters from string and putting in array 1 
        {
            arr1[i]=yourString.charAt(i);
            
        }
        
        for(int j=0; j<n; j++) //Storing the REVERSED form of array 1 in array 2
        {
            arr2[n-1-j]=arr1[j];
        }
        
            
                
        
        for(int z=0; z<n; z++) // Checking whether array 1 is a mirror image of array 2, if yes then string is palindrome
        {
            if(arr1[z]==arr2[z])
            {
                count=count+1;
            }
                
        }
        
        if(count==n)
        {
            return true;
        }
        else
            return false;
      
        
        
       
    }
    
    //----------------------------- TASK 3 ---------------------------------------------------------
    static double balance=0;
    static double amount=0;
    
    public static void Deposit(double amount1)
    {
        balance = balance + amount;
        
    }
    
    public static void Withdraw(double amount2)
    {
        balance = balance - amount;
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        str1= sc.nextLine();
        int userinput;
        
        System.out.println("No. of vowels in string: " + countVowels(str1) );
        if(isPalindrome(str1)==true)
            System.out.println("String is a palindrome. ");
        else
            System.out.println("String is not a palindrome. ");
        
        while(true)
        {
            System.out.println("1. Deposit ");
            System.out.println("2. Withdraw ");
            System.out.println("3. Balance ");
            System.out.println("4. Exit ");
            
            userinput= sc.nextInt();
            
            if(userinput==1)
            {
                System.out.println("Enter deposit amount: ");
                amount= sc.nextDouble();
                Deposit(amount);
                
            }
            if(userinput==2)
            {
                System.out.println(" Enter withdraw amount: ");
                amount=sc.nextDouble();
                if(amount>balance)
                {
                    System.out.println(" ERROR: Withdraw amount greater than balance ");
                   
                    
                }
                else
                {
                    Withdraw(amount);
                }
                
            }
            if(userinput==3)
            {
                System.out.println(" Balance: " + balance);
            }
            if(userinput==4)
            {
                break;
            }
            
            
            
        }
    }
}
    
