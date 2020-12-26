/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.midterm.question.pkg5;
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class LabMidtermQuestion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricShape g= new GeometricShape();
        Triangle t= new Triangle();
        Rectangle r= new Rectangle();
        
        Scanner inp= new Scanner(System.in);
        
        System.out.println("Enter base, height, length, width, color, isFilled");
        t.base=inp.nextDouble();
        t.height=inp.nextDouble();
        r.length=inp.nextDouble();
        r.width=inp.nextDouble();
        g.color=inp.nextLine();
        g.isFilled=inp.nextBoolean();
                
        
        
        
    }
    
}
