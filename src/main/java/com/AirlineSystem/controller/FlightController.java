package com.AirlineSystem.controller;

import com.AirlineSystem.model.Booking;
import com.AirlineSystem.service.FlightService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FlightController {


    FlightService service;
    @GetMapping("/search")
    public String search(Booking booking){
        return "index";
    }
    @GetMapping("/show")
    public String showAllFlight(){
        return "index";
    }
}