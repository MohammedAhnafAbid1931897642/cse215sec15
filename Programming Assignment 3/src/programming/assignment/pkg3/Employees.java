/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.assignment.pkg3;

/**
 *
 * @author ahnaf
 */
public class Employees {
    public String name;
    public int id;
    public String email;
    public double salary;
    
    public Employees(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    
    void setName(){
        this.name=name;
    }
    
    String getName(){
        return name;
    }
    
    int getId(){
        return id;
    }
    
    void setid(int id){
        this.id=id;
    }
    
    String getEmail(){
        return email;
    }
    
    void setEmail(String email){
        this.email=email;
    }
    
    boolean verifyEmail(String email){
        if(this.email==email)
            return true;
        else
            return false;
        
    }
    
    void printStatus(){
        System.out.println("Name: " + getName() + " ID: " + id + " Salary: " + salary);
        
    }
    
    
    
    
    
    
    
}
