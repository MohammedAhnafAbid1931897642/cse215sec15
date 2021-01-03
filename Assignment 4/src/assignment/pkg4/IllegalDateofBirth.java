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

//IllegalDateofBirth custom exception

public class IllegalDateofBirth extends Exception{
    public IllegalDateofBirth(){
        super();
    }
    public IllegalDateofBirth(String message){
        super(message);
    }
    
}