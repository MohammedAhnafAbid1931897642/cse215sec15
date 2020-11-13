/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter total  no. of courses done: ");
        n= input.nextInt();
        
        float array1[]=new float[n];
        float array2[]=new float[n];
        float array3[]=new float[n];
        float totalcredit=0;
        
        //Taking input for final marks and credit hours for each course taken
        for(int i=0; i<n; i++){
            System.out.println("Enter final marks for course " + (i+1) + ":");
            array1[i]=input.nextFloat();
            System.out.println("Enter credit hours for course " + (i+1) + ":");
            array2[i]=input.nextFloat();
        }
        //array3 is intended to store corresponding grade points for each course compared to final marks of each course stored in array1
        for(int j=0; j<n; j++){
            //total course credit hours are calculated based on summation of values stored in array2 
            totalcredit=totalcredit + array2[j];
            if(array1[j]>=93.0){
                array3[j]=4.0f;
            }
            else{
                if(array1[j]>=90.0f && array1[j]<=92.0f){
                    array3[j]=3.7f;
                }
                else{
                    if(array1[j]>=87.0f && array1[j]<=89.0f){
                        array3[j]=3.3f;
                    }
                    else{
                        if(array1[j]>=83.0f && array1[j]<=86.0f){
                            array3[j]=3.0f;
                        }
                        else{
                            if(array1[j]>=80.0f && array1[j]<=82.0f){
                                array3[j]=2.7f;
                            }
                            else{
                                if(array1[j]>=77.0f && array1[j]<=79.0f){
                                    array3[j]=2.3f;
                                }
                                else{
                                    if(array1[j]>=73.0f && array1[j]<=76.0f){
                                        array3[j]=2.0f;
                                    }
                                    else{
                                        if(array1[j]>=70.0f && array1[j]<=72.0f){
                                            array3[j]=1.7f;
                                        }
                                        else{
                                            if(array1[j]>=67.0f && array1[j]<=69.0f){
                                                array3[j]=1.3f;
                                            }
                                            else{
                                                if(array1[j]>=60.0f && array1[j]<=66.0f){
                                                    array3[j]=1.0f;
                                                }
                                                else{
                                                    array3[j]=0.0f;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }
        //sumOFproduct variable stores summation of all products which is when individual grade point is multiplied by individual course hours 
        float sumOFproducts=0;
        for(int k=0; k<n; k++){
            sumOFproducts=sumOFproducts + (array3[k]*array2[k]);
        }
        //cGPA stores the decimal value calculated from sumOFproducts divided by total course credit hours
        float cGPA=0;
        cGPA=sumOFproducts/totalcredit;
        
        //Final cGPA based on all courses is printed 
        System.out.printf("cGPA: %.2f",cGPA);// %.2f is used to output cGPA value correct to 2 decimal places 
        System.out.println();
                
        
        
        
        
    }
    
}
