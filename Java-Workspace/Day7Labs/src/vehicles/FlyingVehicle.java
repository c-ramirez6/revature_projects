package vehicles;

public class FlyingVehicle extends Vehicle{

	private short wings;
	private Engine engine;
	
	public FlyingVehicle() {
		
	}
	
	public FlyingVehicle(short wings, Engine engine) {
		this.wings = wings;
		this.engine = engine;
	}
	
	public void fly()	{
		System.out.println(this.getName() + " is flying");
	}
	
	public void refuel()	{
		System.out.println(this.getName() + " if refueling");
	}
	
	public void liftOff() {
		System.out.println(this.getName() + " is taking off");
	}
	
	public void land() {
		System.out.println(this.getName() + " is landing");
	}

	protected short getWings() {
		return wings;
	}

	protected void setWings(short wings) {
		this.wings = wings;
	}

	Engine getEngine() {
		return engine;
	}

	void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
