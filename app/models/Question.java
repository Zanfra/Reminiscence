package models;

import java.util.*;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;

import play.db.ebean.Model;


public class Question extends KnowledgeBase {
	
	private Long questionId;
	
	private String text;
	
	private String category;
	
	private Date date;
	
	private Location location;

        
	public class getQuestion() {
		return Question;
	}

	public void setQuestion(class Question) {
		this.Question = Question;
	}

	
	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	public String getCategory() {
		return text;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public Location getLocation() {
		return location;
	}

	public void setLocationId(Location location) {
		this.location = location;
	}
        
}