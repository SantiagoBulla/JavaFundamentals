package com.learnquest.demos.transport;

import java.time.LocalDate;
import java.time.Period;

/**
 * Car
 */
public abstract class Car implements Vehicle {
    private String name;
    private int speed;
    private int gasoline;
    private boolean engineState;

    // private static final int MAX_SPEED = 100;

    public Car() {
    }

    public Car(String name) throws SpeedException {
        this(name, 0, 0, false, LocalDate.of(1961, 9, 5));
    }

    public Car(String name, int speed, int gasoline, boolean engineState, LocalDate manufactured)
            throws SpeedException {
        setName(name);
        setSpeed(speed);
        setGasoline(gasoline);
        setEngineState(engineState);
        setManufactured(manufactured);
    }

    public int getGasoline() {
        return gasoline;
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }

    public boolean isEngineState() {
        return engineState;
    }

    public void setEngineState(boolean engineState) {
        this.engineState = engineState;
    }

    private LocalDate manufactured;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) throws SpeedException {
        // int maximumSpeed = 65;
        // if (speed <= maximumSpeed) {
        // this.speed = speed;
        // } else {
        // this.speed = maximumSpeed;
        // }

        // this.speed = speed <= maximumSpeed ? speed : maximumSpeed;
        // this.speed = Math.min(speed, MAX_SPEED);
        // this.speed = min(speed, MAX_SPEED);
        // this.speed = min(speed, getMaxSpeed());

        if (speed > getMaxSpeed()) {
            throw new SpeedException(
                    String.format("%s cannot go %dmph. Max Speed is %d", getName(), speed, getMaxSpeed()));
        }
        this.speed = speed;
    }

    public LocalDate getManufactured() {
        return manufactured;
    }

    public void setManufactured(LocalDate manufactured) {
        this.manufactured = manufactured;
    }

    public int getAge() {
        return Period.between(getManufactured(), LocalDate.now()).getYears();
    }

    public void setTiresPressures(int... pressures) { // los parametros se leen como un array int[]{pressures}
        for (int pressure : pressures) {
            System.out.print(pressure);
        }
        System.err.println();
    }

    public abstract int getMaxSpeed();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car))
            return false; /* Validamos que el obj sea del tipo de la clase */

        Car other = (Car) obj; /* Se castea explicitamente al tipo de la clase */

        return name.equals(other.getName()); /* Se valida si es igual */
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        if (getManufactured() == null)
            return String.format("%s is traveling at %d mph%n", getName(), getSpeed());
        else
            return String.format("%s is %d years old and is traveling at %d mph", getName(), getAge(),
                    getSpeed());
    }

}