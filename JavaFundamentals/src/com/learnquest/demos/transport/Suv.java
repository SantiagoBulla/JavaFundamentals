package com.learnquest.demos.transport;

import java.time.LocalDate;

public class Suv extends Cargo {

    public Suv() {
    }

    public Suv(String name) throws SpeedException {
        super(name);
    }

    public Suv(String name, int speed, int gasoline, boolean engineState, LocalDate manufactured) throws SpeedException {
        super(name, speed, gasoline, engineState, manufactured);
    }
}
