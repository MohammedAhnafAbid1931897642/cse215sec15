/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author ahnaf
 */
public class displayObject {
        public static void displayObject(Object object)
   {
       if(object instanceof Triangle){
           System.out.println("Triangle Area: ");
           double area=((Triangle) object).getArea();
           System.out.println(area);
           
     
       }
       
        if(object instanceof Triangle){
           System.out.println("Triangle Perimeter: ");
           double perimeter=((Triangle) object).getPerimeter();
           System.out.println(perimeter);
           
     
       }
        
        if(object instanceof Triangle){
            System.out.println("Triangle String ");
            System.out.println(((Triangle) object).toString());
        }
        
        if(object instanceof Rectangle){
           System.out.println("Rectangle Area: ");
           double area=((Rectangle) object).getArea();
           System.out.println(area);
           
     
       }
       
        if(object instanceof Rectangle){
           System.out.println("Rectangle Perimeter: ");
           double perimeter=((Rectangle) object).getPerimeter();
           System.out.println(perimeter);
           
     
       }
        
        if(object instanceof Rectangle){
            System.out.println("Rectangle String: ");
            System.out.println(((Rectangle) object).toString());
        }      
}   
}
