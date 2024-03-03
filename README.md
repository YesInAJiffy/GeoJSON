# GeoJSON

## VIDEO TUTORIAL ON HOW TO APPLY
[![](https://markdown-videos-api.jorgenkh.no/youtube/BI3jEyNjURY)](https://www.youtube.com/watch?v=BI3jEyNjURY)
https://www.youtube.com/watch?v=BI3jEyNjURY

## Update application.properties
spring.data.mongodb.uri=mongodb://localhost:27017
spring.data.mongodb.database=GeoJSONWithMongoDB
spring.data.mongodb.username={PLACE USERNAME}
spring.data.mongodb.password={PLACE CORRECT PASSWORD}
spring.data.mongodb.authdb=admin

## ENTRIES IN THE MONGO DB
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
