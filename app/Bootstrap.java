import java.text.DateFormat;

import models.Event;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Bootstrap extends Job {

   public void doJob() throws Exception {
      /*
       * 

      Event(juneEvent1):
      date:          2010-06-15
      description:   Macaron-Factory prépare une grosse commande en vue d'un mariage pour juin 2010 !

      Event(mayEvent1):
      date:          2010-05-05
      #  description:   Venez découvrir notre nouvelle composition fruitée portée par un chocolat doux : <a href=\"#\" class=\"a\">Angèle</a>.
      description:   Venez découvrir notre nouvelle composition fruitée portée par un chocolat doux, Angele

      Event(aprilEvent2):
      date:          2010-04-23
      #  description:   Soyez les premiers à être informés sur nos créations et évenements sur <a href=\"http://twitter.com/macaronfactory\" class=\"a\" target=\"_blank\">Twitter</a>.
      description:   Soyez les premiers à être informés sur nos créations et évenements sur Twitter !

      Event(aprilEvent1):
      date:          2010-04-01
      description:   Macaron-Factory est racheter par Coca Cola !

       */
      //Fixtures.load("data-prod.yml");

      new Event(DateFormat.getDateInstance().parse("2010-06-15"), "Macaron-Factory prépare une grosse commande en vue d'un mariage pour juin 2010 !").insert();
   }
}
