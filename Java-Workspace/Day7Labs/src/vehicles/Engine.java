package vehicles;

public class Engine {
	private int size;
	
	public void on() {
		 System.out.println("The engine is turned on");
	}
	
	public void off() {
		System.out.println("The engine is turned off");
	}

	protected int getSize() {
		return size;
	}

	protected void setSize(int size) {
		this.size = size;
	}
}
