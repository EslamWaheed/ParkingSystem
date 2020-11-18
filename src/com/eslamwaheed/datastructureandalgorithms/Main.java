package com.eslamwaheed.datastructureandalgorithms;

public class Main {

    public static void main(String[] args) {
        ParkingController parkingController = new ParkingController();

        /**
         * test first range from 12am to 6am *free*
         */
        Vehicle vehicle1 = new Vehicle();

        System.out.println(parkingController.enter(vehicle1, 0));

        System.out.println(parkingController.exit(vehicle1, 6));

        /**
         * test second range from 6am to 10am *3$*
         */
        Vehicle vehicle2 = new Vehicle();

        System.out.println(parkingController.enter(vehicle2, 6));

        System.out.println(parkingController.exit(vehicle2, 10));

        /**
         * test third range from 10 am to 11pm *1$*
         */
        Vehicle vehicle3 = new Vehicle();

        System.out.println(parkingController.enter(vehicle3, 10));

        System.out.println(parkingController.exit(vehicle3, 23));

        /**
         * test first test case from 3am to 9am
         */
        Vehicle vehicle4 = new Vehicle();

        System.out.println(parkingController.enter(vehicle4, 3));

        System.out.println(parkingController.exit(vehicle4, 9));

        /**
         * test second test case from 11am to 9pm
         */
        Vehicle vehicle5 = new Vehicle();

        System.out.println(parkingController.enter(vehicle5, 11));

        System.out.println(parkingController.exit(vehicle5, 21));
    }
}
