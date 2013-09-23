package models;

import java.util.*;

public class Context extends KnowledgeBase() {

        private Long contextId;
    
        private Date date;
        
        private Location location;
        
        private String category;
        
}
        
		public getContext() {
		    return Context;
		}
		
		public class setContext(class Context) {
		    this.Context = Context;
		}


        public Long getContextId() {
		return contextId;   
        }
        
        public void setContextId(Long contextId) {
    		this.contextId = contextId;
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

        public void setLocation(Location location) {
		this.location = location;
        }

        public String getCagetory() {
		return category;
        }

        public void setCategory(String category) {
		this.category = category;
        }
