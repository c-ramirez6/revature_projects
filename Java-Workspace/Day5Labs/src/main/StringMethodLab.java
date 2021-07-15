package main;

public class StringMethodLab {

	public static void main(String[] args) {
		String str = "Hello There!";
		//Checks if str is the same as the passed object, and returns a boolean
		System.out.println(str.equals("Hello There!"));
		
		//Returns an int that is the length of the string.  Will include white space
		System.out.println(str.length());
		
		//returns the index of the passed char, or string, if it is located in the string.  Indexed by 0
		System.out.println(str.indexOf("T"));
		
		
	}

}
