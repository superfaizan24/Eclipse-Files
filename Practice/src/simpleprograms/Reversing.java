package simpleprograms;

import java.util.Scanner;

public class Reversing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = input.nextInt();
		int temp=n;
		/*
		 * while(n!=0) { System.out.print(n%10); n/=10; }
		 */
		String rev="";
		while(n!=0) {
			rev=rev+(n%10);
			n/=10;
			
		}
		int n1=Integer.parseInt(rev);
		System.out.println(n1);

		
		
		
	}


}