package com.keyin.aircraft.airport.rest;

import org.keyin.airport.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "airport_repo", path = "airport_repo")
public interface AirportRestRepository extends JpaRepository<Airport, Long> {
    public List<Airport> findByCode(@Param("code")String code);

    public List<Airport> findByCity_name(@Param("city_name")String cityName);
}

