package org.mitre.sim.pgm.intro;

import org.mitre.sim.DefaultEntity;

public class MixedModeEntity extends DefaultEntity {

    public void eventOne(){
      info("Event One");
      schedule("eventTwo", 3.0, new Object[] {"Fa "});
    }

    public void eventTwo(String message){
      info("Event Two " + message);
      schedule("eventTwo", 1.5, new Object[] {message + "La "});
    }

    public void agenda() {
      info("Hello");
      waitForTime(1.0);
      schedule("eventOne", 2.0);
      waitForTime(4.0);
      info("Good Bye");
    }
}
