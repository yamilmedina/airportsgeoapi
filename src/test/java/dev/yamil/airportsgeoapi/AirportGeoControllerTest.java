package dev.yamil.airportsgeoapi;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AirportGeoControllerTest {

    private AirportGeoController airportGeoController;

    @Mock
    private AirportsRepository airportsRepository;

    @Before
    public void setUp() throws Exception {
        airportGeoController = new AirportGeoController(airportsRepository);
    }

    @Test
    public void returnStatusOkAndDataFromRepository() {
        when(airportsRepository.findAll()).thenReturn(stubAirportsResponse());

        var responseEntity = airportGeoController.fetchAllAirports();

        assertThat(responseEntity.getStatusCode(), is(HttpStatus.OK));
        assertThat(responseEntity.getBody().size(), is(2));
    }

    @Test
    public void returnStatusOkAndDataForSpecificAirportByIata() {
        var madridIataCode = "MAD";
        when(airportsRepository.findAirportByIata(madridIataCode))
                .thenReturn(stubAirportsResponse().stream()
                        .filter(a -> madridIataCode.equalsIgnoreCase(a.getIata())).findFirst().get()
                );

        var airportResponseEntity = airportGeoController.fetchAirportInfoByIataCode(madridIataCode);

        assertThat(airportResponseEntity.getStatusCode(), is(HttpStatus.OK));
        assertThat(airportResponseEntity.getBody().getIata(), is(madridIataCode));
    }

    @Test(expected = IllegalArgumentException.class)
    public void returnStatusCode400AndEmptyDataWhenInvalidParams() {
        airportGeoController.fetchAirportInfoByIataCode("a");
    }

    private List<Airport> stubAirportsResponse() {
        Airport sclAirport = AirportBuilder.anAirport()
                .withIcao("SCEL")
                .withIata("SCL")
                .withCity("Santiago")
                .withCountry("Chile")
                .build();

        Airport madAirport = AirportBuilder.anAirport()
                .withIcao("LEMD")
                .withIata("MAD")
                .withCity("Madrid")
                .withCountry("España")
                .build();

        return List.of(sclAirport, madAirport);
    }
}