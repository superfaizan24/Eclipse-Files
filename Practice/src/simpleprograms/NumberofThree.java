package simpleprograms;
import java.util.Scanner;
public class NumberofThree {

	public static void main(String[] args) {
		 Scanner input = new Scanner (System.in);
		 System.out.println("Enter a Number");
		 int n = input.nextInt();
		 int c=0;
		 while(n!=0) {
			 if(n%10==3)
				 c++;
			 n=n/10;
		 }
			
			 System.out.println(c);
		 
	}

}
