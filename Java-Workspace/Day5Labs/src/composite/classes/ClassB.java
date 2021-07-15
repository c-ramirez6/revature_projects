package composite.classes;

public class ClassB {
	ClassA a = new ClassA();
	
	public static void main(String[] args)	{
		ClassB b = new ClassB();
		
		b.a.setName("Chris");
		System.out.println(b.a.getName());
	}
}
