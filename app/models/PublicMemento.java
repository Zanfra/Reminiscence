package models;

import java.util.*;

public class PublicMemento {
	
	private Long publicMementoId;
	
	private String headline;
	
	private String text;
	
	private String category;
	
	private String sourceUrl;
	
	private String author;
	
	private DateTime date;
	
	private String location;
	
	
	public String getPublicMemento() {
		return publicMemento;
	}

	public void setPublicMemento(Long publicMemento) {
		this.publicMemento = publicMemento;
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
	
	
	public DateTime getDate() {
		return date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}
	
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}