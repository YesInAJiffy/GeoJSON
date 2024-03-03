package com.example.GeoJSONWithMongo.controllers;


import com.example.GeoJSONWithMongo.beans.LocationEntity;
import com.example.GeoJSONWithMongo.repository.locationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.GeoJSONWithMongo.service.locationservice;

import java.util.List;

@RestController
public class gsoncontroller {
    @Autowired
    private locationRepository repository;

    @Autowired
    private locationservice locationService;


    @GetMapping(value = "/getLocations", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<LocationEntity>> getLocations(
            @RequestParam("lat") String latitude,
            @RequestParam("long") String longitude,
            @RequestParam("d") double distance) {

        List<LocationEntity> ret = this.locationService.locations(latitude, longitude, distance);

        return new ResponseEntity<List<LocationEntity>>  (ret, HttpStatus.OK);



    }
}