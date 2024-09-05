package com.lq.generics;
import static com.lq.generics.GenericMethod.printArray;

public class GenericMethodExerciser {
    public static void main(String[] args) {
        Integer[] integerArray = {1,2,3,4,5,6,7,8,9};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'H','E','L','L','O'};

        System.out.println("Integer array contains");
        printArray(integerArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
