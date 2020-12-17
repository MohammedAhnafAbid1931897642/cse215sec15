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
public class displayObject extends GeometricObject{
    
    public double displayObject(Object object)
   {
       if(object instanceof Triangle)
       {
           double area=((Triangle) object).getArea();
           return area;
           
     
       }
       
        if(object instanceof Triangle){
           double perimeter=((Triangle) object).getPerimeter();
           return perimeter;
           
     
       }
        
        if(object instanceof Triangle){
            System.out.print(((Triangle) object).toString());
        }
        
        
        return 0;
        
   
       
   
       
     
   }
}
