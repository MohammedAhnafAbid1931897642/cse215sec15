/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.file;

/**
 *
 * @author ahnaf
 */
public class PracticeFile {
    
    public static boolean isNumeric(String str) {
 
        if (str == null || str.length() == 0) {
            return false;
        }
 
        try {
            Double.parseDouble(str);
            return true;
 
        } catch (NumberFormatException e) {
            return false;
        }
 
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //int[] a= new int[15];
        String s="123";
        System.out.println(isNumeric(s));
        
        
    }
    
}
