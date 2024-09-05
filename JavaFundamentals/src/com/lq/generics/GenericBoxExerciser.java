package com.lq.generics;

public class GenericBoxExerciser {
    public static void main(String[] args) {
        GenericBox<Integer> integer = new GenericBox<>();
        GenericBox<String> string = new GenericBox<>();

        string.setT("Hello World");
        integer.setT(10);

        System.out.println("IntegerBox value: " + integer.getT());
        System.out.println("StringBox value: " + string.getT());
    }
}
