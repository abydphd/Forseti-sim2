package org.mitre.sim.pgm.intro;

import org.mitre.sim.Simulation;

public class DelayedLaunchSim extends Simulation {

  public void initialize() {
    register(new RocketModel(), "RocketModel");
    setPace(1000);
  }

  public void delay(long delay) {
    try {
      Thread.sleep(delay);
    } catch (Exception e) {}
  }

  public static void main(String[] args) {
    DelayedLaunchSim dls = new DelayedLaunchSim();
    dls.start();
    dls.delay(5000);
    dls.pauseSimulation();
    dls.delay(5000);
    dls.resumeSimulation();
  }

}
