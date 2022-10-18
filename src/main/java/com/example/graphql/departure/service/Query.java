package com.example.graphql.departure.service;

import com.example.graphql.departure.model.Departure;
import com.example.graphql.departure.model.DepartureRepository;
import org.springframework.stereotype.Component;

@Component
public class Query {
    private DepartureRepository departureRepository;

    public Query(DepartureRepository departureRepository){
        this.departureRepository = departureRepository;
    }

    public Iterable<Departure> findAllDepartures() {
        return departureRepository.findAll();
    }
}
