package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.ExpressionList;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import play.mvc.Result;
import models.*;

@Entity
@Table(name="Context")
public class Context extends Model {

	@Id
	@Column (name = "context_id")
	private Long contextId;

	@Column (name = "person_for_id")
	private Long personId;
	
	@Column (name = "city_for_id")
	private Location cityForId;
	
	@Column
	private FuzzyDate date;

	@Column
	private Boolean enabled;
	
//metodi
	
	public static Finder<Long,Context> find = new Finder(
		    Long.class, Context.class
		  );
  
  public static List<Context> all() {
    return find.all();
  }
  
  public static void create(Context context) {
	  context.save();
  }
  
  public static void delete(Long id) {
	  find.ref(id).delete();
  }
  
  public static void update(Long id) {
	  find.ref(id).update();
  }
  
  public static Context findbyPerson(Long personId) {
	  List <Context> contextOfPerson = find.where().eq("personId", personId)
			  .findList();
	  if (contextOfPerson != null && !contextOfPerson.isEmpty()) {
		  return contextOfPerson.get(contextOfPerson.size()-1);
	  }
	  else return null;
  }
  
  public static Context getContextByDate(FuzzyDate date) {
	  List <Context> contextByDate = find.where().eq("date", date)
			  .findList();
	  if (contextByDate != null && !contextByDate.isEmpty()) {
		  return contextByDate.get(contextByDate.size()-1);
	  }
	  else return null;
  }
  
  public static Context getContextByLocation(Location cityForId) {
	  List <Context> contextByLocation = find.where().eq("city_for_id", cityForId)
			  .findList();
	  if (contextByLocation != null && !contextByLocation.isEmpty()) {
		  return contextByLocation.get(contextByLocation.size()-1);
	  }
	  else return null;
  }
  
  
//getter e setter	

	public Long getContextId() {
		return contextId;
	}

	public void setContextId(Long contextId) {
		this.contextId = contextId;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
}