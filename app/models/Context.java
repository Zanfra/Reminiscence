package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.ExpressionList;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import play.mvc.Result;
import models.*;

@Entity
@Table
public class Context extends Model {

	@Id
	@Column (name = "context_id")
	private Long contextId;

	@Column (name = "person_for_id")
	private Long personId;

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
			  .eq("enabled", true)
			  .findList();
	  if (contextOfPerson != null && !contextOfPerson.isEmpty()) {
		  return contextOfPerson.get(contextOfPerson.size()-1);
	  }
	  else return null;
  }
  
  public static Context getPublicMementoById (Long publicMementoId) {
	  List<Context> contextOfPublicMemento = find.where().eq("contextId", publicMementoId)
			  .eq("enabled", true)
			  .findList();
	  if (contextOfPublicMemento != null && !contextOfPublicMemento.isEmpty()) {
		  return contextOfPublicMemento.get(contextOfPublicMemento.size()-1);
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