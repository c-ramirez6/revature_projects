package main;

public class MethodParameters {

	public static void main(String[] args) {
		MethodParameters mp = new MethodParameters();
		
		double conversion = mp.convertInt(10);
		System.out.println(conversion);
		
		System.out.println(mp.sum(15.6, 2, 6));

	}
	
	public double convertInt(int inputInt) {
		return (double)inputInt;
	}
	
	public double sum(double val1, int val2, int val3) {
		return val1 + val2 + val3;
	}

}
