package com.sparta.daniel;

import java.util.ArrayList;

public class Fibonacci {

    // Decided to write sequence based on upper limit.
    // Easily changed to number of entries in the array which could be better (depends on what exactly is required)
    public static ArrayList<Integer> generateFibonacci(int upperLimit){


        ArrayList<Integer> fibonacciSequence = new ArrayList();
        if(upperLimit < 0){
            System.err.println("A Fibonacci sequence must have an upper limit greater or equal to zero");
        }
        else {
            int number1 = 0;
            int number2 = 1;
            fibonacciSequence.add(number1);
            if(upperLimit > 0) {
                fibonacciSequence.add(number2);

                while (number1 + number2 <= upperLimit) {
                    int number3 = number1 + number2;
                    fibonacciSequence.add(number3);
                    number1 = number2;
                    number2 = number3;
                }
            }
        }

        return fibonacciSequence;
    }

    public static void printFibonacci(int upperLimit){
        Printer.printMessage("Upper Limit designated as: " + upperLimit);
        Printer.printMessage("Fibonacci Sequence: " + generateFibonacci(upperLimit));
    }
}
