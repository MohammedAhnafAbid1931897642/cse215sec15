/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author ahnaf
 */
public class Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //COMMENTED OUT CODE CONTAINS CLASSWORK
//        System.out.println("-----CLASSWORK-----");
//        
//        Scanner inp = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String st = inp.nextLine();
//        for(int i=0; i<st.length();i++){
//            System.out.println(st.charAt(i));
//            for(int j=-1;j<i;j++){
//                System.out.print(" ");
//                
//            }
//        }
//        switch(st){
//            case"one":
//                System.out.println("you have entered 1");
//                break;
//            case"two":
//                System.out.println("you have entered 2");
//                break;
//            case"three":
//                System.out.println("you have entered 3");
//                break;
//            default:
//                System.out.println("anything else");
//            
//        }
//        System.out.println("Enter length of one side for the hexagon");
//        double s = inp.nextDouble();
//        double hexagonArea=((6*Math.pow(s,2)/(4*Math.tan(Math.PI/6))));
//        System.out.println(String.format("%.2f", hexagonArea));

//        Scanner inp2 = new Scanner(System.in);
//        System.out.println("Enter the first string");
//        String st1= inp2.nextLine();
//        System.out.println("Enter the second string");
//        String st2= inp2.nextLine();
//        int n1 = st1.length();
//        int n2 = st2.length();
//        
//        if(n1<n2){
//            System.out.println("The second string should be smaller in length");
//        }
//        if(st1.substring(0,n2).equals(st2)){
//            System.out.println("String "+ st1 + "starts with String "+ st2);
//        }
//        if(st1.substring(n1-n2, n1).equals(st2)){
//            System.out.println("String "+ st1 + "ends with String "+ st2);
//            
//            
//        }
//        else{
//            System.out.println("String "+st1+ " has no match with "+ st2);
//        }
//        
//        System.out.println("Enter the first string");
//        String st3 = inp.nextLine();
//        int currVow=0, prevVow =0;
//        for(int i=0; i<st3.length();i++){
//            char ch=st3.charAt(i);
//            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                prevVow=currVow;
//                currVow=i;
//            }
//        }
//        
//        System.out.println("Second last occurrence of vowel is at" + prevVow + " the vowel is " + currVow );

        System.out.println("-------------TASK 1 ---------------");
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the side of a hexagon: ");
        double s= inp.nextDouble();
        if(s>0){
            double hexagonArea=((6*Math.pow(s,2)/(4*Math.tan(Math.PI/6))));
            System.out.println(String.format("%.2f", hexagonArea));
        
            
        }
        else{
            System.out.println("The area can not be computed due to invalid side length");
            
        }
        
        System.out.println("-------------TASK 2 ---------------");
        Scanner sc= new Scanner(System.in);
        String s1, s2;
        System.out.println("Enter string s1: ");
        s1= sc.nextLine();
        System.out.println("Enter string s2: ");
        s2= sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        if(s1.substring(0,n2).equals(s2)){
            System.out.println("String "+ s1 + " starts with String "+ s2);
        }
        else{
            if(s1.substring(n1-n2, n1).equals(s2)){
            System.out.println("String "+ s1 + " ends with String "+ s2);
            }
            else{
                System.out.println("String "+s1+ " has no match with "+ s2);
                
            }
        }
        
        
        System.out.println("-------------TASK 3 ---------------");
        
        Scanner sc2= new Scanner(System.in);
        String s3;
        
        
        System.out.println("Enter string for previous vowel index number: ");
        s3= sc2.nextLine();
        int currVow=0, prevVow =0;
        for(int i=0; i<s3.length();i++){
            char ch=s3.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                prevVow=currVow;
                currVow=i;
            }
        }
        
        System.out.println(" Second last occurrence of vowel is at " + prevVow + " the current occurrence of vowel is at " + currVow );
        
        
        
            
        
    
    }
}
