
package org.mitre.sim.pgm.intro;

import org.mitre.sim.Simulation;

public final class VmForsetiSim extends Simulation {

private static final long serialVersionUID = 1L;

public void initialize() {
	/* currently manually adding VM entities - later to consider model for dynamic registration of VMs */
    register(new VmEntity(), "VM1");
    register(new VmEntity(), "VM2");
    register(new VmEntity(), "VM3");
  }

  public static void main(String[] args) {
    new VmForsetiSim().run();
  }
}
