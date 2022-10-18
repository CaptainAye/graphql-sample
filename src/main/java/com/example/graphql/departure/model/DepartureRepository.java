package com.example.graphql.departure.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartureRepository extends JpaRepository<Departure, Long> {
}
