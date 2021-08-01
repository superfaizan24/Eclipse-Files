package simpleprograms;

import java.util.Scanner;

public class SecondLargestArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = input.nextInt();
		int[] a = new int[size];
		int i,pos=-1;
		int max;

	for (i = 0; i < size; i++)
		a[i] = input.nextInt();

		max = a[0];
		for (i = 1; i < size; i++)
			if (a[i] > max) {
				max=a[i];
				pos = i;
						
			}
				
		int smax;
		
		smax = a[0];
		for (i = 1; i < size && i!= pos; i++)
			if (a[i] > smax) {
				smax=a[i];
				
						
			}

		
  	  System.out.println(smax);
  	
  		  
  		  
  		  

  		  
			
	}
}
		

	


