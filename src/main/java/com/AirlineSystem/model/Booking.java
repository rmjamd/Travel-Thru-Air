package com.AirlineSystem.model;

public class Booking {
    String source;
    String destination;

    public Booking() {
    }

    public Booking(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}