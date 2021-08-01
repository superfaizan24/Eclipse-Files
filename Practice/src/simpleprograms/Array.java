package simpleprograms;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []a=new int[4];
		int i;
		System.out.println("Enter 4 numbers");
		
		for(i=0;i<4;i++)
			a[i]=input.nextInt();
		
		for(i=0;i<4;i++) {
			System.out.println(a[i]+10);
		}

	}

}
