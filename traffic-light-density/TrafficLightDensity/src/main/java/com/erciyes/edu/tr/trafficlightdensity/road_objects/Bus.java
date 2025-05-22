package com.erciyes.edu.tr.trafficlightdensity.road_objects;
//Vehicle’den türeyen duraklı yolcu aracı.
public class Bus extends Vehicle {
    public Bus(String id, double length, double width, double speed, Direction direction) {
        super(id, length, width, speed, direction);
    }

    @Override
    public void move() {

    }
}
