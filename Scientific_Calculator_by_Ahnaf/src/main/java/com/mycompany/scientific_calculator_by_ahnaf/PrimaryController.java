package com.mycompany.scientific_calculator_by_ahnaf;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.lang.Math; 
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    double data1, data2, ans;
    int operation;

    @FXML
    private Button sin;

    @FXML
    private Button cos;

    @FXML
    private Button tan;

    @FXML
    private Button exponent;

    @FXML
    private Button sqrt;

    @FXML
    private Button log;

    @FXML
    private Button ln;

    @FXML
    private Button div;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button add;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button mult;

    @FXML
    private Button zero;

    @FXML
    private Button clear;

    @FXML
    private Button decimal;

    @FXML
    private Button equal;

    @FXML
    private TextField display;

    @FXML
    void handleButtonAction(ActionEvent event) {
        
        if(event.getSource() == decimal){
            display.setText(display.getText()+".");
            
        }
        
        if(event.getSource() == zero){
            display.setText(display.getText()+"0");
            
        }
        
        
        if(event.getSource() == one){
            display.setText(display.getText()+"1");
            
        }
        
        if(event.getSource() == two){
            display.setText(display.getText()+"2");
            
        }
        
        if(event.getSource() == three){
            display.setText(display.getText()+"3");
            
        }
        
        if(event.getSource() == four){
            display.setText(display.getText()+"4");
            
        }
        
        if(event.getSource() == five){
            display.setText(display.getText()+"5");
            
        }
        
        if(event.getSource() == six){
            display.setText(display.getText()+"6");
            
        }
        
        if(event.getSource() == seven){
            display.setText(display.getText()+"7");
            
        }
        
        if(event.getSource() == eight){
            display.setText(display.getText()+"8");
            
        }
        
        if(event.getSource() == nine){
            display.setText(display.getText()+"9");
            
        }
        
        if(event.getSource() == mult){
            data1=Double.parseDouble(display.getText());
            operation=3;
            display.setText("");  
        }
        
        if(event.getSource() == div){
            data1=Double.parseDouble(display.getText());
            operation=4;
            display.setText(""); 
        }
        
        if(event.getSource() == add){
            data1=Double.parseDouble(display.getText());
            operation=1;
            display.setText("");
        }
        
        if(event.getSource() == minus){
            data1=Double.parseDouble(display.getText());
            operation=2;
            display.setText("");
        }  
        if(event.getSource() == sin){
            operation=5;
            display.setText("");
        }
        
        if(event.getSource() == cos){
            operation=6;
            display.setText("");
        }
        
        if(event.getSource() == tan){
            operation=7;
            display.setText("");
        }
        
        if(event.getSource() == sqrt){
            operation=8;
            display.setText("");
        }
        
        if(event.getSource() == log){
            operation=9;
            display.setText("");
        }
        
        if(event.getSource() == ln){
            operation=10;
            display.setText("");
        }
        
        if(event.getSource() == exponent){
            data1=Double.parseDouble(display.getText());
            operation=11;
            display.setText("");
        }
        
        if(event.getSource() == clear){
            display.setText("");
        }
        

        if(event.getSource() == equal){
            data2=Double.parseDouble(display.getText());
            switch(operation){
                case 1:
                    ans=data1+data2;
                    display.setText(String.valueOf(ans));
                    break;
                case 2:
                    ans=data1-data2;
                    display.setText(String.valueOf(ans));
                    break;
                case 3:
                    ans=data1*data2;
                    display.setText(String.valueOf(ans));
                    break;
                case 4:
                    
                try{
                    ans=data1/data2;
                }catch(Exception e){
                    display.setText("Error");
                }
                display.setText(String.valueOf(ans));
                break;
                
                case 5:
                    data1=Double.parseDouble(display.getText());
                    ans=Math.sin(data1);
                    display.setText(String.valueOf(ans));
                    break;
                    
                case 6:
                    data1=Double.parseDouble(display.getText());
                    ans=Math.cos(data1);
                    display.setText(String.valueOf(ans));
                    break;
                    
                case 7:
                    data1=Double.parseDouble(display.getText());
                    ans=Math.tan(data1);
                    display.setText(String.valueOf(ans));
                    break;
                    
                case 8:
                    
                try{
                    data1=Double.parseDouble(display.getText());
                    if(data1<0){
                        display.setText("Invalid");
                        break;
                        
                    }
                    else{
                        ans=Math.sqrt(data1);
                        display.setText(String.valueOf(ans));
                    }
                        

                }catch(Exception e){
                    display.setText("Error");
                }
                display.setText(String.valueOf(ans));
                break;
                
                case 9:
                    
                try{
                    data1=Double.parseDouble(display.getText());
                    ans=Math.log10(data1); 
                    
                }catch(Exception e){
                    display.setText("Error");
                }
                display.setText(String.valueOf(ans));
                break;
                
                case 10:
                    
                try{
                    data1=Double.parseDouble(display.getText());
                    ans=Math.log(data1);
                }catch(Exception e){
                    display.setText("Error");
                }
                display.setText(String.valueOf(ans));
                break;
                
                case 11:
                    ans=Math.pow(data1, data2);
                    display.setText(String.valueOf(ans));
                    break;
                
                
                
                
                    
                
            }
            
        }    
        

    }
}

