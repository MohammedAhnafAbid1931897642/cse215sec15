/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;
import java.util.Scanner;
import java.util.Calendar;
/**
 *
 * @author ahnaf
 */

public class Assignment4 {
    public static String first_name, last_name, DOB, total_no_of_family, famAbove_18, famBelow_18, avg_personal, avg_family, avg_fam_expense, avg_farm_expense, stipend, gov_assistance;    
    public static int fertilizers;
    //Implementing isNumeric method to check for whether input contains only numbers or not
    
    public static boolean isNumeric(String str) {
 
        if (str == null || str.length() == 0) {
            return false;
        }
 
        try {
            Integer.parseInt(str);
            return true;
 
        } catch (NumberFormatException e) {
            return false;
        }
 
    }
    
    public static boolean isBoolean(String str) {
 
        if (str == null || str.length() == 0) {
            return false;
        }
 
        try {
            Boolean.parseBoolean(str);
            return true;
 
        } catch (NumberFormatException e) {
            return false;
        }
 
    }
    
    //Method to enter first name
    
    public void setFirstName(String name)
            throws InvalidNameException{
        if(isNumeric(name)==true){
            throw new InvalidNameException("Invalid! " + "First name can not contain any numbers!");
           
        }
        this.first_name=first_name;
        System.out.println("First name has been entered correctly!");
        
    }
    
    //Method to enter last name
    
    public void setLastName(String name)
            throws InvalidNameException{
        if(isNumeric(name)==true){
            throw new InvalidNameException("Invalid! " + "Last name can not contain any numbers!");
           
        }
        this.last_name=last_name;
        System.out.println("Last name has been entered correctly!");
        
    }
    
    //Method to enter date of birth
    
    public void setDOB(String DOB)
            throws IllegalDateofBirth{
        //calculating current year using calendar
        int current_year = Calendar.getInstance().get(Calendar.YEAR);
        //extracting last four digits from DDMMYYYY for age calculation
        String lastFourDigits = DOB.substring(DOB.length() - 4);
        int lastFourDigitstoInteger=Integer.parseInt(lastFourDigits);
        //calculating age by finding difference between current year and last four digits of DOB
        int age=current_year-lastFourDigitstoInteger;
        if(age<=18){
            throw new IllegalDateofBirth("Invalid! " + "User must be at least 18 years of age!");
           
        }
        this.DOB=DOB;
        System.out.println("Date of Birth entered successfully!");
        
    }
    
    //Method to enter family members above 18 age
    
    public void setfamAbove_18(String famAbove_18){
        this.famAbove_18=famAbove_18;
        System.out.println("Family members above 18 entered successfully!");
        
    }
    
    //Method to enter family members below 18 age
    
    public void setfamBelow_18(String famBelow_18){
        this.famBelow_18=famBelow_18;
        System.out.println("Family members below 18 entered successfully!");
        
    }
    
    //Method to calculate total no of family members from the previous two method values
    
    public void total_no_of_family()
        throws IllegalNoOfFamilyMembers{
        int check=Integer.parseInt(famBelow_18)+Integer.parseInt(famAbove_18);
        if(check>15){
            throw new IllegalNoOfFamilyMembers("Invalid! " + "Total number of family members must not be greater than 15!");
           
        }
        this.total_no_of_family=total_no_of_family;
        System.out.println("Total number of family members is within limit!");
    }
  
    //Method to enter average monthly personal income
    
    public void setavg_personal(String avg_personal)
            throws IllegalIncome{
        if(isNumeric(avg_personal)==false && avg_personal.length()>6){
            throw new IllegalIncome("Invalid! " + "Average personal income must be numeric and not more than 6 digits long!");
           
        }
        this.avg_personal=avg_personal;
        System.out.println("Average personal income has been entered successfully!");
        
    }
    
    //Method to enter average monthly family income
    
    public void setavg_family(String avg_family)
            throws IllegalIncome{
        if(isNumeric(avg_family)==false && avg_family.length()>6){
            throw new IllegalIncome("Invalid! " + "Average family income must be numeric and not more than 6 digits long!");
           
        }
        this.avg_family=avg_family;
        System.out.println("Average family income has been entered successfully!");
        
    }
    
    //Method to enter average monthly family expenses
    
    public void setavg_fam_expense(String avg_fam_expense)
            throws IllegalExpense{
        if(isNumeric(avg_fam_expense)==false && avg_fam_expense.length()>6){
            throw new IllegalExpense("Invalid! " + "Average family expense must be numeric and not more than 6 digits long!");
           
        }
        double family_expense=Double.parseDouble(avg_fam_expense);
        double family_income=Double.parseDouble(avg_family);
        if(family_expense>1.25*family_income){
            throw new IllegalExpense("Invalid! " + "Average family expense must not be 25% more than the average family income!");
           
        }
        this.avg_fam_expense=avg_fam_expense;
        System.out.println("Average family expense has been entered successfully!");
        
    }
    
    //Method to enter average monthly farm expenses
    
