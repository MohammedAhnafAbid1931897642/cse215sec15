/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;
//importing Java Scanner library
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */

//Creating user interface
public class Interface {
    
    //Constructing objects 
    static User U1= new User();
    static Rectangle R1= new Rectangle();
    static Circle C1= new Circle(); 
    static Triangle T1= new Triangle();
    
    public static void main(String[] args){
        
        //Using setters for user inputs and getters for user outputs
        
        Scanner scan = new Scanner(System.in);
        
        //USER input output
        System.out.println("Enter User name");
        String s=scan.nextLine();
        U1.setName(s);
        
        System.out.println(U1.getName());
        
        
        System.out.println("Enter User id");
        int num=scan.nextInt();
        U1.setId(num);
        
        System.out.println(U1.getId());
        
        System.out.println("Enter User email");
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        U1.setEmail(a);
        
        System.out.println(U1.getEmail());
        
        System.out.println("Email verification: ");
        System.out.println(U1.verifyEmail(U1.getEmail()));
        
        //CIRCLE input output
        System.out.println("Enter Circle radius");
        int rad=sc.nextInt();
        C1.setRadius(rad);
        
        System.out.println(C1.getRadius());
        System.out.println("Circumference of circle: " + C1.circCircumference(C1));
        System.out.println("Area of circle: " + C1.circArea(C1));
        
        //RECTANGLE input output
        System.out.println("Enter Rectangle length: ");
        int len=sc.nextInt();
        R1.setLength(len);
        
        System.out.println(R1.getLength());
        
        System.out.println("Enter Rectangle width: ");
        int wid=sc.nextInt();
        R1.setWidth(wid);
        
        System.out.println(R1.getWidth());
        System.out.println("Perimeter of rectangle: " + R1.recPerimeter(R1));
        System.out.println("Area of rectangle: " + R1.recArea(R1));
        
        //TRIANGLE input output
        System.out.println("Enter Triangle base: ");
        int bas=sc.nextInt();
        T1.setBase(bas);
        
        System.out.println(T1.getBase());
        
        System.out.println("Enter Triangle height: ");
        int hei=sc.nextInt();
        T1.setHeight(hei);
        
        System.out.println(T1.getHeight());
        
        System.out.println("Perimeter of triangle: " + T1.triPerimeter(T1));
                
        System.out.println("Area of triangle: " + T1.triArea(T1));   
    }
    
}
