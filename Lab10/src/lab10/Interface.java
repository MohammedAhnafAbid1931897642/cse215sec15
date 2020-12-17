/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class Interface {
    
        public static void main(String[] args) {
            Scanner inp= new Scanner(System.in);
            Rectangle R1= new Rectangle();
            Triangle T1= new Triangle();
            
            System.out.println("Enter rectangle length: ");
            R1.setLength(inp.nextDouble());
            System.out.println("Enter rectangle width: ");
            R1.setWidth(inp.nextDouble());
            System.out.println("Enter triangle sides: ");
            T1.constructTriangle(inp.nextDouble(),inp.nextDouble(),inp.nextDouble());
            System.out.println();
            
            T1.displayObject(T1);
        }
    
       
    
}
