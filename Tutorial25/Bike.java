package com.vishwajeet;

import java.util.Locale;

public class Bike {
    private String model;
    private String brand;
    private String engine;
    private int tyres;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("splender") || validModel.equals("passion")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel(){
        return this.model;
    }


}
