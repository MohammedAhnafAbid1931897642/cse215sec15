/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author ahnaf
 */
public class User {
    //constructing setters and getters for USER
    
    //initializing variables
    public static String name, email;
    public static int id;
    
    String getName(){
        return name;
    }
    
    void setName(String name){
        this.name=name;
        
    }
    
    int getId(){
        return id;
    }
    
    void setId( int id){
        this.id=id;
        
    }
    
    String getEmail(){
        return email;
        
    }
    
    void setEmail(String email){
        this.email=email;
    }
    
    boolean verifyEmail(String email){
        //verifying email using ternary operator
        boolean a=(email==email)?true:false;
        return a;
        
    }
}
