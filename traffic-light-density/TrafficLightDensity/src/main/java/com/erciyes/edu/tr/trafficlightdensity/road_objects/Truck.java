package com.erciyes.edu.tr.trafficlightdensity.road_objects;
//	Vehicle’den türeyen ağır yük aracı.
public class Truck extends Vehicle {

    // Truck.java - Kamyon sınıfı
    private static final double DEFAULT_LENGTH = 18.0;
    private static final double DEFAULT_WIDTH = 2.5;
    private static final double DEFAULT_SPEED = 35.0; // km/h

    public Truck(String id, Direction direction) {
        super(id, DEFAULT_LENGTH, DEFAULT_WIDTH, DEFAULT_SPEED, direction);
    }

    @Override
    public void move() {
        System.out.println("Truck " + id + " is moving at " + speed + " km/h in direction " + direction);
    }
}

