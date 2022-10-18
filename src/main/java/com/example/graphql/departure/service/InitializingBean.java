package com.example.graphql.departure.service;

import com.example.graphql.departure.model.Departure;
import com.example.graphql.departure.model.DepartureRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class InitializingBean implements ApplicationListener<ContextRefreshedEvent> {
    private final DepartureRepository departureRepository;

    public InitializingBean(DepartureRepository departureRepository) {
        this.departureRepository = departureRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Departure departure = new Departure(1L, "EPWR", 1.0f, "RYR", "boeing", "738", "A");
        departureRepository.save(departure);

    }
}
