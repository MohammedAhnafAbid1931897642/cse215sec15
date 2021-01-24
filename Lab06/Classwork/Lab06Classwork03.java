/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06.classwork03;

/**
 *
 * @author ferdous
 */
public class Lab06Classwork03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rows, cols, sumRow, sumCol, sumDiagonal1=0, sumDiagonal2=0;  
          
        int a[][] = {{3,4,9},{2,9,11},{4,6,0}};  
        rows = a.length;  
        cols = a[0].length;  
          
        for(int i = 0; i < rows; i++){  
            sumRow = 0;  
            for(int j = 0; j < cols; j++){  
              sumRow = sumRow + a[i][j];  
            }  
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);  
        }  
          
        for(int i = 0; i < cols; i++){  
            sumCol = 0;  
            for(int j = 0; j < rows; j++){  
              sumCol = sumCol + a[j][i];  
            }  
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);  
        }
        
        for(int i = 0; i < rows; i++){  
              
            for(int j = 0; j < cols; j++){  
              sumDiagonal1 = sumDiagonal1 + a[j][i];
              i++;
            }  
        }
        System.out.println("Sum of diagonal 1:" + sumDiagonal1);  
         
        
        for(int i = 0; i < rows; i++){  
               
            for(int j = cols-1; j >= 0; j--){  
              sumDiagonal2 = sumDiagonal2 + a[j][i];
              i++;
            } 
        }
        System.out.println("Sum of diagonal 2:" + sumDiagonal2);  
          
    }
    
}
