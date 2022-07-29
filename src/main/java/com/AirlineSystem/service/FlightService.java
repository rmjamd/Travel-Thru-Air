package com.AirlineSystem.service;

import com.AirlineSystem.dao.FlightDatabase;
import com.AirlineSystem.model.FlightTrip;
import com.AirlineSystem.model.ResultPojo;
import com.AirlineSystem.util.Graph;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Component
public class FlightService {
    FlightDatabase database;

    public ArrayList<ResultPojo> getAllPossiblePath(String source, String des) {

        List<FlightTrip> trips = FlightDatabase.getTrips();
        List<String> cities = FlightDatabase.getCityList();
        Graph g = new Graph(trips, cities);

        List<List<String>> paths=g.generateAllPossiblePath(source, des);
        ArrayList<ResultPojo> results=new ArrayList<>();
        for(List<String> route:paths)
        {
            String temp= route.get(0);
            String prev=new String(temp);
            BigInteger cost = BigInteger.valueOf(0);
            for(int i=1;i<route.size();i++)
            {
                cost=cost.add(FlightDatabase.getCost(prev,route.get(i)));
                temp+=(" -> "+route.get(i));
                prev= route.get(i);
            }
            results.add(new ResultPojo(temp,cost.toString()));
        }
        return results;
    }

    public List<FlightTrip> getAllTrip() {

        return FlightDatabase.getTrips();

    }

}
