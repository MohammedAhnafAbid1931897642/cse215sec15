/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.midterm;
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class StoreStrings {
    static String[] strArr=new String[1000];
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp= new Scanner(System.in);
        int size;
        System.out.println("Enter array size: ");
        size= inp.nextInt();
        
        
        for(int j=0; j<size; j++){
            System.out.println("Enter string: ");
            strArr[j]=inp.nextLine();
            
        }
        
    }
    
    void sendMessage(String s){
        
        
    }
    
    
    
}
