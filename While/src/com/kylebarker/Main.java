package com.kylebarker;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while(count != 5){
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
	    while(true){
	        if(count == 6) {
	            break;
            }
            System.out.println("Count value is " + count);
	        count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 6);

        count = 0;
        int number = 5;
        int finishNumber = 20;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
            count++;
            System.out.println("Even count: " + count);
            if (count == 5){
                System.out.println("You have hit 5 even numbers");
                break;
            }
        }

    }

    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
}
