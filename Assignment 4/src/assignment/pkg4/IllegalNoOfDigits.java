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

//IllegalNoOfDigits custom exception
public class IllegalNoOfDigits extends Exception{
    public IllegalNoOfDigits(){
        super();
    }
    public IllegalNoOfDigits(String message){
        super(message);
    }
    
}