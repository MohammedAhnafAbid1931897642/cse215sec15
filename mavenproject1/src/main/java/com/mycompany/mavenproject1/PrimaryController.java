package com.mycompany.mavenproject1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    double data1, data2, ans;
    int operation;

    @FXML
    private Button one;

    @FXML
    private Button four;

    @FXML
    private Button two;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button add;

    @FXML
    private Button subtract;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button multiply;

    @FXML
    private Button clear;

    @FXML
    private Button zero;

    @FXML
    private Button equals;

    @FXML
    private Button divide;
    
    @FXML
    private TextField display;

    @FXML
    void handleButtonAction(ActionEvent event) {
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
        
        if(event.getSource() == multiply){
            data1=Double.parseDouble(display.getText());
            operation=3;
            display.setText("");  
        }
        
        if(event.getSource() == divide){
            data1=Double.parseDouble(display.getText());
            operation=4;
            display.setText(""); 
        }
        
        if(event.getSource() == add){
            data1=Double.parseDouble(display.getText());
            operation=1;
            display.setText("");
        }
        
        if(event.getSource() == subtract){
            data1=Double.parseDouble(display.getText());
            operation=2;
            display.setText("");
        }
        
        if(event.getSource() == clear){
            display.setText("");
        }
        
        if(event.getSource() == zero){
            display.setText(display.getText()+"0"); 
        }
        
        if(event.getSource() == equals){
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
                    
                
            }
        }
        
        
        
        

    }
}
