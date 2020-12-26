/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awesomestring;

/**
 *
 * @author ahnaf
 */
public class AwesomeString {
    private static String string1="cse215l";
    private static String string2= "CSE215L";
    
    public static String methodA()
    {
        return "awesome";
    }
    
    public static String methodB(){
        return "AwseSome";
    }
    
    public static void main(String[] args){
        System.out.println(string1);
        System.out.println(string2);
        
        System.out.println(AwesomeString.methodA());
        System.out.println(AwesomeString.methodB());
        
        System.out.println(new AwesomeString().methodA());
        System.out.println(new AwesomeString().methodB());
        
    }

    
}
