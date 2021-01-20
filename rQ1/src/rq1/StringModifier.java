/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rq1;

import java.util.List;



/**
 *
 * @author ahnaf
 */
public class StringModifier {


    public StringModifier() {
    }
    
    public int readLength(List<String> s, int index){
        String m;
        m=s.get(index);
        return m.length();
        
    }
    
    public void splitString(List<String> s){
        for(int i=0; i<s.size(); i++){
            if(s.get(i).length()>10&&s.get(i).length()<70){
                String str=s.get(i);
                String[] splitted= str.split("", 10);
                System.out.println(splitted[i]);
            }
        }
    }
    
    public void deleteString(List<String> s){
        for(int k=0; k<s.size(); k++){
            if(s.get(k).length()>70){
                s.remove(k);
            }
        }
    }
    
}
