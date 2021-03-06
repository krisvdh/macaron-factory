package controllers;

import java.util.List;

import models.Composition;
import models.Event;
import play.mvc.Controller;

public class Application extends Controller {

   public static void index() {
      // finding last three events
      List<Event> events = Event.find("from Event order by date desc").fetch(1, 3);
      // finding compositions discounted (max 2)
      List<Composition> compositions = Composition.findHighlighted();
      render(events, compositions);
   }
}
