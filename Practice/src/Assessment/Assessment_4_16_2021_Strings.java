package Assessment;

import java.util.Scanner;

public class Assessment_4_16_2021_Strings {

	public static void main(String[] args) {
//		Write a program to accept a sentence from the user and display the last word
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s = input.nextLine();
//		int i;
//		int lspace=0;
//		for(i=s.length()-1;i>=0;i--) {
//			if(s.charAt(i)==' ') {
//				lspace=i;
//				break;
//		}
//		}
//		for(i=lspace+1;i<s.length();i++) {
//				System.out.print(s.charAt(i));
//		}
		System.out.println(s.substring(s.lastIndexOf(' ')+1,s.length()));
	}
	}

