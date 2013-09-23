package models;

import java.util.*;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;

import play.db.ebean.Model;


public class Location extends KnowledgeBase() {

    private Long locationId;
	
	private String locationName;
	
	private String description;

	private String continent;

	private String country;

	private String region;

	private String city;

	private Double lat;
	
	private Double lon;
	
}
	
	
	public class getLocation() {
		return Location;
	}

	public void setLocationId(class Location) {
		this.Location = Location;
	}

	
	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}


	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getDescription() {
		return description;
	}
	
	
	public void setDescription(String description) {
		this.description = description;
	}

	
	public String getContinent() {
		return continent;
	}

	
	public void setContinent(String continent) {
		this.continent = continent;
	}

	
	public String getCountry() {
		return country;
	}

	
	public void setCountry(String country) {
		this.country = country;
	}

	
	public String getRegion() {
		return region;
	}

	
	public void setRegion(String region) {
		this.region = region;
	}

	
	public String getCity() {
		return city;
	}

	
	public void setCity(String city) {
		this.city = city;
	}

	
	public Double getLat() {
		return lat;
	}

	
	public void setLat(Double lat) {
		this.lat = lat;
	}

	
	public Double getLon() {
		return lon;
	}

	
	public void setLon(Double lon) {
		this.lon = lon;
	}

