package controllers;

import static play.libs.Json.toJson;
import play.*;
import play.mvc.*;
import views.html.*;
import play.data.*;
import play.data.format.Formats.DateTime;
import models.*;

//cambiare view..index è per task

public class ContextApp extends Controller {
	
	static Form<Context> contextForm = Form.form(Context.class);
	
	public static Result findbyPerson (Long personId) {
		Context contextPerson = Context.findbyPerson(personId);
		return ok(toJson(contextPerson));
	}
	
	public static Result getContextByDate (Long fuzzyDateId) {
		Context contextDate = Context.getContextByDate(fuzzyDateId);
		return ok(toJson(contextDate));
	}
	
	public static Result getContextByLocation (Long cityForId) {
		Context contextLocation = Context.getContextByLocation(cityForId);
		return ok(toJson(contextLocation));
	}
	  
//	  public static Result index() {
//		  return redirect(routes.Application.context());
//	  }
	  
//	  public static Result context() {
//		  return ok(
//				    views.html.index.render(Context.all(), contextForm)
//				  );
//	  }
	  
//	  public static Result newContext() {
//		  Form<Context> filledForm = contextForm.bindFromRequest();
//		  if(filledForm.hasErrors()) {
//		    return badRequest(
//		      views.html.index.render(Context.all(), filledForm)
//		    );
//		  } else {
//		    Context.create(filledForm.get());
//		    return redirect(routes.Application.context());  
//		  }
//	  }
	  
//	  public static Result deleteContext(Long id) {
//		  Context.delete(id);
//		  return redirect(routes.Application.context());
//	  }
	  
	}
