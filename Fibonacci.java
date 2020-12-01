package com.sparta.daniel;

public class Fibonacci {

    public static void fibonacciBetweenTheseNumbers(int upperLimit){
        // Did not introduce lower limit as 0 causes infinity loop
        int number1 = 0;
        int number2 = 1;

        Printer.printMessage("Number: " + number1);
        Printer.printMessage("Number: " + number2);


        while(number1 + number2 < upperLimit){
            int number3 = number1 + number2;
            Printer.printMessage("Number: " + number3);
            number1 = number2;
            number2 = number3;
        }
    }
}
