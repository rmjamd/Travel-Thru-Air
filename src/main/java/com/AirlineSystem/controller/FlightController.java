package com.AirlineSystem.controller;

import com.AirlineSystem.model.Booking;
import com.AirlineSystem.model.FlightTrip;
import com.AirlineSystem.model.ResultPojo;
import com.AirlineSystem.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class FlightController {

    @Autowired
    FlightService service;
    @GetMapping("/search")
    public String search(Booking b,Model model){
        if(b.getDestination().equals(b.getSource()))
        {
            model.addAttribute("error","Source and Destination Can not be Same");
            return "Error";
        }

        List<ResultPojo> results=service.getAllPossiblePath(b.getSource(),b.getDestination());
        model.addAttribute("results",results);
        return "display_possible_route";
    }
    @GetMapping("/show")
    public String showAllFlight(Model model){
        List<FlightTrip> trips=service.getAllTrip();
        model.addAttribute("trips",trips);
        return "display_all_route";
    }
}