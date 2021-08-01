package simpleprograms;

import java.util.Scanner;

public class AlphabetDisplayer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Something");
		String s = input.nextLine();
		int i;
		
		 
			
		
		
		for (i = 0; i <= s.length() - 1; i++) {
			if((s.charAt(i)>= 'a' && s.charAt(i)<= 'z') || (s.charAt(i)>= 'A' && s.charAt(i)<= 'Z')) {
				System.out.print(s.charAt(i));
			}
		}
		
		
		input.close();
	}

}
