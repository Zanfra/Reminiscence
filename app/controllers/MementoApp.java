package controllers;

import java.util.List;
import java.util.Map;

import play.*;
import play.mvc.*;
import views.html.*;
import play.data.*;
import models.*;
import static play.libs.Json.toJson;

//cambiare view..index è per task

public class MementoApp extends Controller {
	
	static Form<PublicMemento> contextForm = Form.form(PublicMemento.class);
	
	public static Result getPublicMementoByLocation (String startId) {
		PublicMemento mementoLocation = PublicMemento.getPublicMementoByLocation(startId);
		return ok(toJson(mementoLocation));	
	}
	
	public static Result getPublicMementoByDate (Long startDateId) {
		FuzzyDate d = FuzzyDate.read(startDateId);
		
		PublicMemento mementoDate = PublicMemento.getPublicMementoByDate(d);
		return ok(toJson(mementoDate));	
	}
	  
	public static Result getPublicMementoById (Long publicMementoId) {
		PublicMemento memento = PublicMemento.getPublicMementoById(publicMementoId);
		return ok(toJson(memento));
	}
	
	public static Result getPublicMementoByContext (Long personId) {
		Map<PublicMemento, Context> mementoContext = (Map<PublicMemento, Context>) PublicMemento.getPublicMementoByContext(personId);
		return ok(toJson(mementoContext));
	}
	
	
//	  public static Result index() {
//		  return redirect(routes.Application.context());
//	  }
	  
//	  public static Result memento() {
//		  return ok(
//				    views.html.memento.render(PublicMemento.all(), contextForm)
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
