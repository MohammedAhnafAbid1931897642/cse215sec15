/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

/**
 *
 * @author ahnaf
 */
public class Lab14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle t1= new Triangle();
        Rectangle r1= new Rectangle();
        
        t1.setArea(2.0,2.0,2.0);
        r1.setArea(2.0,2.0);
        
        boolean b=compareArea(t1, r1);
        
        if(b==true)
            System.out.println("Area of triangle is equal to area of rectangle");
        else
            System.out.println("Areas of triangle and rectangle are not equal");
        
        
    }
    
    public static boolean compareArea(GeometricObject t, GeometricObject r){
        if(t.getArea()==r.getArea())
            return true;
        else
            return false;
    }
    
}
