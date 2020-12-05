/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.user.banking.system;

/**
 *
 * @author ahnaf
 */
public class User {
    
    public static void main(String[] args){
        Admin men = new Admin();
        int a = men.showMenu();
        men.handleMenuInput(a);
    }
    
    
    
}
