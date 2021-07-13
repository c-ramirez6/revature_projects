package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		int menuSelection = 1;
		final int QUIT = 4;
		int initialAmount = 0;
		Scanner sc = new Scanner(System.in);
		while(menuSelection != QUIT)	{
			System.out.println("Please select an option:\r\n"
					+ "1. Cups to Teaspoons\r\n"
					+ "2. Miles to Kilometers\r\n"
					+ "3. US Gallons to Imperial Gallons\r\n"
					+ "4. Quit");
			menuSelection = sc.nextInt();
			switch(menuSelection) {
			case 1: {
				System.out.println("Enter number of Cups: ");
				initialAmount = sc.nextInt();
				System.out.println(initialAmount * 48 + " Teaspoons");
				break;
			}
			case 2:	{
				System.out.println("Enter number of Miles: ");
				initialAmount = sc.nextInt();
				System.out.println(initialAmount * 1.60934 + " Kilometers");
				break;
			}
			case 3:	{
				System.out.println("Enter number of Gallons: ");
				initialAmount = sc.nextInt();
				System.out.println(initialAmount * 0.832674 + " Imperial Gallons");
				break;
			}
			default:	{
				break;
			}
			}
		}
	}

}
