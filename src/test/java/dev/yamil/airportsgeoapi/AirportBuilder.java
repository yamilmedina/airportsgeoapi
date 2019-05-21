package dev.yamil.airportsgeoapi;

public final class AirportBuilder {
    private String id;
    private String icao;
    private String iata;
    private String name;
    private String city;
    private String country;
    private Integer latitudeDegrees;
    private Integer latitudeMinutes;
    private Integer latitudeSeconds;
    private String latitudeDirection;
    private Integer longitudeDegrees;
    private Integer longitudeMinutes;
    private Integer longitudeSeconds;
    private String longitudeDirection;
    private Integer altitude;
    private Double latitudeDecimalDegrees;
    private Double longitudeDecimalDegrees;

    private AirportBuilder() {
    }

    public static AirportBuilder anAirport() {
        return new AirportBuilder();
    }

    public AirportBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public AirportBuilder withIcao(String icao) {
        this.icao = icao;
        return this;
    }

    public AirportBuilder withIata(String iata) {
        this.iata = iata;
        return this;
    }

    public AirportBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AirportBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public AirportBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public AirportBuilder withLatitudeDegrees(Integer latitudeDegrees) {
        this.latitudeDegrees = latitudeDegrees;
        return this;
    }

    public AirportBuilder withLatitudeMinutes(Integer latitudeMinutes) {
        this.latitudeMinutes = latitudeMinutes;
        return this;
    }

    public AirportBuilder withLatitudeSeconds(Integer latitudeSeconds) {
        this.latitudeSeconds = latitudeSeconds;
        return this;
    }

    public AirportBuilder withLatitudeDirection(String latitudeDirection) {
        this.latitudeDirection = latitudeDirection;
        return this;
    }

    public AirportBuilder withLongitudeDegrees(Integer longitudeDegrees) {
        this.longitudeDegrees = longitudeDegrees;
        return this;
    }

    public AirportBuilder withLongitudeMinutes(Integer longitudeMinutes) {
        this.longitudeMinutes = longitudeMinutes;
        return this;
    }

    public AirportBuilder withLongitudeSeconds(Integer longitudeSeconds) {
        this.longitudeSeconds = longitudeSeconds;
        return this;
    }

    public AirportBuilder withLongitudeDirection(String longitudeDirection) {
        this.longitudeDirection = longitudeDirection;
        return this;
    }

    public AirportBuilder withAltitude(Integer altitude) {
        this.altitude = altitude;
        return this;
    }

    public AirportBuilder withLatitudeDecimalDegrees(Double latitudeDecimalDegrees) {
        this.latitudeDecimalDegrees = latitudeDecimalDegrees;
        return this;
    }

    public AirportBuilder withLongitudeDecimalDegrees(Double longitudeDecimalDegrees) {
        this.longitudeDecimalDegrees = longitudeDecimalDegrees;
        return this;
    }

    public Airport build() {
        Airport airport = new Airport();
        airport.setId(id);
        airport.setIcao(icao);
        airport.setIata(iata);
        airport.setName(name);
        airport.setCity(city);
        airport.setCountry(country);
        airport.setLatitudeDegrees(latitudeDegrees);
        airport.setLatitudeMinutes(latitudeMinutes);
        airport.setLatitudeSeconds(latitudeSeconds);
        airport.setLatitudeDirection(latitudeDirection);
        airport.setLongitudeDegrees(longitudeDegrees);
        airport.setLongitudeMinutes(longitudeMinutes);
        airport.setLongitudeSeconds(longitudeSeconds);
        airport.setLongitudeDirection(longitudeDirection);
        airport.setAltitude(altitude);
        airport.setLatitudeDecimalDegrees(latitudeDecimalDegrees);
        airport.setLongitudeDecimalDegrees(longitudeDecimalDegrees);
        return airport;
    }
}
