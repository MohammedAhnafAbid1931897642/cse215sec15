/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;
import java.util.Scanner;

/**
 *
 * @author ahnaf
 */
public class Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter name: ");
        String Name = input.nextLine();
        System.out.println(Name);
        System.out.println("Please enter age: ");
        String Age = input.nextLine();
        System.out.println(Age);
        System.out.println("Please enter department: ");
        String Department = input.nextLine();
        System.out.println(Department);
        System.out.println("Numbers 1 to 10: ");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("Please enter an integer: ");
        int userGivenInteger = input.nextInt();
        input.nextLine(); // consume the newline character
        if(userGivenInteger%2==0){
            System.out.println("Integer is even.");
        }
        else{
            System.out.println("Integer is odd");
        }
        
        
        input.close();
    }
    
}
