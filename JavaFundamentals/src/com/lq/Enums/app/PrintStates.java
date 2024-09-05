package com.lq.Enums.app;

import com.lq.Enums.enums.BussinessStates;

public class PrintStates {
    public static void main(String[] args) {
        for (BussinessStates bStates : BussinessStates.values()) {
            System.out.printf("State %s has as capitol %s%n", bStates.getName(), bStates.getCapitol());
        }
    }
}
