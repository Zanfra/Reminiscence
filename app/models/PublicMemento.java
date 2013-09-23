package models;

import java.util.*;

public class PublicMemento extends KnowledgeBase() {
	
	private Long publicMementoId;
	
	private String headline;
	
	private String text;
	
	private String category;
	
	private String sourceUrl;
	
	private String author;
	
	private Date date;
	
	private Location location;
	
	
	public class getPublicMemento() {
		return PublicMemento;
	}

	public void setPublicMemento(class PublicMemento) {
		this.PublicMemento = PublicMemento;
	}
	
	public String getPublicMementoId() {
		return publicMementoId;
	}

	public void setPublicMementoId(Long publicMementoId) {
		this.publicMementoId = publicMementoId;
	}
	
	
	public String gethHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
        
}