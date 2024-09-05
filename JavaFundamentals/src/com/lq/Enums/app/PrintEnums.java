package com.lq.Enums.app;

import com.lq.Enums.enums.TirePressures;

public class PrintEnums {
    public static void main(String[] args) {

        TirePressures tp = TirePressures.valueOf("RR");
        tp.overridePressure(22);

        for (TirePressures tPressures : TirePressures.values()) {
            System.out.printf("%s is %d pounds%n",
                    tPressures.getName(), tPressures.getPressure());
        }
    }
}
