package patterns.structural.wrappers.decorator.task.impl;

import patterns.structural.wrappers.decorator.task.Calculable;

public class LogableCalculator implements Calculable {
    private final Calculable calculable;

    public LogableCalculator(Calculable calculable) {
        this.calculable = calculable;
    }



    @Override
    public void sum(double a, double b) {
        System.out.println(String.format("Суммирую %s и %s", a,b));
        calculable.sum(a, b);

    }

    @Override
    public void multiply(double a, double b) {
        System.out.println(String.format("Умножаю %s и %s", a,b));
        calculable.multiply(a, b);

    }

    @Override
    public void divide(double a, double b) {
        System.out.println(String.format("Вычитаю %s и %s", a,b));
        calculable.divide(a, b);

    }

    @Override
    public void subtraction(double a, double b) {
        System.out.println(String.format("Делю %s и %s", a,b));
        calculable.subtraction(a, b);

    }

    @Override
    public double result() {
        return calculable.result();
    }

    @Override
    public void clear() {
        calculable.clear();
    }
}
