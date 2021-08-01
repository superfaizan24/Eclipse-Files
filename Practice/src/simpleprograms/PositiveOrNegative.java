package simpleprograms;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number");

		int number = input.nextInt();

		System.out.println(number > 0 ? "The number is positive" : "The number is negative");
	}

}

