package main;

public class OverloadingMethods {

	public static void main(String[] args) {
		OverloadingMethods overload = new OverloadingMethods();
		
		overload.print();
		overload.print("This is the input method");
		overload.print("This is a ", "two part sentence.");
	}
	
	public void print()	{
		System.out.println("original preint methods");
	}
	
	public void print(String input)	{
		System.out.println(input);
	}
	
	public void print(String str1, String str2)	{
		System.out.println(str1 + " " + str2);
	}
	
//	public void print(String test, String str) {
//		System.out.println(test + " " + str);
//	}

}
