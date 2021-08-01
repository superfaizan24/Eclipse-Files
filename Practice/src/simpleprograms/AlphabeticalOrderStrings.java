package simpleprograms;

import java.util.Scanner;

public class AlphabeticalOrderStrings {
	public static void main(String arr[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of strings");
		  int number = Integer.parseInt(input.nextLine());
		String a[] = new String [number];
		System.out.println("Enter " + number + " Strings");
		
		int i;
		
		for(i=0;i<number;i++)
			a[i] = input.nextLine();
		
		
		
		
		
		
	}

}
