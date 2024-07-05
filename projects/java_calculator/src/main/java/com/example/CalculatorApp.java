package com.example;

import java.util.Random;

public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("Calculator App");

        Calculator calculator = new Calculator();

        // Create a Random object
        Random random = new Random();

        // Generate two random integers
        int num1 = random.nextInt(100); // random integer between 0 and 99
        int num2 = random.nextInt(100); // random integer between 0 and 99

        // Call calculator.add with the two random integers
        int result = calculator.add(num1, num2);

        // Print the result
        System.out.println("The result of adding " + num1 + " and " + num2 + " is: " + result);
    }
}