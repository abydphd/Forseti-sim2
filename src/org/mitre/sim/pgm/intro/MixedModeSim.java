
package org.mitre.sim.pgm.intro;

import org.mitre.sim.Simulation;

public class MixedModeSim extends Simulation {

  public void initialize() {
    register(new MixedModeEntity(), "MixedModeEntity");
    setTimeLast(9.0);
    register(new MixedModeEntity(), "MixedModeEntity2");
  }

  public static void main(String[] args) {
    new MixedModeSim().run();
  }
}
