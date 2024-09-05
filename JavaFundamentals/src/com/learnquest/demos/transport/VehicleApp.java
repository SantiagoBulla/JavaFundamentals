package com.learnquest.demos.transport;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class VehicleApp {

    public static List<Vehicle> populate() {

        List<Vehicle> vehicles = new ArrayList<>();

        try {
            Car car54 = new SportCar();
            car54.setName("Car 54");
            car54.setSpeed(20);
            car54.setManufactured(LocalDate.of(1961, 9, 17));
            car54.setTiresPressures(89);

            vehicles.add(car54);
        } catch (SpeedException e) {
            e.printStackTrace();
        }

        try {
            Car mach5 = new SportCar();
            mach5.setName("mach V");
            mach5.setSpeed(250);
            mach5.setManufactured(LocalDate.of(1967, 4, 2));

            vehicles.add(mach5);
        } catch (SpeedException e) {
            e.printStackTrace();
        }
        try {

            StationWagon stationWagon = new StationWagon("StationWagon");
            stationWagon.setSpeed(250);
            stationWagon.setManufactured(LocalDate.of(1985, 8, 1));
            stationWagon.setCurrentCargoLoad(45);

            vehicles.add(stationWagon);
        } catch (SpeedException e) {
            e.printStackTrace();
        }
        try {

            Suv suv = new Suv("Jurassic Explorer");
            suv.setManufactured(LocalDate.of(1993, 6, 11));
            suv.setCurrentCargoLoad(500);
            suv.setSpeed(25);

            vehicles.add(suv);
        } catch (SpeedException e) {
            e.printStackTrace();
        }

        return vehicles;

    }

    public static void main(String[] args) {
        // Car car54 = new SportCar();
        // car54.setName("Car 54");
        // car54.setSpeed(20);
        // car54.setManufactured(LocalDate.of(1961, 9, 17));
        // car54.setTiresPressures(89);

        // Car mach5 = new SportCar();
        // mach5.setName("mach V");
        // mach5.setSpeed(250);
        // mach5.setManufactured(LocalDate.of(1967, 4, 2));

        // StationWagon stationWagon = new StationWagon("StationWagon");
        // stationWagon.setSpeed(250);
        // stationWagon.setManufactured(LocalDate.of(1985, 8, 1));
        // stationWagon.setCurrentCargoLoad(45);

        // Suv suv = new Suv("Jurassic Explorer");
        // suv.setManufactured(LocalDate.of(1993, 6, 11));
        // suv.setCurrentCargoLoad(500);
        // suv.setSpeed(25);

        // for (Vehicle vehicle : new Vehicle[] { car54, mach5, stationWagon }) {
        // if (vehicle instanceof SportCar) {
        // ((SportCar) vehicle).race(); // shortcut rather than SportCar sc = new
        // (SportCar) car;
        // } else {
        // Vehicle.travelAtSpeedLimit(vehicle);
        // }
        // System.out.println(vehicle);
        // }

        List<Vehicle> vehicles = populate();

        // Lamdda Expression
        // List<Vehicle> vehicles = Arrays.asList(car54, mach5, stationWagon, suv);
        // vehicles.forEach(vehicle -> {
        // if (vehicle instanceof SportCar) {
        // ((SportCar) vehicle).race(); // shortcut rather than SportCar sc = new
        // (SportCar) car;
        // } else {
        // Vehicle.travelAtSpeedLimit(vehicle);
        // }
        // System.out.println(vehicle);
        // });
        // System.out.println(stationWagon.getCurrentCargoLoad());
        // car54.setTiresPressures(1, 2, 3, 4, 5, 6);
        // mach5.setTiresPressures(new int[] { 9, 8, 7, 6, 5, 4, 3 });

        Consumer<Vehicle> go25 = vehicle -> {
            try {
                vehicle.setSpeed(25);
            } catch (SpeedException e) {
                 
                e.printStackTrace();
            }
        };
        vehicles.forEach(go25.andThen(System.out::println));

        Collection<Integer> speeds = Arrays.asList(15, 25, 35, 55);
        Consumer<Vehicle> stop = Vehicle::stop;

        speeds.forEach(speed -> {
            Consumer<Vehicle> setSpeed = vehicle -> {
                try {
                    vehicle.setSpeed(speed);
                } catch (SpeedException e) {
                     
                    e.printStackTrace();
                }
            };
            vehicles.forEach(setSpeed.andThen(System.out::println));
            Consumer<Vehicle> speedAndPrint = setSpeed.andThen(System.out::println);
            vehicles.forEach(speedAndPrint.andThen(stop).andThen(System.out::println));
        });
    }
}
