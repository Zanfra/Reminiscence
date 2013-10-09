package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import play.data.*;
import models.*;

//cambiare view..index è per task

public class ContextApp extends Controller {
	
	static Form<Context> contextForm = Form.form(Context.class);
	
	public static Result getPublicMementoById (Long id) {
		return TODO;
	}
	
	public static Result findbyPerson (Long personId) {
		 	return TODO;
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
