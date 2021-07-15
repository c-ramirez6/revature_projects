package main;

public class Constructors {
	
	public Constructors() {
		System.out.println("This is the default constructor");
	}
	
	public Constructors(int value)	{
		System.out.println(value);
	}

	public static void main(String[] args) {
		Constructors construct = new Constructors(10);
		Constructors c = new Constructors();
	}

}
