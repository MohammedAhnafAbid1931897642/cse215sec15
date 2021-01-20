/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rq2;

import java.util.Date;
import java.util.Random;
/**
 *
 * @author ahnaf
 */
public class GenerateTicket {
    private String customer_name;
    private Date ticket_booking_date;
    private int booking_ID;
    private String[][] booked_seats;
    private double total_Cost;
    private boolean discount;
    private double total_payable;

    public GenerateTicket() {
    }

    

    public GenerateTicket(String customer_name, Date ticket_booking_date, int booking_ID) {
        this.customer_name = customer_name;
        this.ticket_booking_date = ticket_booking_date;
        this.booking_ID = booking_ID;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public int getBooking_ID() {
        return booking_ID;
    }

    public double getTotal_Cost() {
        return total_Cost;
    }
    
    public void bookSeats(String booked_seats[][], int i, double cost_per_ticket){
            booked_seats[i][i]=String.valueOf(cost_per_ticket);
        }
    
    public boolean activateDiscount(int booking_ID){
        return true;
    }
    
    public double availDiscount(double total_cost){
        Random rd= new Random();
        double random_discount= 20 + (Math.random()*(50-20));
        double discount=random_discount;
        total_payable=total_Cost-discount;
        return discount;
    }
    
    public double toBePaid(){
        return total_payable;
    }
    
    String printStatus(int Booking){
        return "Booked";
    }
}
    
    

