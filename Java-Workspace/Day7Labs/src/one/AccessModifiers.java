package one;

import two.ProtectedSubClass;

public class AccessModifiers {

	public static void main(String[] args) {
		Person chris = new Person();
		chris.age = 22;
		System.out.println(chris.age);

		 ProtectedSubClass psc = new ProtectedSubClass();
	     psc.printId();
		
	}

}
