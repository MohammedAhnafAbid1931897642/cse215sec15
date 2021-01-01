/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class Patient {
    private String name;
    private int age;
    public void setName(String name)
            throws InvalidNameException{
        if(name.length()<3){
            throw new InvalidNameException("Invalid! " + "Name must be longer than 3 characters.");
           
        }
        this.name=name;
        System.out.println("Success!");
        
    }
    public void setAge(int age)
            throws IllegalArgumentException{
        if(age<0){
            throw new IllegalArgumentException("Invalid! " + "Age must be positive.");
           
        }
        this.age=age;
        System.out.println("Success!");
        
    }
    
    public static void main(String[] args)
            throws InvalidNameException{
        Patient p= new Patient();
        try{
            String name;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter patient name: ");
            name=sc.nextLine();
            p.setName(name);
            int age;
          
            System.out.println("Enter patient age: ");
            age=sc.nextInt();
            p.setAge(age);
        }
        catch(InvalidNameException e){
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}