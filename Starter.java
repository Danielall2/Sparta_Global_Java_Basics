package com.sparta.daniel;



public class Starter {

    public static void start(){
        // This is included for formatting purposes
        Printer.printMessage(" ");

        // Swapping Numbers
        Printer.printMessage("----- Swapping -----");
        Swap.swapTwoNumbers(2.0,3.5);
        Swap.swapTwoNumbers(20,-40.823f);

        Printer.printMessage(" ");

        // Summation of Numbers
        Printer.printMessage("----- Summation -----");
        SumOfNNumbers.sumOfEvenNumbers(7);
        SumOfNNumbers.sumOfOddNumbers(13);
        SumOfNNumbers.sumOfAllNumbers(24);
        SumOfNNumbers.sumOfEvenNumbers(new int[]{1, 2, 3, 4, 5});
        SumOfNNumbers.sumOfOddNumbers(new int[]{1, 2, 3, 4, 5});
        SumOfNNumbers.sumOfAllNumbers(new int[]{1, 2, 3, 4, 5});

        Printer.printMessage(" ");

        // Fibonacci
        Printer.printMessage("----- Fibonacci -----");
        Fibonacci.printFibonacci(-10);
        Fibonacci.printFibonacci(0);
        Fibonacci.printFibonacci(10);
        Fibonacci.printFibonacci(1000);

        Printer.printMessage(" ");

        // Using Switch Case
        Printer.printMessage("----- Switch Case -----");
        SwitchCase.switchCase(4);
        SwitchCase.switchCase(1);
        SwitchCase.switchCase(2);
        SwitchCase.switchCase(-10);

    }
}
