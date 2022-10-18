package com.example.graphql.departure.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departure {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String destination;
    private Float arrival_time;
    private String airline;
    private String aircraft_make;
    private String aircraft_model;
    private String terminal;

    public Departure() {
    }

    public Departure(Long id, String destination, Float arrival_time, String airline, String aircraft_make, String aircraft_model, String terminal) {
        this.id = id;
        this.destination = destination;
        this.arrival_time = arrival_time;
        this.airline = airline;
        this.aircraft_make = aircraft_make;
        this.aircraft_model = aircraft_model;
        this.terminal = terminal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Float getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(Float arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAircraft_make() {
        return aircraft_make;
    }

    public void setAircraft_make(String aircraft_make) {
        this.aircraft_make = aircraft_make;
    }

    public String getAircraft_model() {
        return aircraft_model;
    }

    public void setAircraft_model(String aircraft_model) {
        this.aircraft_model = aircraft_model;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }


}
