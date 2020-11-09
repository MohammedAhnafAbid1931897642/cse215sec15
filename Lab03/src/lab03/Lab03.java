/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----- CLASSWORK -----");
        /*CLASS WORK */
         int i=0, num, sum=0;
         System.out.println("Enter an integer:");
         Scanner inp=new Scanner(System.in);
         num= inp.nextInt();
         int arr[]= new int[num+1];
         
         for(i=0;i<=num;i++){
             arr[i]=i;
             sum=sum+i;
             if(i==num){
                 System.out.print(i+" ");
                 break;
             }
             System.out.print(i+" + ");
         }
         System.out.print("="+sum);
         System.out.println();
        //TASK 1
        System.out.println("----- TASK 1 -----");
        int z=0, num1;
        String name;
        System.out.println("Enter an integer:");
        Scanner input= new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        num1= input.nextInt();
        System.out.println("Enter name:");
        name= sc.nextLine();
        System.out.println("-----Printing name-----");
        while(z<num1){
            System.out.println(name);
            z++;
        }
       
        //TASK 2 (a)
        

        
        

        int rows=5;
        int oneless=5;

        System.out.println("-----Printing the pattern 2(a)-----");

        for (int j = 1; j <= rows; j++){
            for (int k = 1; k < j; k++){
                System.out.print(" ");
            }

            for (int l =oneless; l>0; l--){
                System.out.print(l);
                
                }
            
            oneless=oneless-1; 
            System.out.println();
            
        }
        //TASK 2(b)
        System.out.println("-----Printing the pattern 2(b)-----");
        
        int rows2=5;
        
        for(int u=1; u<=rows2; u++){
            
            for(int m = 1; m <=u; m++ ){
                System.out.print(m);
                
            }
           
            
            System.out.println();
        
       
        }
        //TASK 3 (a)
        System.out.println("-----HOME TASK 3(a)-----");
        int lower=9999, upper=-9999, number3, number4;
        for(int g=1; g<=3; g++){
            number3=(int)(1+Math.random()*(1000-1+1));
            number4=(int)(1+Math.random()*(1000-1+1));
            if(number3<lower){
            lower=number3;
            }
            if(number3>upper){
            upper=number3;
            }
            if(number4<lower){
            lower=number3;
            }
            if(number4>upper){
            upper=number3;
            }
        
        
        
        
        
        
    }
        System.out.println("upper="+upper);
        System.out.println("lower="+lower);
        
        System.out.println("-----HOME TASK 3(b)-----");
        int count=upper;
        while(count>=lower){
            if(count%5==0 || count%8==0){
                System.out.print(count+" ");
            }
            count=count-1;
        }
        
}
}
