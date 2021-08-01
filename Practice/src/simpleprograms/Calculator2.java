package simpleprograms;

import java.util.Scanner;

class Calculator2 {

	public static void main(String arr[])

	{
		Scanner input = new Scanner(System.in);

		System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Remainder");
		System.out.println("Enter your choice:");
		int choice = input.nextInt();

		System.out.println("Enter num 1:");
		int a = input.nextInt();
		System.out.println("Enter num 2:");
		int b = input.nextInt();

		double result = 0;

		/*
		 * if (choice == 1) result = a + b; else if (choice == 2) result = a - b;
		 * 
		 * else if (choice == 3) result = a * b;
		 * 
		 * else if (choice == 4) result = a / b;
		 * 
		 * else if (choice == 5) result = a % b;
		 */

		switch(choice) {
		case 1:
			result=a+b;
			break;
		case 2:
			result=a-b;
			break;
		case 3:
			result=a*b;
			break;
		case 4:
			result=a/b;
			break;
		case 5:
			result=a%b;
			break;
		}
		
		System.out.println("Result = " + result);

	}

}
