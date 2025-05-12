package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Odaishi's Simple Calculator!");
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter an operation (+, -, *, /): ");
        char op = input.next().charAt(0);

        System.out.print("Enter second number ");
        double num2 = input.nextDouble();

        double result = 0;

        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("You can't divide by zero.");
                return;
            }
        } else {
            System.out.println("Invalid operator.");
            return;
        }

        System.out.println("Result: " + result);
    }
}
