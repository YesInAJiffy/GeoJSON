package com.example.GeoJSONWithMongo.beans;

import lombok.Data;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "locations")
public class LocationEntity {
    private String id;
    private String place;
    private String message;
    private GeoJsonPoint location;
}
/*
{
  "place": "Statue of Liberty",
  "message": "Beautiful tourism place",
  "location": {
    "type": "Point",
    "coordinates": [
      -74.044502,
      40.689247
    ]
  }
}

{
  "place": "Mysore Palace",
  "message": "Beautiful tourism place",
  "location": {
    "type": "Point",
    "coordinates": [
      76.654549,
      12.305199
    ]
  }
}

{
  "place": "Taj Mahal",
  "message": "Beautiful tourism place",
  "location": {
    "type": "Point",
    "coordinates": [
      78.042068,
      27.173891
    ]
  }
}
 */