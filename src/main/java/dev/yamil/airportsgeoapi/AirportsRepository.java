package dev.yamil.airportsgeoapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AirportsRepository extends MongoRepository<Airport, String> {

    Airport findAirportByIata(String iata);
}
