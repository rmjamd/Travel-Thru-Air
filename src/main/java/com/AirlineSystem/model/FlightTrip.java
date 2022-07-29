package com.AirlineSystem.model;

public class FlightTrip {
    String source;
    String destination;
    long cost;
    String time;

    public FlightTrip() {
    }

    @Override
    public String toString() {
        return "FlightTrip{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", cost=" + cost +
                ", time='" + time + '\'' +
                '}';
    }

    public FlightTrip(String source, String destination, String time, long cost) {
        this.source = source;
        this.destination = destination;
        this.cost = cost;
        this.time = time;
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

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
