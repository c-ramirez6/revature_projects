package file.exceptions;

import java.util.Scanner;

public class Simulator {

	public static void main(String[] args) {
		getInput();

	}

	public static void getInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		String input = sc.nextLine();
		System.out.println("You entered: " + input);

		if (isEven(input)) {
			try {
				throw new EvenNumberException();
			} catch (EvenNumberException e) {
				e.printStackTrace();
			} finally {
				sc.close();
			}
		}
		sc.close();
	}

	public static boolean isEven(String num) {
		int number = Integer.parseInt(num);
		return ((number % 2) == 0);
	}

}
