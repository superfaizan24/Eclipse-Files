package simpleprograms;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n= input.nextInt();
		int i;
		int j;
		char c='a';
		for(i=1;i<=n;i++) {
			for(j=1;j<=3;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
		
	}
}