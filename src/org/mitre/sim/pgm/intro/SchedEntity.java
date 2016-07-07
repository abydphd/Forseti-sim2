package org.mitre.sim.pgm.intro;

import org.mitre.sim.DefaultEntity;

public class SchedEntity extends DefaultEntity {

    public void eventOne(){
      info("Event One");
      schedule("eventTwo", 3.0);
    }

    public void eventTwo(){
      info("Event Two");
    }

    public void initialize() {
      info("Hello");
      schedule("eventOne", 2.0);
      info("Good Bye");
    }
}
