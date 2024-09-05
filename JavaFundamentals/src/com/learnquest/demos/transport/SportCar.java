package com.learnquest.demos.transport;

import java.time.LocalDate;

public class SportCar extends Car {

    public SportCar() {
    }

    public SportCar(String name) throws SpeedException {
        super(name);
    }

    public SportCar(String name, int speed, int gasoline, boolean engineState, LocalDate manufactured)
            throws SpeedException {
        super(name, speed, gasoline, engineState, manufactured);
    }

    @Override /* Polimorfismo */
    public void setSpeed(int speed) throws SpeedException {
        super.setSpeed((int) (speed * 1.10));
    }

    @Override
    public int getMaxSpeed() {
        return 350;
    }

    public void race() {
        try {
            setSpeed(getMaxSpeed());
        } catch (SpeedException e) {
            e.printStackTrace();
        }
    }

}
