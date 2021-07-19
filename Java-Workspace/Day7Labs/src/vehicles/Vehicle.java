package vehicles;

public class Vehicle {
	private String name;
	private Long serialNumber;
	
	public void move() {
		System.out.println(getName() + " moved");
	}
	
	public void move(int spaces)	{
		System.out.println(getName() + " moved " + spaces + " spaces");
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	Long getSerialNumber() {
		return serialNumber;
	}

	void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}
}
