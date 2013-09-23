package models;

import java.util.*;

import play.data.validation.Constraints.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;


public Collection KnowledgeBase extends Model  {
	
	public Long id;
	public String label;
	
	public class PublicMemento();
	public class Date();
	public class Location();
	public class Person();
	public class Question();
	public class Tags();
	
	public static Task<Long, KnowledgeBase> find = new Task(
		    Long.class, KnowledgeBase.class
		  );
	
	public static List<KnowledgeBase> all() {
	    return find.all(); //
	  }
	
}