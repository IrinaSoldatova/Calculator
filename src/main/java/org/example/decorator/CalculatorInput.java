package org.example.decorator;

import java.util.Scanner;

public class CalculatorInput implements Calculator {

    @Override
    public String logg() {
        return "Transaction logging:\n";
    }

    @Override
    public double firstNumber() {
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    @Override
    public double secondNumber() {
        System.out.println("Enter second number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    @Override
    public double output() {
        return 0;
    }
}
