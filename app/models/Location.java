package models;

import java.util.*;

import javax.persistence.*;

import com.gargoylesoftware.htmlunit.javascript.host.Text;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;

@Entity
public class Location extends Model {

	@Id
	@Column (name = "location_id")
	private Long locationId;

	@Column
	private Text country;

	@Column
	private Text region;
	
	@Column
	private Text city;
	
	@Column (name = "location_textual")
	private Text locationTextual;
	
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

	public Text getCountry() {
		return country;
	}

	public void setCountry(Text country) {
		this.country = country;
	}

	public Text getRegion() {
		return region;
	}

	public void setRegion(Text region) {
		this.region = region;
	}

	public Text getCity() {
		return city;
	}

	public void setCity(Text city) {
		this.city = city;
	}

	public Text getLocationTextual() {
		return locationTextual;
	}

	public void setLocationTextual(Text locationTextual) {
		this.locationTextual = locationTextual;
	}
	
}