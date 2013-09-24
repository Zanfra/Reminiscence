package models;

import java.util.*;

public class Person extends KnowledgeBase {

        private Long personId;
    
        private String firstName;
        
        private String lastName;
        
        private DateTime birthday;
        
        private DateTime deathday;
        
        private String gender;
        
        private String email;

        
        public getPerson() {
            return Person;
        }
        
        public class setPerson(class Person) {
            this.Person = Person;
        }
        
        public Long getPersonId() {
            return personId;
        }
        
	public void setPersonId(Long personId) {
            this.personId = personId;
	}
	
        public String getFirstName() {
            return firstName;
        }
        
	public void setFirstName(String firstName) {
            this.firstName = firstName;
	}
     
        public String getLastName() {
            return lastName;
        }
        
	public void setLastName(String lastName) {
            this.lastName = lastName;
	}
        
        public DateTime getBirthday() {
            return birthday;
        }
        
	public void setBirthday(DateTime birthday) {
		this.birthday = birthday;
	}
        
        public DateTime getDeathday() {
            return birthday;
        }
        
	public void setDeathday(DateTime deathday) {
		this.deathday = deathday;
	}
        
        public String getGender() {
            return gender;
        }
        
	public void setGender(String gender) {
            this.gender = gender;
	}
        
        public String getEmail() {
            return email;
        }
        
	public void setEmail(String email) {
            this.email = email;
	}

}