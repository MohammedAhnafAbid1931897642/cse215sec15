/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------TASK 1------");
        Scanner inp= new Scanner(System.in);
  
        int arr[]=new int[6];
        int total=0;
        double average=0, numbersAboveAvg=0, percentage=0;
        for(int i=0; i<6; i++){
           System.out.println("Enter number: ");
            arr[i]=inp.nextInt();
        }
        System.out.println(" 1st " + arr[0]);
        for(int j=0; j<6;j++){
            total=total+arr[j];
        }
        
        average=total/6;
       System.out.println("Average: " + average);
        for(int k=0; k<6; k++){
            if(arr[k]>average){
                numbersAboveAvg=numbersAboveAvg+1;
           }
       }
        percentage=(numbersAboveAvg/6)*100;
        System.out.println("Percentage: " + percentage + "%");
        
        
        System.out.println("------TASK 4------");
        
        System.out.println("Enter array size: ");
        int n= inp.nextInt();
        int arr2[]= new int[n];
        int arr3[]= new int[n];
        
        
        for(int m=0; m<n; m++){
            System.out.println("Enter number: ");
            arr2[m]=inp.nextInt();
            
        }
        
        for(int p=0; p<n-2; p++){
            if(arr2[p]==arr2[p+1]&&arr2[p+1]==arr2[p+2]){
                System.out.println("Number that has been repeated 3 times consecutively: " + arr2[p]);
               
            }
        
        
        
        
        
    }
    
}
}