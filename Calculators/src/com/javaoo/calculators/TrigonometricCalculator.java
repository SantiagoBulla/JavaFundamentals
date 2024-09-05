package com.javaoo.calculators;

import static java.lang.Math.sin;

public class TrigonometricCalculator {
    public static double sine(double value) {
        return sin(value);
    }

    public static double cosine(double value) {
        return Math.cos(value);
    }

    public static double tangent(double value) {
        return Math.tan(value);
    }

    public static double arcsine(double value) {
        return Math.asin(value);
    }

    public static double arccosine(double value) {
        return Math.acos(value);
    }

    public static double arctangent(double value) {
        return Math.atan(value);
    }
}
