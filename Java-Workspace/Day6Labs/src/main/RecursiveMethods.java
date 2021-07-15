package main;

public class RecursiveMethods {

	public static void main(String[] args) {
		RecursiveMethods rec = new RecursiveMethods();
		System.out.println(rec.factorial(5));

	}

	public int factorial(int num) {
		if(num <= 0) return 0;
		if(num == 1) return 1;
		
		return factorial(num - 1) * num;
	}
	
}
