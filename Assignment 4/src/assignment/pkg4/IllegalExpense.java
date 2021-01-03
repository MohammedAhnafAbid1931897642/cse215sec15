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

//IllegalExpense custom exception
public class IllegalExpense extends Exception{
    public IllegalExpense(){
        super();
    }
    public IllegalExpense(String message){
        super(message);
    }
    
}