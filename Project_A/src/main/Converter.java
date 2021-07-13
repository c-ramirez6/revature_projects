package main;

import java.util.Scanner;

public class Converter {

	private static final double FEET_TO_MILES = 0.000189394;
	private static final double USGALLONS_TO_IMPGALLONS = 0.832674;
	private static final double MILES_TO_KILOMETERS = 1.60934;
	private static final int CUPS_TO_TEASPOONS = 48;
	private static final int QUIT = 3;

	public static void main(String[] args) {
		int menuSelection = 1;
		int conversionChoice;
		int initialAmount = 0;
		Scanner sc = new Scanner(System.in);
		while (menuSelection != QUIT) {
			conversionChoice = 0;
			System.out.println("Please select an option:\r\n" + "1. Volume Conversions\r\n"
					+ "2. Distance Conversions\r\n" + "3. Quit");
			menuSelection = sc.nextInt();
			if (menuSelection == 1) {
				System.out.println("Please select an option:\r\n" + "1. Cups to Teaspoons\r\n"
						+ "2. US Gallons to Imperial Gallons\r\n" + "3. Go Back");
				conversionChoice = sc.nextInt();
				switch (conversionChoice) {
				case 1: {
					System.out.println("Enter number of Cups: ");
					initialAmount = sc.nextInt();
					System.out.println(convertCupsToTeaspoons(initialAmount));
					break;
				}
				case 2: {
					System.out.println("Enter number of Gallons: ");
					initialAmount = sc.nextInt();
					System.out.println(convertUsGallonsToImp(initialAmount));
					break;
				}
				default: {
					break;
				}
				}

			} else if (menuSelection == 2) {
				System.out.println("Please select an option:\r\n" + "1. Miles to Kilometers\r\n"
						+ "2. Feet to Miles\r\n" + "3. Go Back");
				conversionChoice = sc.nextInt();
				switch (conversionChoice) {
				case 1: {
					System.out.println("Enter number of Miles: ");
					initialAmount = sc.nextInt();
					System.out.println(convertMilesToKilometers(initialAmount));
					break;
				}
				case 2: {
					System.out.println("Enter number of Feet: ");
					initialAmount = sc.nextInt();
					System.out.println(convertFeetToMiles(initialAmount));
					break;
				}
				default: {
					break;
				}
				}
			}
		}
		sc.close();
	}

	public static double convertCupsToTeaspoons(double qty) {
		return qty * CUPS_TO_TEASPOONS;
	}

	public static double convertUsGallonsToImp(double qty) {
		return qty * USGALLONS_TO_IMPGALLONS;
	}

	public static double convertMilesToKilometers(double qty) {
		return qty * MILES_TO_KILOMETERS;
	}

	public static double convertFeetToMiles(double qty) {
		return qty * FEET_TO_MILES;
	}
}
