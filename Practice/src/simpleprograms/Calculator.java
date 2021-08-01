package simpleprograms;

import java.util.Scanner;
class Calculator{
	
	public static void main(String arr[])
	
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name");
		String name = input.next();
		
		System.out.println("Hello " + name + ". What do you want to do today");

		System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
		System.out.println("Enter your choice:");
		int choice = input.nextInt();
		
		System.out.println("Enter num 1:");
		int a = input.nextInt();
		System.out.println("Enter num 2:");
		int b = input.nextInt();

		double result = 0;
		
		
		if(choice == 1) {
			result = a+b;
			System.out.println("Result = "+result);
		}
		else if(choice == 2) {
			result = a-b;
			System.out.println("Result = "+result);
			
		}
		else if(choice ==3) {
			result = a*b;
			System.out.println("Result = "+result);
			
		}
		else if(choice ==4) {
			result = a/b;
			System.out.println("Result = "+result);
			
		}



		
		
				


	}

}



		
 
		
		
