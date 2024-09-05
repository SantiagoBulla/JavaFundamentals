package com.learnquest.demos.transport;

import static java.lang.Math.min;
import java.time.LocalDate;

public class StationWagon extends Cargo {

    public StationWagon() {
    }

    public StationWagon(String name) throws SpeedException {
        super(name);
    }

    public StationWagon(String name, int speed, int gasoline, boolean engineState, LocalDate manufactured)
            throws SpeedException {
        super(name, speed, gasoline, engineState, manufactured);
    }

    @Override
    public void setSpeed(int speed) throws SpeedException {
        super.setSpeed(min(speed, 50));
    }

}
