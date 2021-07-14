package labs;

public class VariantConditionals {

	public static void main(String[] args) {
		boolean b = false;

		if (b) {
			System.out.println("inside the if-statement");
		}
		else	{
			System.out.println("This is inside the else block");
		}

		System.out.println("Outside of the if-statement");
		System.out.println("Next up is the nested if statements");
		boolean first = false;
		boolean second = true;
		
		if(first) {
			System.out.println("This is in the first if block");
			
			if(second)	{
				System.out.println("This is in the nested if block");
			}
		}
		else if(second)	{
			System.out.println(5);
		}
		else	{
			System.out.println("This is inside the else statement");
		}
		System.out.println("This is outside of the conditional block");
		
	}

}
