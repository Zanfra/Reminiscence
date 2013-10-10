package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import models.*;

@Entity
@Table(name="Fuzzy_Date")
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
	private String textualDate;
	
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

	public String getTextualDate() {
		return textualDate;
	}

	public void setTextualDate(String textualDate) {
		this.textualDate = textualDate;
	}
}