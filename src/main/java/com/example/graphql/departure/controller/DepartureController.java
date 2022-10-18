package com.example.graphql.departure.controller;

import com.example.graphql.departure.model.Departure;
import com.example.graphql.departure.model.DepartureRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class DepartureController {

    private final DepartureRepository departureRepository;

    public DepartureController(DepartureRepository departureRepository) {
        this.departureRepository = departureRepository;
    }

    @QueryMapping
    public Iterable<Departure> findAllDepartures() {
        return departureRepository.findAll();

    }
}
