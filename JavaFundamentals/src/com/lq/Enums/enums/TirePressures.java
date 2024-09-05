package com.lq.Enums.enums;

public enum TirePressures {
    LF(30, "Left Front"), RF(30, "Right Front"), LR(32, "Left Rear"), RR(32, "Right Rear");

    private int pressure;
    private String name;

    public String getName() {
        return name;
    }

    public int getPressure() {
        return pressure;
    }

    private TirePressures(int pressure, String name) {
        this.pressure = pressure;
        this.name = name;
    }

    public void overridePressure(int pressure) {
        this.pressure = pressure;
    }
}