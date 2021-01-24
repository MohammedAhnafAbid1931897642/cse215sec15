/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06.classwork01;
import java.util.Scanner;

/**
 *
 * @author ferdous
 */
public class Lab06Classwork01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your array elements:");
        int arr[] = new int[6];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= input.nextInt();
        }
        input.nextLine();
        int sum=0;
        for(int j=0;j<arr.length;j++)
        {
            sum += arr[j];
        }
        double average=0, aboveNumber=0, percentage=0;
        average = (double) sum/6;
        System.out.println(String.format("Average = %.2f ",average));
        
        for(int k=0;k<6;k++)
        {
            if(arr[k]>average)
            {
                aboveNumber+=1;
            }
        }
        percentage=(aboveNumber/6)*100;
        System.out.println(String.format("Percentage = %.2f ",percentage));
         
        
    }
    
}
