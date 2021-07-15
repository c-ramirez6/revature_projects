package lab.s.v.instance;

public class ClassA {
	
	public static int staticCount = 0;
	
	public int instanceCount = 0;
	
	public ClassA()	{
		staticCount++;
		this.instanceCount++;
	}

}
