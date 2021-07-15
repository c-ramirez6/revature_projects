package main;

import java.util.Scanner;

public class ScannerLab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type in a line and press enter after: ");
		String input = sc.nextLine();
		System.out.println("You typed in: " + input);
		
		
		String numbers = "1 2 6 3 8 9 4 7";
		sc.close();
		sc = new Scanner(numbers);
		
		while(sc.hasNextInt())	{
			System.out.println(sc.nextInt());
		}
		sc.close();
	}
}
