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
public class EmailVerification {
    private String[] email= {"mohammed.abid@northsouth.edu"};

    public EmailVerification(String[] email) {
        this.email = email;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }
    

    
    public boolean validateEmail(String[] email)
            throws InvalidEmailException{
        int no_of_at=0, dot_found=0;
        boolean b=false;
        int size = email.length;
        for(int i=0; i<size; i++){
            if(email[i]=="@"){
                no_of_at=no_of_at+1;
                
            }
            if(email[i]=="."){
                dot_found=dot_found+1;
            }
                
            
        }
        if(no_of_at!=1 && dot_found!=1){
            throw new InvalidEmailException("Invalid email!");
           
        }
        b=true;
        return b;
        
    }   
    

}
