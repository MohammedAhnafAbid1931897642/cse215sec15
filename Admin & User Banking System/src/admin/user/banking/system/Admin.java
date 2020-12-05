/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.user.banking.system;
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class Admin {
    
    static String Name="John";
    private int account_num=1899972654;
    static private int balance=0;
    static int amount;
    
    public static void Deposit(int amount1)
    {
        balance = balance + amount;
        
    }
    
    public static void Withdraw(int amount2)
    {
        balance = balance - amount;
        
    }
    
    public static void Exit()
    {
        while(true)
        {
            break;
        }
        
    
    }
    
    public static int checkBalance()
    {
        return balance;
        
        
    }
    
    
    
     Scanner userInput = new Scanner(System.in);
     
    
    
    public int showMenu(){
        while(true){
        System.out.println("Press 1 for Deposit: , 2 for Withdraw, 3 for checkBalance and 4 for Exit");
        System.out.println("choose your option: ");
        int a = userInput.nextInt();
        switch (a){
            case 1:
                handleMenuInput(1);
                break;
                
            case 2:
                handleMenuInput(2);
                break;
                
            case 3:
                handleMenuInput(3);
                break;
            case 4:
                handleMenuInput(4);
                
            default:
                return 0;
            }
        }
    }

    
 
    
   
    
    public void handleMenuInput(int menuInput){
        while(true)
        {
            
            
            
            
            
            if(menuInput==1)
            {
                System.out.println("Enter deposit amount: ");
                amount= userInput.nextInt();
                Deposit(amount);
                System.out.println(" Deposited: " + amount + " against Acc Name: " + Name + " Acc no: " + account_num);
                break;
                
                
            }
            if(menuInput==2)
            {
                System.out.println(" Enter withdraw amount: ");
                amount=userInput.nextInt();
                if(amount>balance)
                {
                    System.out.println(" ERROR: Withdraw amount greater than balance ");
                    break;
                    
                   
                    
                }
                else
                {
                    Withdraw(amount);
                    System.out.println(" Withdrawn: " + amount + " against Acc Name: " + Name + " Acc no: " + account_num);
                    break;
                    
                }
                
            }
            if(menuInput==3)
            {
                System.out.println(" Balance: " + checkBalance() + " Acc Name: " + Name + " Acc no: " + account_num);
                break;
                
            }
            if(menuInput==4)
            {
                Exit();
                break;
                
            }
            
            
            
        }
    }
    
}

    
    
    
   
    

    

