package com.AirlineSystem.model;

public class ResultPojo {
    String route;
    String cost;

    public ResultPojo() {
    }

    public ResultPojo(String route, String cost) {
        this.route = route;
        this.cost = cost;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ResultPojo{" +
                ", route='" + route + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
