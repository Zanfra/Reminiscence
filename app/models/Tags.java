package models;

import java.util.*;


public class Tags extends KnowloedgeBase {

	private Long tagsId;
        
        private Person person;
        
        private PublicMemento memento;
        
}

public void getTags() {
       return Tags;
}
        
public class setTags(class Tags) {
        this.Tags = Tags;
}


public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
        this.person = person;
}

public void getDate() {
            return Date;
}
        
public class setDate(class Date) {
            this.Date = Date;
}


public PublicMemento getMemento() {
            return memento;
}

public void setMemento(Memento memento) {
            this.memento = memento;
}