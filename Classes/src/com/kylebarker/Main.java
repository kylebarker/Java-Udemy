package com.kylebarker;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car ford = new Car();
        porsche.setModel("911 Turbo");
        System.out.println("Model is a " + porsche.getModel());

    }
}
