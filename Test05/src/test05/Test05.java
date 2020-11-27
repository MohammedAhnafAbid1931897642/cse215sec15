/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test05;
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class Test05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter string to be stored and displayed: ");
        String yourString;
        yourString= inp.nextLine();
        
        int n= yourString.length();
        
        char arr1[] = new char [n];
        char arr2[] = new char [n];
        int count=0;
        
        for(int i=0; i<n; i++)
        {
            arr1[i]=yourString.charAt(i);
            
        }
        System.out.println("array 1 : " + arr1[3]);
        for(int j=0; j<n; j++)
        {
            arr2[n-1-j]=arr1[j];
        }
        System.out.println("array 2 : " + arr2[3]);
        
        
        
    }
    
}
