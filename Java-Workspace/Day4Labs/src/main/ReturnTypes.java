package main;

public class ReturnTypes {

	public static void main(String[] args) {
		ReturnTypes rt = new ReturnTypes();
		rt.returnNothing();
		
		boolean bool = rt.returnBool();
		System.out.println("The value of bool is: " + bool);
	}
	
	public void returnNothing() {
		System.out.println("This method does not return any values");
	}
	
	public boolean returnBool()	{
		return true;
	}
}
