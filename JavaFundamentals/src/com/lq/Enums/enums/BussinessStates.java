package com.lq.Enums.enums;

public enum BussinessStates {
    NY("New York City", "Albany"), PA("Pennsylvania", "Harrisburg"), FL("Florida", "Tallahasse");

    private String name;
    private String capitol;

    public String getName() {
        return name;
    }

    public String getCapitol() {
        return capitol;
    }

    private BussinessStates(String name, String capitol) {
        this.name = name;
        this.capitol = capitol;
    }
}
