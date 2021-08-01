package simpleprograms;

import java.util.Scanner;

public class EvenTernary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number;
		System.out.println("Enter a number:");
		number = sc.nextInt();

		System.out.println(number % 2 == 0 ? "The number is even" : "The number is odd");

	}
}