package com.AirlineSystem.util;

import com.AirlineSystem.model.FlightTrip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Graph {
    HashMap<String, ArrayList<String>> map=new HashMap<>();
    List<String> city;

    public Graph(ArrayList<FlightTrip> trips, List<String> city) {
        this.city = city;
        for (FlightTrip trip : trips) {
            map.putIfAbsent(trip.getSource(), new ArrayList<>());
            map.get(trip.getSource()).add(trip.getDestination());
//            map.putIfAbsent(trip.getDestination(), new ArrayList<>());
//            map.get(trip.getDestination()).add(trip.getSource());
        }
    }

    public List<List<String>> generateAllPossiblePath(String src, String des) {

        List<List<String>> result = new ArrayList<>();
        HashMap<String, Boolean> visit = new HashMap<String, Boolean>();
        List<String> path = new ArrayList<>();
        visit.put(src,true);
        generateAllPossiblePathUtil(src, des, visit, result, Arrays.asList(src));
        return result;
    }

    private void generateAllPossiblePathUtil(String src, String des, HashMap<String, Boolean> visit, List<List<String>> result, List<String> path) {
        if (src.equals(des)) {
            result.add(path);
            return;
        }

        for (String str : map.get(src)) {
            if (!visit.getOrDefault(str, false)) {
                visit.put(str, true);
                List<String> newPath = new ArrayList<>(path);
                newPath.add(str);
                generateAllPossiblePathUtil(str, des, visit, result, newPath);
                visit.put(str, false);
            }
        }
    }
    public static void main(String args[])
    {
        ArrayList<FlightTrip> trips = new ArrayList<FlightTrip>();
        trips.add(new FlightTrip("Kolkata","Delhi","06:10",3000));
        trips.add(new FlightTrip("Kolkata","Chennai","06:10",2000));
        trips.add(new FlightTrip("Chennai","Mumbai","08:00",1500));
        trips.add(new FlightTrip("Mumbai","Pune","10:10",1000));
        trips.add(new FlightTrip("Mumbai","Kolkata","07:10",4500));
        trips.add(new FlightTrip("Pune","Kolkata","12:10",2100));
        trips.add(new FlightTrip("Delhi","Chennai","10:00",1700));
        trips.add(new FlightTrip("Delhi","Pune","11:00",2100));
        List<String> list=Arrays.asList("Kolkata","Mumbai","Chennai","Pune","Delhi");
        Graph g=new Graph(trips,list);
        System.out.println(g.generateAllPossiblePath("Delhi","Chennai"));
    }


}
