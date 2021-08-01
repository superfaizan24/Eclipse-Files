package simpleprograms;

import java.util.Scanner;

public class MarksOfAStudent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l,i;
		System.out.println("Enter the size of the array");
		l=input.nextInt();
		int []a=new int[l];
		for(i=0;i<l;i++)
			a[i]=input.nextInt();
		for(i=0;i<l;i++)
			System.out.println(a[i]);
		
	}
	

}
