package simpleprograms;
import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a Number");
	int n = input.nextInt();
	
	int i;
	int j;
	
	
	for (i = 1; i<= n; i++) {
		for (j = 1;j<=i;j++) {
			System.out.print(j + "	 ");
		}
		System.out.println("");
	}

	}

}
