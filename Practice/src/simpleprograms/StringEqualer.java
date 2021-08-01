package simpleprograms;
import java.util.Scanner;
public class StringEqualer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Something");
		String s = input.nextLine();
		String[] s = new String[];
		
		System.out.println("Enter another Thing");
		String t = input.nextLine();
		
		if(t.compareTo(s)<0) {
			System.out.println(s + " comes later in the alphabetical order");
		}
		else {
			System.out.println(t + " comes later in the alphabetical order");
			
			
		}

	}

}
