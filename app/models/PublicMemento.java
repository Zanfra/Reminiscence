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
	@JoinColumn (name = "location_start_id", updatable=true, insertable=true)
	private Location startId;
	
	@ManyToOne
	@JoinColumn (name = "fuzzy_enddate", updatable=true, insertable=true)
	private FuzzyDate endDate;
	
	@ManyToOne
	@JoinColumn (name = "location_end_id", updatable=true, insertable=true)
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
  
  public Long getPublicMementoId() {
		return publicMementoId;
	}

	public void setPublicMementoId(Long publicMementoId) {
		this.publicMementoId = publicMementoId;
	}

	public char getHeadline() {
		return headline;
	}

	public void setHeadline(char headline) {
		this.headline = headline;
	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public char getResourceType() {
		return resourceType;
	}

	public void setResourceType(char resourceType) {
		this.resourceType = resourceType;
	}

	public char getCategory() {
		return category;
	}

	public void setCategory(char category) {
		this.category = category;
	}

	public Text getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(Text resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public Text getAuthor() {
		return author;
	}

	public void setAuthor(Text author) {
		this.author = author;
	}

	public char getLocale() {
		return locale;
	}

	public void setLocale(char locale) {
		this.locale = locale;
	}

	public DateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(DateTime creationDate) {
		this.creationDate = creationDate;
	}

	public Text getResourceThumbnailUrl() {
		return resourceThumbnailUrl;
	}

	public void setResourceThumbnailUrl(Text resourceThumbnailUrl) {
		this.resourceThumbnailUrl = resourceThumbnailUrl;
	}

	public char getSource() {
		return source;
	}

	public void setSource(char source) {
		this.source = source;
	}

	public Text getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(Text sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public FuzzyDate getStartDate() {
		return startDate;
	}

	public void setStartDate(FuzzyDate startDate) {
		this.startDate = startDate;
	}

	public Location getStartId() {
		return startId;
	}

	public void setStartId(Location startId) {
		this.startId = startId;
	}

	public FuzzyDate getEndDate() {
		return endDate;
	}

	public void setEndDate(FuzzyDate endDate) {
		this.endDate = endDate;
	}

	public Location getEndId() {
		return endId;
	}

	public void setEndId(Location endId) {
		this.endId = endId;
	}
}