package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;

@Entity
public class Location extends Model {

	@Id
	@Column (name = "location_id")
	private Long locationId;

	@Column
	private String country;

	@Column
	private String region;
	
	@Column
	private String city;
	
	@Column (name = "location_textual")
	private String locationTextual;
	
//metodi
	
	public static Finder<Long,Location> find = new Finder(
		    Long.class, Location.class
		  );
  
  public static List<Location> all() {
    return find.all();
  }
  
  public static void create(Location location) {
	  location.save();
  }
  
  public static void delete(Long id) {
	  find.ref(id).delete();
  }
  
  public static void update(Long id) {
	  find.ref(id).update();
  }
  
  public static Location findbyPerson(Long personId) {
	  List <Location> contextOfPerson = find.where().eq("personId", personId)
			  .eq("enabled", true)
			  .findList();
	  if (contextOfPerson != null && !contextOfPerson.isEmpty()) {
		  return contextOfPerson.get(contextOfPerson.size()-1);
	  }
	  else return null;
	  
  }

//getter e setter	

  public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
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

	public String getLocationTextual() {
		return locationTextual;
	}

	public void setLocationTextual(String locationTextual) {
		this.locationTextual = locationTextual;
	}
	
}