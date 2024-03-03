package com.example.GeoJSONWithMongo.service;


import com.example.GeoJSONWithMongo.beans.LocationEntity;
import com.example.GeoJSONWithMongo.repository.locationRepository;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class locationservice {
    private locationRepository locationOffersRepository;
    public locationservice(locationRepository locationOffersRepository)
    {
        this.locationOffersRepository = locationOffersRepository;
    }
    public List<LocationEntity> locations(String latitude, String longitude, double distance)
    {
        return locationOffersRepository.findByLocationNear(
                new Point(Double.valueOf(longitude), Double.valueOf(latitude)),
                new Distance(distance, Metrics.KILOMETERS));
    }
}