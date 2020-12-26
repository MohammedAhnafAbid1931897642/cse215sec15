/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.mid.q4;

/**
 *
 * @author ahnaf
 */
public class GenerateInvoice {
    
    public static String customer_name, order_placement_date;
    public static int invoiceID, m;
    public static String purchased_products[][]=new String[m][m];
    public static double total_Cost, discount, total_payable;
    
    GenerateInvoice(){
        
    }
    
    GenerateInvoice(String customer_name, String order_placement_date, int invoiceID){
        
    }
    
    String getCustomer_name(){
        return customer_name;
    }
    
    int getInvoiceID(){
        return invoiceID;
    }
    
    void purchasedProduct(String purchased_products[m][m], int i, double cost,){
        this.purchased_products[i][i]=purchased_products[i][i];
        this.i=i;
        this.cost=cost;
        
        
    
        
    }
    
    double getTotalCost(){
        return total_Cost;
    }
    
    boolean activateVoucher(double total_Cost){
        if(total_Cost>=500)
            return true;
        else
            return false;
    }
    
    double availDiscount(double total_Cost){
       
        
        if(total_Cost>=500&&total_Cost<1000)
            discount=0.1*total_Cost;
        
        if(total_Cost>=1000&&total_Cost<2000)
            discount=0.2*total_Cost;
        
        if(total_Cost>=2000&&total_Cost<5000)
            discount=0.3*total_Cost;
        
        return discount;
        
    }
    
    
    double toBePaid(double discount){
        total_payable=total_Cost-discount;
        return total_payable;
        
    }
    
    String printStatus(){
        return ("Invoice ID: " + getInvoiceID());
    }
    
    
    
}
