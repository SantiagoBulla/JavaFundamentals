package com.javaoo.calculators;

public class CalculatorDriver {
    public static void main(String[] args) {
        System.out.println("--- BASIC CALCULATOR ---");
        BasicCalculator basic = new BasicCalculator();
        System.out.println(basic.add(2, 8));
        System.out.println(basic.subtract(2, 8));
        System.out.println(basic.multiply(2, 8));
        System.out.println(basic.divide(2, 8));
        System.out.println();
        System.out.println("--- SCIENTIFIC CALCULATOR ---");
        System.out.println(ScientificCalculator.exp(5));
        System.out.println(ScientificCalculator.log(8));
        ScientificCalculator scientific = new ScientificCalculator();
        scientific.putValueInMemory(68.923);
        System.out.println(scientific.getValueFromMemory());
        System.out.println();
        System.out.println("--- TRIGONOMETRIC CALCULATOR ---");
        System.out.println(TrigonometricCalculator.sine(.523));
        System.out.println(TrigonometricCalculator.cosine(.523));
        System.out.println(TrigonometricCalculator.tangent(.523));
        System.out.println(TrigonometricCalculator.arcsine(.5));
        System.out.println(TrigonometricCalculator.arccosine(.5));
        System.out.println(TrigonometricCalculator.arctangent(.5));

    }
}
