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
public class Menu {
    
    public void showMenu(){
         Scanner inp=  new Scanner(System.in);
         Rectangle R1= new Rectangle();
         Triangle T1=  new Triangle();
            
        System.out.println("Enter rectangle length: ");
        R1.setLength(inp.nextDouble());
        System.out.println("Enter rectangle width: ");
        R1.setWidth(inp.nextDouble());
        System.out.println("Enter triangle sides: ");
        System.out.println("Enter triangle side 1: ");
        double s1=inp.nextDouble();
        System.out.println("Enter triangle side 2: ");
        double s2=inp.nextDouble();
        System.out.println("Enter triangle side 3: ");
        double s3=inp.nextDouble();
        T1.constructTriangle(s1,s2,s3);
        
        displayObject.displayObject(R1);
        displayObject.displayObject(T1);
          
}
}
