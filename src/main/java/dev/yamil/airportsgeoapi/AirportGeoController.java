package dev.yamil.airportsgeoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airports")
public class AirportGeoController {

    @GetMapping
    public void fetchAllAirports() {

    }

    @GetMapping("/{iataCode}")
    public void fetchAirportInfo(@PathVariable String iataCode) {

    }


}
