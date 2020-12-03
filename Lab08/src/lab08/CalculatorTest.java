/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author ahnaf
 */
public class CalculatorTest {
    
    public static void main(String[] args){
        Menu men = new Menu();
        int a = men.showMenu();
        men.handleMenuInput(a);
    }
    
}
