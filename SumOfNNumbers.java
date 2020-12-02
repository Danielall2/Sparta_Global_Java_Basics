package com.sparta.daniel;



public class SumOfNNumbers {

    // Initially thought I should sum based on a given number
    public static void sumOfEvenNumbers(int number){
        int counter = 0;
        int summation = 0;
        while (counter <= number) {
            summation = summation + counter;
            counter = counter + 2;
        }
        Printer.printMessage("Sum of Even Numbers Up to " + number + " : " + summation);
    }

    public static void sumOfOddNumbers(int number) {
        int counter = 1;
        int summation = 0;
        while (counter <= number) {
            summation = summation + counter;
            counter = counter + 2;
        }
        Printer.printMessage("Sum of Odd Numbers Up to " + number + " : " + summation);
    }

    public static void sumOfAllNumbers(int number) {
        int counter = 1;
        int summation = 0;
        while (counter <= number) {
            summation = summation + counter;
            counter = counter + 1;
        }
        Printer.printMessage("Sum of All Numbers Up to " + number + " : " + summation);
    }

    // Method overloading allows summing using numbers given in an array
    public static void sumOfEvenNumbers(int [] array){
        int sumOfEvenArray = 0;
        for(int integer: array){
            if(integer % 2 == 0){
                sumOfEvenArray = sumOfEvenArray + integer;
            }
        }
        Printer.printMessage("Sum of Even Numbers from Array:: " + sumOfEvenArray);
    }

    public static void sumOfOddNumbers(int [] array){
        int sumOfOddArray = 0;
        for(int integer: array){
            if(integer % 2 != 0){
                sumOfOddArray = sumOfOddArray + integer;
            }
        }
        Printer.printMessage("Sum of Odd Numbers from Array:: " + sumOfOddArray);
    }

    public static void sumOfAllNumbers(int [] array){
        int sumOfArray = 0;
        for(int integer: array){
            sumOfArray = sumOfArray + integer;
        }
        Printer.printMessage("Sum of All Numbers from Array:: " + sumOfArray);
    }


}
