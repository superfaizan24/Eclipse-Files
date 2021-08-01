package simpleprograms;

import java.util.Scanner;

public class FirstAndSecondAdder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter One Number");
		int n = input.nextInt();
		System.out.println("Enter Another Number");
		int m = input.nextInt();
		int rem;
		
		
		
		m/=10;
		
		System.out.println(n%10 + m%10);
		
		
			

	}

}
