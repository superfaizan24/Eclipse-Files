package simpleprograms;

import java.util.Scanner;

public class AverageFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []a=new int[5];
		int i,sum=0;
		
		
		System.out.println("Enter 5 numbers");
		
		for(i=0;i<5;i++)
			a[i]=input.nextInt();
		for(i=0;i<5;i++)
			sum+=a[i];
		System.out.println("average = "+(sum/5));
		
	}
	

	

}
