/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class Menu {
    
     Scanner userInput = new Scanner(System.in);
    Calculator calc = new Calculator();
    
    
    public int showMenu(){
        System.out.println("press 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division");
        System.out.println("choose your option");
        int a = userInput.nextInt();
        if(a==1){
            return 1;
        }
        else if(a==2){
            return 2;
        }
        else if(a==3){
            return 3;
        }
        else if(a==4){
            return 4;
        }
        else{
            return -1;
        }
    }
    
    public void handleMenuInput(int menuInput){
        if(menuInput>=1 && menuInput<=4){
            System.out.println("give first input ");
            double m = userInput.nextDouble();
            System.out.println("give second input ");
            double n = userInput.nextDouble();
            if(menuInput==1){
                System.out.println("result "+calc.add(m, n));
            }
            else if(menuInput==2){
                System.out.println("result "+calc.subtract(m, n));
            }
            else if(menuInput==3){
                System.out.println("result "+calc.multiply(m, n));
            }
            else if(menuInput==4){
                System.out.println("result "+calc.divide(m, n));
            }
        }
        else{
            System.out.println("invalid input");
        }
    }
    
}
