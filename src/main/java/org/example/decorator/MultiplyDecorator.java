package org.example.decorator;

public class MultiplyDecorator extends CalculatorDecorator {
    public MultiplyDecorator(Calculator calculator) {
        super(calculator);
    }

    @Override
    public double firstNumber() {
        return calculator.firstNumber();
    }

    @Override
    public double secondNumber() {
        return calculator.secondNumber();
    }


    @Override
    public double output() {
        return firstNumber * secondNumber;
    }

    @Override
    public String logg() {
        return calculator.logg() + firstNumber + " * " + secondNumber + " = " + output() + "\n";
    }
}
