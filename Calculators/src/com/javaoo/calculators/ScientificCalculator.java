package com.javaoo.calculators;

public class ScientificCalculator {
    /*
     * Es estatico porque puede ser compartido por las instancias de la clase
     * Declarado final lo que permite que sea publico ya que su valor no se
     * alterará.
     */
    public static final double PI = 3.14159;
    private double holdValue;

    public static final double exp(double x) {
        return Math.pow(x, 2);
        // return x * x;
        // return (0);
    }

    public static final double log(double x) {
        return Math.log(x);
        // return (0);
    }

    public final void putValueInMemory(double value) {
        holdValue = value;
    }

    public final double getValueFromMemory() {
        return holdValue;
    }
}
