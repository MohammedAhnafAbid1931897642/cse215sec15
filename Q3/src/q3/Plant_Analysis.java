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
public abstract class Plant_Analysis {
    private double water_temp, water_level, water_pH, water_turbidity, water_DO;
    private boolean plant_status;

    public Plant_Analysis() {
    }

    
    
    public Plant_Analysis(double water_temp, double water_level, double water_pH, double water_turbidity, double water_DO, boolean plant_status) {
        this.water_temp = water_temp;
        this.water_level = water_level;
        this.water_pH = water_pH;
        this.water_turbidity = water_turbidity;
        this.water_DO = water_DO;
        this.plant_status = plant_status;
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
    
    public abstract void checkWaterTemp();
    public abstract void checkWaterLevel();
    public abstract void checkWaterPH();
    public abstract void checkWaterTurbidity();
    public abstract void checkWaterDO();
    public abstract void checkPlantStatus();
    public void printPlantDirectorName(){
        
    }
    
    
}
