package Assessment;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String input = scanner.nextLine();
		int index;
		for(index=0;index<input.length();index++) {
			if((input.charAt(index)>='A'&&input.charAt(index)<='Z')||(input.charAt(index)>='a'&&input.charAt(index)<='z'))
				System.out.print((char)(input.charAt(index)+1));
			else if(input.charAt(index)=='Z') {
				System.out.print("A");
			}
			else if(input.charAt(index)=='z') {
				System.out.print("a");
			}
			else 
				System.out.print(input.charAt(index));
			
			
		}
		
	}

}
