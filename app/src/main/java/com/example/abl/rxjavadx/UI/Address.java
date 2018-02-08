package com.example.abl.rxjavadx.UI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ABL on 08.02.2018.
 */

public class Address {

    @SerializedName("building")
    @Expose
    private String building;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("metro")
    @Expose
    private Object metro;
    @SerializedName("metro_stations")
    @Expose
    private List<Object> metroStations = null;
    @SerializedName("raw")
    @Expose
    private Object raw;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lng")
    @Expose
    private Double lng;
    @SerializedName("id")
    @Expose
    private String id;

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getMetro() {
        return metro;
    }

    public void setMetro(Object metro) {
        this.metro = metro;
    }

    public List<Object> getMetroStations() {
        return metroStations;
    }

    public void setMetroStations(List<Object> metroStations) {
        this.metroStations = metroStations;
    }

    public Object getRaw() {
        return raw;
    }

    public void setRaw(Object raw) {
        this.raw = raw;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}