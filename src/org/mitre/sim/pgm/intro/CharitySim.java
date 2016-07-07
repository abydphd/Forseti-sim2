package org.mitre.sim.pgm.intro;

import org.mitre.sim.Simulation;

public class CharitySim extends Simulation {

  public void initialize() {
    GoodCauseModel recipient = new GoodCauseModel();
    register(recipient, "GoodCause");
    register(new PhilanthropistModel(recipient), "Philanthropist");
    register(new PhilanthropistModel(recipient), "Philanthropist2");
  }

  public static void main(String[] args) {
    new CharitySim().run();
  }
}
