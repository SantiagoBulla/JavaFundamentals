package com.lq.generics;

import static com.lq.generics.Maximum.maximum;

public class MaximumExerciser {
    public static void main(String[] args) {
        System.out.printf("Maximun of %d, %d, %d is %d%n", 5, 7, 8, maximum(5, 7, 8));
        System.out.printf("Maximun of %.1f, %.1f, %.1f is %.1f%n", 5.5, 8.6, 8.69, maximum(5.5, 8.6, 8.69));
        System.out.printf("Maximun of %s, %s, %s is %s%n", "pear", "apple", "orange",
                maximum("pear", "apple", "orange"));
    }
}