    public void setavg_farm_expense(String avg_farm_expense)
            throws IllegalExpense{
        if(isNumeric(avg_farm_expense)==false && avg_farm_expense.length()>6){
            throw new IllegalExpense("Invalid! " + "Average farming expense must be numeric and not more than 6 digits long!");
           
        }
        double farm_expense=Double.parseDouble(avg_farm_expense);
        double family_income=Double.parseDouble(avg_family);
        if(farm_expense>1.25*family_income){
            throw new IllegalExpense("Invalid! " + "Average farming expense must not be 25% more than the average family income!");
           
        }
        this.avg_farm_expense=avg_farm_expense;
        System.out.println("Average farming expense has been entered successfully!");
        
    }
    
    //Method to enter government help as true or false
    
    public void setgov_assistance(String gov_assistance)
            throws IllegalGovInput{
        
        if(isBoolean(gov_assistance)==false){
            throw new IllegalGovInput("Invalid! " + "Government assistance must be boolean value of true or false!");
           
        }
        this.gov_assistance=gov_assistance;
        System.out.println("Government help has been entered successfully!");
        
    }
    
    //Method to enter amount of fertilizers he or she needs to buy each month
    
    public void setfertilizers(int fertilizers)
            throws IllegalFertiliserDigitsIntOnly{
        int length = String.valueOf(fertilizers).length();
        if(length>2){
            throw new IllegalFertiliserDigitsIntOnly("Invalid! " + "Amount of fertilizer must not be greater than 2 digits!");
           
        }
        
        if(fertilizers!=(int)fertilizers){
            throw new IllegalFertiliserDigitsIntOnly("Invalid! " + "Amount of fertilizer must be in integer form!");
           
        }
        this.fertilizers=fertilizers;
        System.out.println("Amount of fertilizers has been entered successfully!");
        
    }
    
    //Method to enter stipend to be received from government
    
    public void setstipend(String stipend)
            throws IllegalExpense{
        if(isNumeric(stipend)==false){
            throw new IllegalExpense("Invalid! " + "Stipend must be numeric!");
           
        }
        double dbstipend=Double.parseDouble(stipend);
        double family_income=Double.parseDouble(avg_family);
        if(dbstipend>1.25*family_income){
            throw new IllegalExpense("Invalid! " + "Stipend must not be 25% more than the average family income!");
           
        }
        this.stipend=stipend;
        System.out.println("Stipend has been entered successfully!");
        
    }
    
    

    
    public static void main(String[] args)
            //throwing exceptions based on input
            throws InvalidNameException, IllegalDateofBirth, IllegalNoOfFamilyMembers, IllegalIncome, IllegalExpense, IllegalGovInput, IllegalFertiliserDigitsIntOnly{
        Assignment4 user = new Assignment4();
        
        try{
            Scanner input= new Scanner(System.in);
            System.out.println("Enter first name: ");
            first_name=input.nextLine();
            user.setFirstName(first_name);
            System.out.println("Enter last name: ");
            last_name=input.nextLine();
            user.setLastName(last_name);
            System.out.println("Enter Date of Birth in the following format DDMMYYYY: ");
            DOB=input.nextLine();
            user.setDOB(DOB);
            System.out.println("Enter number of Family Members above age 18: ");
            famAbove_18=input.nextLine();
            user.setfamAbove_18(famAbove_18);
            System.out.println("Enter number of Family Members below age 18: ");
            famBelow_18=input.nextLine();
            user.setfamBelow_18(famBelow_18);
            user.total_no_of_family();
            System.out.println("Enter Average Monthly Personal Income: ");
            Scanner inc=new Scanner(System.in);
            avg_personal=inc.nextLine();
            user.setavg_personal(avg_personal);
            System.out.println("Enter Average Monthly Family Income: ");
            avg_family=inc.nextLine();
            user.setavg_family(avg_family);
            System.out.println("Enter Average Monthly Family Expense: ");
            avg_fam_expense=inc.nextLine();
            user.setavg_fam_expense(avg_fam_expense);
            System.out.println("Enter Average Monthly Farming Expense: ");
            avg_farm_expense=inc.nextLine();
            user.setavg_farm_expense(avg_farm_expense);
            System.out.println("Do you need help from the government? Type true or false only: ");
            gov_assistance=inc.nextLine();
            user.setgov_assistance(gov_assistance);
            System.out.println("Enter the amount of money you wish to have as stipend from government: ");
            Scanner sc=new Scanner(System.in);
            stipend=sc.nextLine();
            user.setstipend(stipend);
            System.out.println("Enter amount of fertilizers as 2 digit integer: ");
            fertilizers=sc.nextInt();
            user.setfertilizers(fertilizers);
            
        }
        //catching exceptions based on input
        catch(InvalidNameException | IllegalDateofBirth | IllegalNoOfFamilyMembers | IllegalIncome | IllegalExpense | IllegalGovInput | IllegalFertiliserDigitsIntOnly a){
            System.out.println(a.getMessage());
        }
    }
}