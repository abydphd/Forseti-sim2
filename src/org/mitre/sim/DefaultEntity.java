package org.mitre.sim;

/**
  Convenience class combining an empty implementation of
  {@link ProcessDelegate ProcessDelegate} and its associated
  {@link Entity Entity} instance.
  
  If the user's program design can accommodate simulation entities
  extending this class (and therefore not extending any other class),
  this class affords the convenience of not having to manage a separate
  <code>Entity</code> instance.
  See {@link Entity Entity} for descriptions of corresponding methods.
  <br>
  <p><img src="doc-files/mitre_logo.gif"><br>
  <font size=-2>Copyright &copy; 2007 The MITRE Corporation</font>
 */

public abstract class DefaultEntity implements ProcessDelegate {
	protected Entity assignedEntity;
	
	public void setEntity(Entity entity) {
		this.assignedEntity = entity;
	}
	
	public final String getName() {
		return assignedEntity.getName();
	}
	
	public final EntityDelegate getDelegate() {
		return assignedEntity.getDelegate();
	}
	
	/**
	 * @throws IllegalArgumentException if attempt to register self
	 */
	public final void register(EntityDelegate dpe) {
		if (this == dpe) throw new IllegalArgumentException("Cannot register yourself");
		assignedEntity.register(dpe);
	}
	
	/**
	 * @throws IllegalArgumentException if attempt to register self
	 */
	public final void register(EntityDelegate dpe, String name) {
		if (this == dpe) throw new IllegalArgumentException("Cannot register yourself");
		assignedEntity.register(dpe, name);
	}
	
	public final void stopSimulation() {
		assignedEntity.stopSimulation();
	}
	
	public final double getTimeNow() {
		return assignedEntity.getTimeNow();
	}
	
	public final double getTimeLast() {
		return assignedEntity.getTimeLast();
	}
	
	public final void setTimeLast(double t) {
		assignedEntity.setTimeLast(t);
	}
	
	public final void actionOccurred(Enum<?> returnToken) throws IllegalStateException {
		assignedEntity.actionOccurred(returnToken);
	}
	
  public final boolean entityIsAlive(Entity target) {
  	return assignedEntity.entityIsAlive(target);
  }

  public final void info(String message) {
  	assignedEntity.info(message);
  }
  
  public String toString() {
  	return assignedEntity.toString();
  }
  
  public final void waitForTime(double delay) {
  	assignedEntity.waitForTime(delay);
  }
  
  public final Enum<?> waitForAction(double backStop, Enum<?> returnOnTimeToken) {
  	return assignedEntity.waitForAction(backStop, returnOnTimeToken);
  }
  
  public void schedule(String methodName, double eventDelay, Object... arguments) 
  throws IllegalArgumentException 
  {
  	assignedEntity.schedule(methodName, eventDelay, arguments);
  }

	public void agenda() {}

	public void entityComplete() {}

	public void exceptionHandler(Exception e) {}

	public void initialize() {}

}
