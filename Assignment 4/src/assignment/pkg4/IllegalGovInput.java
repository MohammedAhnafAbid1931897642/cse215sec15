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

//IllegalGovInput custom exception
public class IllegalGovInput extends Exception{
    public IllegalGovInput(){
        super();
    }
    public IllegalGovInput(String message){
        super(message);
    }
    
}