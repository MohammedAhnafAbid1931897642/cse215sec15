/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author ahnaf
 */
public class InvalidNameException extends Exception{
    public InvalidNameException(){
        super();
    }
    public InvalidNameException(String message){
        super(message);
    }
    
}
