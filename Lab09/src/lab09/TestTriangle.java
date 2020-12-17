/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
class TestTriangle{
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp= new Scanner(System.in);
        
        Triangle T1=new Triangle();
        
        float si1, si2, si3;
        System.out.println("Enter side 1, side 2 and side 3: ");
        si1=inp.nextFloat();
        si2=inp.nextFloat();
        si3=inp.nextFloat();
        T1.setTriangle(si1,si2,si3);
        
        System.out.println("Enter color: ");
        Scanner sc= new Scanner(System.in);
        String col= sc.nextLine();
        T1.setColor(col);
        System.out.println("Color: " + T1.getColor());
        
        System.out.println("Filled? Enter 1 for true or 0 for false: ");
        int a = sc.nextInt();
        boolean b=true;
        if(a==1)
            b=true;
            T1.setFilled(b);
        if(a==0)
            b=false;
            T1.setFilled(b);

        System.out.println("Area: " + T1.getArea());
        
        System.out.println("Perimeter: " + T1.getPerimeter());
        
        
        System.out.println("Filled: " + T1.getFilled());
        
    }
    
}
