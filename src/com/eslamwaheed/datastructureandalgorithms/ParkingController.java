package com.eslamwaheed.datastructureandalgorithms;

import java.util.ArrayList;

public class ParkingController {
    //parking capacity
    private final int parkingSize = 2;
    private ArrayList<Vehicle> vehicles;

    public ParkingController() {
        vehicles = new ArrayList<>();
    }

    /**
     * add vehicle to parking
     *
     * @param vehicle
     * @param entryTime
     * @return
     */
    boolean enter(Vehicle vehicle, int entryTime) {
        if (vehicles.size() < parkingSize) {
            vehicle.setEntryTime(entryTime);
            vehicles.add(vehicle);
            return true;
        }
        return false;
    }

    /**
     * remove vehicle from parking
     *
     * @param vehicle
     * @param exitTime
     * @return
     */
    int exit(Vehicle vehicle, int exitTime) {
        vehicle.setExitTime(exitTime);
        int cost = 0;
        int difference = Math.abs(vehicle.getEntryTime() - vehicle.getExitTime());
        System.out.println("difference = " + difference);
        for (int i = vehicle.getEntryTime() + 1; i <= vehicle.getExitTime(); i++) {
            System.out.println("time  = " + i);
            if (i >= 0 && i <= 6) {
                System.out.println("free");
                cost += 0;
            } else if (i >= 6 && i <= 10) {
                System.out.println("3$");
                cost += 3;
            } else if (i >= 10 && i <= 23) {
                System.out.println("1$");
                cost += 1;
            }

        }
        vehicles.remove(vehicle);
        return cost;
    }
}