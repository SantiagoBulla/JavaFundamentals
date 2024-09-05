package com.lq.exercises;

public class Coffee {
    private int temperature;

    public Coffee(int temperature) throws TooHotException {
        setTemperature(temperature);
    }

    public Coffee() {

    }

    public void setTemperature(int temperature) throws TooHotException {
        if (temperature > 120) {
            throw new TooHotException("The coffe is too hot!");
        }
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
