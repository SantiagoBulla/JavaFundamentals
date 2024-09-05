package com.learnquest.demos.transport;

import java.time.LocalDate;

public class Cargo extends Car {
    // private int cargoCapacity;
    private int currentCargoLoad;

    public Cargo(String name, int speed, int gasoline, boolean engineState, LocalDate manufactured)
            throws SpeedException {
        super(name, speed, gasoline, engineState, manufactured);
    }

    public Cargo() {
    }

    public Cargo(String name) throws SpeedException {
        super(name);
    }

    public int getCurrentCargoLoad() {
        return currentCargoLoad;
    }

    public void setCurrentCargoLoad(int currentCargoLoad) {
        this.currentCargoLoad = currentCargoLoad;
    }

    @Override /* Polimorfismo */
    public void setSpeed(int speed) throws SpeedException {
        super.setSpeed(speed - getCurrentCargoLoad() / 100);
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }
}
