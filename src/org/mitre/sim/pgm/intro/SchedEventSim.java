package org.mitre.sim.pgm.intro;

import org.mitre.sim.Simulation;

public class SchedEventSim extends Simulation {

  public void initialize() {
    register(new SchedEntity(), "SchedEntity");
  }

  public static void main(String[] args) {
    new SchedEventSim().run();
  }
}
