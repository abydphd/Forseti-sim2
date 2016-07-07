
package org.mitre.sim.pgm.intro;

import org.mitre.sim.Simulation;

public final class MySimulation extends Simulation {

  public void initialize() {
    register(new MyEntity(), "Foo");
    register(new MyEntity(), "Bar");
  }

  public static void main(String[] args) {
    new MySimulation().run();
  }
}
