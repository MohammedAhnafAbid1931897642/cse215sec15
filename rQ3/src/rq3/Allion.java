/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rq3;

/**
 *
 * @author ahnaf
 */
public class Allion extends BuildCar{
    String engine;
    int model;
    BuildCar BuildCar;

    public Allion() {
    }

    public Allion(String engine, int model, BuildCar BuildCar) {
        this.engine = engine;
        this.model = model;
        this.BuildCar = BuildCar;
    }

    public Allion(String engine, int model, BuildCar BuildCar, String color) {
        super(color);
        this.engine = engine;
        this.model = model;
        this.BuildCar = BuildCar;
    }

    public Allion(String engine, int model, BuildCar BuildCar, String color, boolean is_Purchased) {
        super(color, is_Purchased);
        this.engine = engine;
        this.model = model;
        this.BuildCar = BuildCar;
    }
    
    public String showEngine(){
        return engine;
    }
    
    public int recModel(){
        return model;
    }

    @Override
    public String toString() {
        return "Allion{" + "engine=" + engine + ", model=" + model + ", BuildCar=" + BuildCar + '}';
    }
    
    
}
