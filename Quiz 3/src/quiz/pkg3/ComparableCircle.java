/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg3;

/**
 *
 * @author ahnaf
 */
 public abstract class ComparableCircle extends Circle implements Comparable {

    public ComparableCircle() {
    }

    // Implement the compareTo method defined in Comparable
    @Override
    public void setArea(double area) {
        super.setArea(area); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getArea() {
        return super.getArea(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getRadius() {
        return super.getRadius(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void compareTo() {
        super.compareTo(); //To change body of generated methods, choose Tools | Templates.
    }

 @Override 
 public String toString() {
 return super.toString() + " Area: " + getArea();
 }
 }
