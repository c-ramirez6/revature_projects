package lab.s.v.instance;

public class Test {

	public static void main(String[] args) {
		ClassA.staticCount = 2494;
		ClassA a = new ClassA();
		System.out.println(a.instanceCount);
		System.out.println(ClassA.staticCount);
		
		ClassA a2 = new ClassA();
		
		System.out.println(a.instanceCount);
		System.out.println(ClassA.staticCount);
		
		a.instanceCount = 15;
		
		System.out.println("Object a instance count = " + a.instanceCount);
		System.out.println("Obhect a2 instance count = " + a2.instanceCount);
		
		System.out.println("Class A static count = " + ClassA.staticCount);
	}

}
