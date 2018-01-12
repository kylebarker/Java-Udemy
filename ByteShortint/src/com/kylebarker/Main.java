package com.kylebarker;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        System.out.println(myMaxValue);

        // Min byte value
        byte myByteValue = -128;
        byte myMaxByte = 127;


        // short has a width of 16
        short myShortValue = -3000;
        short myShortMaxValue = 32767;

        // long has a width of 64
        long myLongValue = 100L;
        System.out.println(myLongValue);

        //When doing any type of math on a byte, short or long, you need to use a byte short or long value. The default for a number is an int.
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println(myNewByteValue);
        short newShortValue = (short) (myShortValue/2);
        System.out.println(newShortValue);




    }
}
