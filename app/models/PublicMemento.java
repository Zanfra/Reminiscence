package models;

import java.util.*;

import javax.persistence.*;

import org.joda.time.DateTime;

import com.gargoylesoftware.htmlunit.javascript.host.Text;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;

@Entity
public class PublicMemento extends Model {

	@Id
	@Column (name = "public_memento_id")
	private Long publicMementoId;

	@Column
	private char headline;

	@Column
	private Text text;
	
	@Column
	private char type;
	
	@Column (name = "resource_type")
	private char resourceType;
	
	@Column
	private char category;
	
	@Column (name = "resource_url")
	private Text resourceUrl;
	
	@Column
	private Text author;
	
	@Column
	private char locale;
	
	@Column (name = "creation_date")
	private DateTime creationDate;
	
	@Column (name = "resource_thumbnail_url")
	private Text resourceThumbnailUrl;
	
	@Column
	private char source;
	
	@Column (name = "source_url")
	private Text sourceUrl;
	
	@ManyToOne
	@JoinColumn (name = "fuzzy_startdate", updatable=true, insertable=true)
	private FuzzyDate startDate;
	
	@ManyToOne
	@JoinColumn (name = "location_start_id")
	private Location startId;
	
	@ManyToOne
	@JoinColumn (name = "fuzzy_enddate", updatable=true, insertable=true)
	private FuzzyDate endDate;
	
	@ManyToOne
	@JoinColumn (name = "location_end_id")
	private Location endId;
	
	
//metodi
	
	public static Finder<Long,PublicMemento> find = new Finder(
		    Long.class, PublicMemento.class
		  );
  
  public static List<PublicMemento> all() {
    return find.all();
  }
  
  public static void create(PublicMemento context) {
	  context.save();
  }
  
  public static void delete(Long id) {
	  find.ref(id).delete();
  }
  
  public static void update(Long id) {
	  find.ref(id).update();
  }
  
  public static PublicMemento findbyPerson(Long personId) {
	  List <PublicMemento> contextOfPerson = find.where().eq("personId", personId)
			  .eq("enabled", true)
			  .findList();
	  if (contextOfPerson != null && !contextOfPerson.isEmpty()) {
		  return contextOfPerson.get(contextOfPerson.size()-1);
	  }
	  else return null;
	  
  }

//getter e setter	

}