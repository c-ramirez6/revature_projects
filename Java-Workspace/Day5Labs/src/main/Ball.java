package main;

public class Ball {
	String size;
	String color;
	
	public void Bouce()	{
		System.out.println("The " + size + " " + color + " ball is bouncing");
	}

	public static void main(String[] args) {
		Ball ball1 = new Ball();
		Ball ball2 = new Ball();

		ball1.size = "Big";
		ball2.size = "Small";
		ball1.color = "Purple";
		ball2.color = "Red";
		
		ball1.Bouce();
		ball2.Bouce();
	}

}
