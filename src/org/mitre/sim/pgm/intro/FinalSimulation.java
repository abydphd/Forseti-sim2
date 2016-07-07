package org.mitre.sim.pgm.intro;

import org.mitre.sim.Simulation;

public class FinalSimulation extends Simulation {

  public void initialize() {
    register(new InterruptedEntity(), "InterruptedEntity");
    setTimeLast(2.5);
  }

  public void simulationComplete() {
    info("Simulation complete");
  }

  public static void main(String[] args) {
    new FinalSimulation().run();
  }
}
