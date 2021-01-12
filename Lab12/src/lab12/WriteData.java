/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author ahnaf
 */
public class WriteData {
    public static void main(String[] args) throws IOException{
        java.io.File file= new java.io.File("quiz.txt");
        if(file.exists()){
            System.out.println("File already exists!");
            
            
        }
        
        //Create a file
        java.io.PrintWriter output= new java.io.PrintWriter(file);
        
        //Write formatted output to the file
        output.print("113098");
        output.println(" 20");
        output.print("115089");
        output.println(" 15");
        output.print("345678");
        output.println(" 12");
        output.print("234566");
        output.println(" 18");
        
        //Close the file
        output.close();
        
    }
    
}
