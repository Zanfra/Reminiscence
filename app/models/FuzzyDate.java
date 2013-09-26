package models;

import java.util.*;

import javax.persistence.*;

import com.gargoylesoftware.htmlunit.javascript.host.Text;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;

@Entity
public class FuzzyDate extends Model {

	@Id
	@Column (name = "fuzzy_date_id")
	private Long fuzzyDateId;

	@Column
	private int decade;

	@Column
	private int year;
	
	@Column
	private int month;
	
	@Column
	private int day;
	
	@Column (name = "textual_date")
	private Text textualDate;
	
//metodi
	
	public static Finder<Long,FuzzyDate> find = new Finder(
		    Long.class, FuzzyDate.class
		  );
  
  public static List<FuzzyDate> all() {
    return find.all();
  }
  
  public static void create(FuzzyDate context) {
	  context.save();
  }
  
  public static void delete(Long id) {
	  find.ref(id).delete();
  }
  
  public static void update(Long id) {
	  find.ref(id).update();
  }
  
  public static FuzzyDate findbyPerson(Long personId) {
	  List <FuzzyDate> contextOfPerson = find.where().eq("personId", personId)
			  .eq("enabled", true)
			  .findList();
	  if (contextOfPerson != null && !contextOfPerson.isEmpty()) {
		  return contextOfPerson.get(contextOfPerson.size()-1);
	  }
	  else return null;
	  
  }

//getter e setter	

  public Long getFuzzyDateId() {
		return fuzzyDateId;
	}

	public void setFuzzyDateId(Long fuzzyDateId) {
		this.fuzzyDateId = fuzzyDateId;
	}

	public int getDecade() {
		return decade;
	}

	public void setDecade(int decade) {
		this.decade = decade;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public Text getTextualDate() {
		return textualDate;
	}

	public void setTextualDate(Text textualDate) {
		this.textualDate = textualDate;
	}
}