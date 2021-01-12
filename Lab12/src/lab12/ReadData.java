/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class ReadData {
    public static void main(String[] args) throws Exception{
        //Create a File instance
        java.io.File file= new java.io.File("quiz.txt");
        int[] ID= new int[4];
        int[] marks= new int[4];
        int i=0, highest=-9999;
        
        //Create a Scanner for the file
        Scanner input = new Scanner(file);
        
        //Read data from a file
        while(input.hasNext()){
            String firstString= input.next();
            String lastString= input.next();
            
            ID[i]= Integer.parseInt(firstString);
            marks[i]= Integer.parseInt(lastString);
            
            i++;
            
            System.out.println("ID:"+firstString + " " + "mark:"+ lastString);
            
        }
        
        for(int j=0; j<4; j++){
            
            if(marks[j]>highest){
                highest=marks[j];
                System.out.println("Highest mark obtained by ID: " + ID[j]);
            }
                
        }
        
  
        
        //Close the file
        input.close();
        
    }
    
}