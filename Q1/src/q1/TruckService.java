/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author ahnaf
 */
public class TruckService extends VehicleService{
    private int vehicle_CC=0, number_of_seats=0;
    private double booking_hours=0.0;
    
    public TruckService() {
    }

    public TruckService(int vehicle_CC, int number_of_seats, double booking_hours) {
        this.vehicle_CC = vehicle_CC;
        this.number_of_seats = number_of_seats;
        this.booking_hours = booking_hours;
    }

    public int getVehicle_CC() {
        return vehicle_CC;
    }

    public void setVehicle_CC(int vehicle_CC) {
        this.vehicle_CC = vehicle_CC;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public double getBooking_hours() {
        return booking_hours;
    }

    public void setBooking_hours(double booking_hours) {
        this.booking_hours = booking_hours;
    }
    
    public int getMileage(){
        int[] A= {1,9,3,1,8,9,7,6,4,2};
        return(A[5]+A[6]);
    }
    
    public double getRent(){
        String[] B= {"1931897642"};
        String str=(B[3]+B[4]+B[5]+B[6]);
        double d = Double.parseDouble(str);
        double rent= d*booking_hours;
        return booking_hours;
    }

    @Override
    public String toString() {
        return "CarService{" + "vehicle_CC=" + vehicle_CC + ", number_of_seats=" + number_of_seats + ", booking_hours=" + booking_hours + '}';
    }
    
    @Override
    public void displayObject(Object object){
        toString();
    }
    
    
}
