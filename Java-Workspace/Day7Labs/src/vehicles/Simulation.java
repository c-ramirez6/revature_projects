package vehicles;

public class Simulation {

	public static void main(String[] args) {
		FlyingVehicle fv = new FlyingVehicle((short)2, new Engine());
		fv.setName("Boeing f187");
		System.out.println(fv.getName());
		
		Airplane boeing = new Airplane((short)4, (short)5);
		boeing.setName("Boeing 737");
		boeing.move(15);
	}

}
