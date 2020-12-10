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
public class House {
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to the House Total Area Calculator!");
        System.out.println();

        Scanner user_input = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            /**
            creates 4 instances(objects) of the rectangle class.
            each instance represents a room in a 4 bedroom house
            */
            Rectangle r1 = new Rectangle();
            Rectangle r2 = new Rectangle();
            Rectangle r3 = new Rectangle();
            Rectangle r4 = new Rectangle();

            // get input for length / width of each room from the user 
                //room 1
            System.out.println("Enter length and Width of room 1: ");
            r1.setLength(user_input);
            r1.setWidth(user_input);
            System.out.println();

                //room 2
            System.out.println("Enter length and width of room 2: ");
            r2.setLength(user_input);
            r2.setWidth(user_input);
            System.out.println();

                //room 3
            System.out.println("Enter length and width of room 3: ");
            r3.setLength(user_input);
            r3.setWidth(user_input);
            System.out.println();

                //room 4
            System.out.println("Enter length and width of room 4: ");
            r4.setLength(user_input);
            r4.setWidth(user_input);
            System.out.println();

            double totalArea = r1.getArea() * r2.getArea() * r3.getArea() * r4.getArea();
            System.out.println("The total area of all rooms in the house is: " + totalArea);

            // ask if user wants to continue or exit the program
            System.out.print("Continue? (y/n): ");
            choice = user_input.next();
            System.out.println();
        }
        
    }
    
    
    
}
