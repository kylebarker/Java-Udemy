package com.kylebarker;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5 / 2;

        float myFloatValue = 5f;
        //float has 7 values of precision

        double myDoubleValue = 5.25;
        double myOtherDouble = 5.25d;
        //On doubles you can add the d to the end, but you don't have to
        //double has 16 values of precision after decimal point
        System.out.println("myIntValue = "+ myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);



    }
}
