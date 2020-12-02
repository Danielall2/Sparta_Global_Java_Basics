package com.sparta.daniel;

// Class created to swap
public class Swap {

    // Method for swapping two numbers
    public static void swapTwoNumbers(double number1, double number2){
        double number3 = number1;
        number1 = number2;
        number2 = number3;

        Printer.printMessage("Swapped to: " + number1 + " and " + number2);
    }



}
