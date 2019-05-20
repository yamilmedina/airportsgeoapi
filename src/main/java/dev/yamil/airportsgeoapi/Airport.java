package dev.yamil.airportsgeoapi;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "airport")
public class Airport implements Serializable {

    private static final long serialVersionUID = -1L;

    @Id
    @JsonIgnore
    private String id;

    private String icao;
    @Indexed
    private String iata;
    private String name;
    private String city;
    private String country;

    @Field("latitude_degrees")
    private Integer latitudeDegrees;
    @Field("latitude_minutes")
    private Integer latitudeMinutes;
    @Field("latitude_seconds")
    private Integer latitudeSeconds;
    @Field("latitude_direction")
    private String latitudeDirection;
    @Field("longitude_degrees")
    private Integer longitudeDegrees;
    @Field("longitude_minutes")
    private Integer longitudeMinutes;
    @Field("longitude_seconds")
    private Integer longitudeSeconds;
    @Field("longitude_direction")
    private String longitudeDirection;

    private Integer altitude;

    @Field("latitude_decimal_degrees")
    private Double latitudeDecimalDegrees;
    @Field("longitude_decimal_degrees")
    private Double longitudeDecimalDegrees;


    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getLatitudeDegrees() {
        return latitudeDegrees;
    }

    public void setLatitudeDegrees(Integer latitudeDegrees) {
        this.latitudeDegrees = latitudeDegrees;
    }

    public Integer getLatitudeMinutes() {
        return latitudeMinutes;
    }

    public void setLatitudeMinutes(Integer latitudeMinutes) {
        this.latitudeMinutes = latitudeMinutes;
    }

    public Integer getLatitudeSeconds() {
        return latitudeSeconds;
    }

    public void setLatitudeSeconds(Integer latitudeSeconds) {
        this.latitudeSeconds = latitudeSeconds;
    }

    public String getLatitudeDirection() {
        return latitudeDirection;
    }

    public void setLatitudeDirection(String latitudeDirection) {
        this.latitudeDirection = latitudeDirection;
    }

    public Integer getLongitudeDegrees() {
        return longitudeDegrees;
    }

    public void setLongitudeDegrees(Integer longitudeDegrees) {
        this.longitudeDegrees = longitudeDegrees;
    }

    public Integer getLongitudeMinutes() {
        return longitudeMinutes;
    }

    public void setLongitudeMinutes(Integer longitudeMinutes) {
        this.longitudeMinutes = longitudeMinutes;
    }

    public Integer getLongitudeSeconds() {
        return longitudeSeconds;
    }

    public void setLongitudeSeconds(Integer longitudeSeconds) {
        this.longitudeSeconds = longitudeSeconds;
    }

    public String getLongitudeDirection() {
        return longitudeDirection;
    }

    public void setLongitudeDirection(String longitudeDirection) {
        this.longitudeDirection = longitudeDirection;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    public Double getLatitudeDecimalDegrees() {
        return latitudeDecimalDegrees;
    }

    public void setLatitudeDecimalDegrees(Double latitudeDecimalDegrees) {
        this.latitudeDecimalDegrees = latitudeDecimalDegrees;
    }

    public Double getLongitudeDecimalDegrees() {
        return longitudeDecimalDegrees;
    }

    public void setLongitudeDecimalDegrees(Double longitudeDecimalDegrees) {
        this.longitudeDecimalDegrees = longitudeDecimalDegrees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
