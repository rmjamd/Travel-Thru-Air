package com.AirlineSystem.service;

import com.AirlineSystem.dao.FlightDatabase;
import com.AirlineSystem.model.FlightTrip;
import com.AirlineSystem.util.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightService {
    FlightDatabase database;
    public ArrayList<FlightTrip> getAllPossiblePath(String source, String des)
    {

        List<FlightTrip> trips = FlightDatabase.getTrips();
        List<String> cities=FlightDatabase.getCityList();
        Graph g=new Graph(trips,cities);
        System.out.println(g.generateAllPossiblePath(source,des));
        return null;
    }

}
