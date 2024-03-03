package com.example.GeoJSONWithMongo.repository;

import com.example.GeoJSONWithMongo.beans.LocationEntity;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface locationRepository extends MongoRepository<LocationEntity, String> {

    List<LocationEntity> findByLocationNear(Point p, Distance d);

}