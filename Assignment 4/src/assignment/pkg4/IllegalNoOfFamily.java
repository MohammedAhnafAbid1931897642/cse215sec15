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
//IllegalNoOfFamily custom exception
public class IllegalNoOfFamily extends Exception{
    public IllegalNoOfFamily(){
        super();
    }
    public IllegalNoOfFamily(String message){
        super(message);
    }
    
}