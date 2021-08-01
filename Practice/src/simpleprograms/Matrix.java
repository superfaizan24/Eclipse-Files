package simpleprograms;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number of rows");
	int rows = input.nextInt();
	System.out.println("Enter the number of columns");
	int columns = input.nextInt();
	System.out.println("Enter the elements");
	int a[][] = new int [rows][columns];
	int i,j;
	for(i=0;i<rows;i++) {
		for(j=0;j<columns;j++) {
		a[i][j] = input.nextInt();
	}
	}
	for(i=0;i<rows;i++) {
		for(j=0;j<columns;j++) {
		System.out.print(a[i][j]+"\t");;
	}
	System.out.println();
	}

	}

}
