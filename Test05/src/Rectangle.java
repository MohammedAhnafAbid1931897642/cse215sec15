/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ahnaf
 */
public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
    return length;
    }
    public void setLength(Scanner scan) {
    System.out.print("Enter length");
    this.length = scan.nextDouble();
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(Scanner scan) {
        System.out.print("Enter width");
        this.width = scan.nextDouble();
    }
    public Double getArea(){
        return length * width;
    }
}
