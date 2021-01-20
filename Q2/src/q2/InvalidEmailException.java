/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author ahnaf
 */
public class InvalidEmailException extends Exception{
    public InvalidEmailException(){
        super();
    }
    public InvalidEmailException(String message){
        super(message);
    }
    
}