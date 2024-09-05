package com.javaoo.calculators;

public class BasicCalculator {
    /*
     * Los metodos se declaran [final] porque no puede ser sobre escritos por sus
     * clases hijas
     */

    public final double add(double x, double y) {
        return x + y;
    }

    public final double subtract(double x, double y) {
        return x - y;
    }

    public final double multiply(double x, double y) {
        return x * y;
    }

    public final double divide(double x, double y) {
        return x / y;
    }
}
