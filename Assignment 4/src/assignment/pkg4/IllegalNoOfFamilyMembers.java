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
//IllegalNoOfFamilyMembers custom exception
public class IllegalNoOfFamilyMembers extends Exception{
    public IllegalNoOfFamilyMembers(){
        super();
    }
    public IllegalNoOfFamilyMembers(String message){
        super(message);
    }
    
}
