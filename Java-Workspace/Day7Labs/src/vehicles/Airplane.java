package vehicles;

public class Airplane extends FlyingVehicle{
	
	private short wheels;
	private short propellers;
	
	public Airplane(short wheels, short propellers)	{
		super((short)4, new Engine());
		this.wheels = wheels;
		this.propellers = propellers;
	}
	
	public void turn() {
		System.out.println(this.getName() + " is turning");
	}

	protected short getWheels() {
		return wheels;
	}

	protected void setWheels(short wheels) {
		this.wheels = wheels;
	}

	protected short getPropellers() {
		return propellers;
	}

	protected void setPropellers(short propellers) {
		this.propellers = propellers;
	}	
	
}
