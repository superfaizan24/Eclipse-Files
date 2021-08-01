package simpleprograms;

import java.util.Scanner;

public class NumberOfWords {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Something");
	String s = input.nextLine();
	int i;
	int c=0;
	for(i=0;i<= s.length() -1;i++) {
		if(s.charAt(i)==' ') {
			c++;
		}
		
		
		
	}
	
	System.out.println(c+1);
	
	

}

}


