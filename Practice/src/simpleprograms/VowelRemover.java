package simpleprograms;

import java.util.Scanner;

public class VowelRemover {

	public static void main(String[] args) {  
		Scanner input = new Scanner(System.in); // creating an object of Scanner class to accept input from the console
		System.out.println("Enter a Word");
		String word = input.nextLine(); // accepting the word from the user
		int i; // Loop variables
		
		
		for (i = 0; i <= word.length() - 1; i++) { // For traversing each character of the word
			// Checking for consonants
			if (!(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u' || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I'
					|| word.charAt(i) == 'O' || word.charAt(i) == 'U')) {
				System.out.print(word.charAt(i)); // printing the consonants
			}

			input.close();
		}

	}
}
