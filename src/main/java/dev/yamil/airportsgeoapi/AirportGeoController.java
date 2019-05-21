package dev.yamil.airportsgeoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/airports")
class AirportGeoController {

    private final AirportsRepository airportsRepository;

    @Autowired
    public AirportGeoController(AirportsRepository airportsRepository) {
        this.airportsRepository = airportsRepository;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Airport>> fetchAllAirports() {
        var airports = airportsRepository.findAll();
        return ResponseEntity.ok(airports);
    }

    @GetMapping(value = "/{iataCode}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Airport> fetchAirportInfoByIataCode(@PathVariable String iataCode) {
        if (iataCode.isBlank() || iataCode.length() != 3) {
            throw new IllegalArgumentException("Invalid request");
        }

        var airport = airportsRepository.findAirportByIata(iataCode);
        return ResponseEntity.ok(airport);
    }

}
