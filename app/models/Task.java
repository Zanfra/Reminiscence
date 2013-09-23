package models;

import java.util.*;

import play.data.validation.Constraints.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model {
  
  @Id
  public Long id;
  
  @Required
  public String label;
  
  public static Finder<Long,Task> find = new Finder(
		    Long.class, Task.class
		  );
  
  public static List<Task> all() {
    return find.all();
  }
  
  public static void create(Task task) {
	  task.save();
  }
  
  public static void delete(Long id) {
	  find.ref(id).delete();
  }
  
<<<<<<< HEAD
  Collection classi = new ArrayList() {
=======
  public static void modify(Long id) {
	  find.ref(id).get();
>>>>>>> 6438a09eaa6a9f8485eea11bbdd487096c250ca5
  }
    
}