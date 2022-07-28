package com.AirlineSystem.dao;

import com.AirlineSystem.model.FlightTrip;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FlightDatabase {
    static final HashMap<String,BigInteger> costMatrix = new HashMap<>();
    static final ArrayList<FlightTrip> trips = new ArrayList<FlightTrip>();
    static final List<String> list= Arrays.asList("Kolkata","Mumbai","Chennai","Pune","Delhi");
    static{

        trips.add(new FlightTrip("Kolkata","Delhi","06:10",3000));
        trips.add(new FlightTrip("Kolkata","Chennai","06:10",2000));
        trips.add(new FlightTrip("Chennai","Mumbai","08:00",1500));
        trips.add(new FlightTrip("Mumbai","Pune","10:10",1000));
        trips.add(new FlightTrip("Mumbai","Kolkata","07:10",4500));
        trips.add(new FlightTrip("Pune","Kolkata","12:10",2100));
        trips.add(new FlightTrip("Delhi","Chennai","10:00",1700));
        trips.add(new FlightTrip("Delhi","Pune","11:00",2100));
        trips.forEach(trip->{
            costMatrix.put(trip.getSource()+"->"+trip.getDestination(), BigInteger.valueOf(trip.getCost()));
        });

    }

    public static List<String> getCityList()
    {
       return list;
    }
    public static BigInteger getCost(String src,String des)
    {
        return costMatrix.getOrDefault(src+"->"+des,BigInteger.valueOf(0));
    }
    public static List<FlightTrip> getTrips(){
        return trips;
    }

}
