/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;

/**
 *
 * @author ahnaf
 */
//IllegalIncome custom exception
public class IllegalIncome extends Exception{
    public IllegalIncome(){
        super();
    }
    public IllegalIncome(String message){
        super(message);
    }
    
}
