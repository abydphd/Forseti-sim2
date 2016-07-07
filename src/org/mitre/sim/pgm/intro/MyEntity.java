
package org.mitre.sim.pgm.intro;

import org.mitre.sim.DefaultEntity;

public final class MyEntity extends DefaultEntity {

    public void agenda() {
    	info("Hello");
    	waitForTime(2.0);
    	info("Still here");
    	waitForTime(3.0);
    	info("Good Bye");
    }
}
