package com.erciyes.edu.tr.trafficlightdensity.road_objects;
//Vehicle’den türeyen standart binek araç.
public class Car extends Vehicle {

    // Car.java - Araba sınıfı

    private static final double DEFAULT_LENGTH = 4.5;
    private static final double DEFAULT_WIDTH = 1.8;
    private static final double DEFAULT_SPEED = 50.0; // km/h

    public Car(String id, Direction direction) {
        super(id, DEFAULT_LENGTH, DEFAULT_WIDTH, DEFAULT_SPEED, direction);
    }

    @Override
    public void move() {
        System.out.println("Car " + id + " is moving at " + speed + " km/h in direction " + direction);
    }
}
