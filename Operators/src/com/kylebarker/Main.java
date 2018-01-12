package com.kylebarker;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println((previousResult + " - 1 = " + result));

        previousResult = result;

        result = result * 10;
        System.out.println((previousResult + " * 10 = " + result));


        previousResult = result;

        result = result / 5;
        System.out.println((previousResult + " / 5 = " + result));

        previousResult = result;

        result = result % 3;
        System.out.println((previousResult + " % 3 = " + result));


        result++;
        System.out.println("result in now " + result);

        result--;
        System.out.println("result in now " + result);

        result +=2;
        System.out.println("result in now " + result);

        result *=10;
        System.out.println("result in now " + result);

        result /=10;
        System.out.println("result in now " + result);




        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore != 100)
            System.out.println("You got the high score!");

        if (topScore >= 100)
            System.out.println("You got the top score");

        int secondTopScore = 81;
        if((topScore < secondTopScore) && (secondTopScore < 100))
            System.out.println("Greater than top score and less than 100");


        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these test are true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("You need two equal signs here");

        boolean isCar = false;
        if(isCar = true)
            System.out.println("This is not supposed to happen. You need two equals and not 1. if you just do if(isCar) will check correctly as well");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");


        double twenty = 20;
        double eighty = 80;
        double myValue = (twenty + eighty) * 25;
        double remainderValue = myValue % 40;
        if(remainderValue <= 20)
            System.out.println("Total was over the limit");
        System.out.println(remainderValue);
    }
}
