
package org.mitre.sim.pgm.intro;

import org.mitre.sim.DefaultEntity;

public final class VmEntity extends DefaultEntity {

    public void agenda() {
    	info("a");
    	waitForTime(5.0);
    	info("change VM Heap");
    	waitForTime(10.0);
    	info("Throughput");
    }
}
