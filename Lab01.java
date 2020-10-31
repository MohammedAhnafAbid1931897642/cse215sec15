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
        System.out.println("Please enter an integer: ");
        int userGivenInteger= input.nextInt();
        input.nextLine();
        System.out.println(userGivenInteger);
        System.out.println("Please enter any string: ");
        String userGivenString = input.nextLine();
        System.out.println(userGivenString);
        input.close();
        
        
    
    }
    
}
