package com.lq.Enums.app;

import com.lq.Enums.enums.TirePressures;

public class EnumTester {
    public static void main(String[] args) {
        for (TirePressures tPressures : TirePressures.values()) {
            System.out.println(tPressures + " " + tPressures.getPressure());
        }
    }
}
