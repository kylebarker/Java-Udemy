package com.kylebarker;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    // This is a setter
    // A setter allows us to do things like below where we can add validation
    // You can only set the model if it's a 911 turbo or an escape
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("911 turbo") || validModel.equals("escape")){
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    // This is a getter
    public String getModel() {
        return this.model;
    }





}




