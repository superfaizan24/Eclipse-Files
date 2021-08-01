package simpleprograms;

import java.util.Scanner;

public class MaximumLengthString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = Integer.parseInt(input.nextLine()); //size variable
		String a[] = new String[size]; //user defined size of the array
		System.out.println("Enter the Strings"); //user inputed strings

		int i,max,pos = 0; //loop variables
		
		//accepting the input
		for (i = 0; i < size; i++)	
			a[i] = input.nextLine();

		int b[] = new int[size]; //integer array to store the corresponding lengths of he array
		
		for(i=0;i < size; i++) // taking the length of each string and storing it in the array
			b[i] = a[i].length();
		
		//identifying the position of the given elements
		max = b[0];
		for (i = 1; i < size; i++)
			if (b[i] > max) {
				max = b[i];
				pos = i;
			}

		//printing the longest String
		System.out.println(a[pos] + "is the longest String");


	}

}
