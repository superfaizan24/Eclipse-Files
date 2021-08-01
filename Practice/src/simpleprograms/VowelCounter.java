package simpleprograms;

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // creating an object of Scanner class to accept input from the console
		System.out.println("Enter a Word");
		String s = input.nextLine(); // accepting the word from the user
		int i; // loop variable
		int c = 0; // Counter variable
		for (i = 0; i <= s.length() - 1; i++) { // Traversing each character of the word
			// Checking for vowels
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				c++; // counting the number of vowels in the word
			}

		}

		System.out.println(c); // displaying the number of vowels in the word

	}

}
