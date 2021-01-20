/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author ahnaf
 */
public class Plant3 extends Plant_Analysis{

    private double water_temp, water_level, water_pH, water_turbidity, water_DO;
    private boolean plant_status=true;

    public Plant3() {
    }
    
    

    public Plant3(double water_temp, double water_level, double water_pH, double water_turbidity, double water_DO) {
        this.water_temp = water_temp;
        this.water_level = water_level;
        this.water_pH = water_pH;
        this.water_turbidity = water_turbidity;
        this.water_DO = water_DO;
    }
    
    

    public double getWater_temp() {
        return water_temp;
    }

    public void setWater_temp(double water_temp) {
        this.water_temp = water_temp;
    }

    public double getWater_level() {
        return water_level;
    }

    public void setWater_level(double water_level) {
        this.water_level = water_level;
    }

    public double getWater_pH() {
        return water_pH;
    }

    public void setWater_pH(double water_pH) {
        this.water_pH = water_pH;
    }

    public double getWater_turbidity() {
        return water_turbidity;
    }

    public void setWater_turbidity(double water_turbidity) {
        this.water_turbidity = water_turbidity;
    }

    public double getWater_DO() {
        return water_DO;
    }

    public void setWater_DO(double water_DO) {
        this.water_DO = water_DO;
    }

    public boolean isPlant_status() {
        return plant_status;
    }

    public void setPlant_status(boolean plant_status) {
        this.plant_status = plant_status;
    }
    
    public void checkWaterTemp(){
        System.out.println("Water temp ABNORMAL");
    }
    public void checkWaterLevel(){
        System.out.println("Water level OK");
        
    }
    public void checkWaterPH(){
        System.out.println("pH level ABNORMAL");
    }
    
    public void checkWaterTurbidity(){
         System.out.println("Water turbidity HIGH");
        
    }
    
    public void checkWaterDO(){
        System.out.println("Water DO OK");
    }
    
    public void checkPlantStatus(){
        if(plant_status==true)
            System.out.println("Plant ACTIVE");
        else
            System.out.println("Plant INACTIVE");
    }
    public void printPlantDirectorName(){
        System.out.println("Mr Dan Foster");
        
    }
    
        
}
