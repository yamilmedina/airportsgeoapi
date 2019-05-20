package dev.yamil.airportsgeoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("dev.yamil.airportsgeoapi")
public class AirportsGeoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportsGeoApiApplication.class, args);
	}

}
