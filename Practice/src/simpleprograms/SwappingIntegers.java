package simpleprograms;

import java.util.Scanner;

public class SwappingIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // creating an object of scanner class to accepting input from the
												// console
		System.out.println("Enter the value for  the variable a");
		int a = input.nextInt(); // accepting the user given value of a
		System.out.println("Enter the value for  the variable b");
		int b = input.nextInt(); // accepting the user given value of b

		System.out.println("Before Swapping:");

		// displaying the values of a and b before swapping
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// Swapping logic
		int temp=a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping:");

		// displaying the values of and b after swapping
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
