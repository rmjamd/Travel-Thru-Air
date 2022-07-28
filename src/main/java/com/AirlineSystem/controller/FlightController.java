package com.AirlineSystem.controller;

import com.AirlineSystem.model.Booking;
import com.AirlineSystem.service.FlightService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/airline")
public class FlightController {


    FlightService service;
    @GetMapping("/add")
    public String viewBooks(Booking booking){
   //     model.addAttribute("books", bookService.getBooks());
        return "";
    }
}