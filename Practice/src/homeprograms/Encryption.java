package homeprograms;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to encrypt something or decrypt something");
		String answer = input.nextLine();
		System.out.println("Enter an input to be encrypted");
		String in = input.nextLine();
		int i;
		for(i=0;i<in.length();i++) {
			if(in.charAt(i)=='a'||in.charAt(i)=='A') {
				System.out.print("~");
			}
			else if(in.charAt(i)=='b'||in.charAt(i)=='B') {
				System.out.print("`");
			}
			else if(in.charAt(i)=='c'||in.charAt(i)=='C') {
				System.out.print("!");
			}
			else if(in.charAt(i)=='d'||in.charAt(i)=='D') {
				System.out.print("@");
			}
			else if(in.charAt(i)=='e'||in.charAt(i)=='E') {
				System.out.print("#");
			}
			else if(in.charAt(i)=='f'||in.charAt(i)=='F') {
				System.out.print("$");
			}
			else if(in.charAt(i)=='g'||in.charAt(i)=='G') {
				System.out.print("%");
			}
			else if(in.charAt(i)=='h'||in.charAt(i)=='H') {
				System.out.print("^");
			}
			else if(in.charAt(i)=='i'||in.charAt(i)=='I') {
				System.out.print("&");
			}
			else if(in.charAt(i)=='j'||in.charAt(i)=='J') {
				System.out.print("*");
			}
			else if(in.charAt(i)=='k'||in.charAt(i)=='K') {
				System.out.print("(");
			}
			else if(in.charAt(i)=='l'||in.charAt(i)=='L') {
				System.out.print(")");
			}	
			else if(in.charAt(i)=='m'||in.charAt(i)=='M') {
				System.out.print("_");
			}
			else if(in.charAt(i)=='n'||in.charAt(i)=='N') {
				System.out.print("-");
			}
			else if(in.charAt(i)=='o'||in.charAt(i)=='O') {
				System.out.print("+");
			}
			else if(in.charAt(i)=='p'||in.charAt(i)=='P') {
				System.out.print("=");
			}
			else if(in.charAt(i)=='q'||in.charAt(i)=='Q') {
				System.out.print("{");
			}
			else if(in.charAt(i)=='r'||in.charAt(i)=='R') {
				System.out.print("[");
			}
			else if(in.charAt(i)=='s'||in.charAt(i)=='S') {
				System.out.print("}");
			}
			else if(in.charAt(i)=='t'||in.charAt(i)=='T') {
				System.out.print("]");
			}
			else if(in.charAt(i)=='u'||in.charAt(i)=='U') {
				System.out.print("|");
				}	
			else if(in.charAt(i)=='v'||in.charAt(i)=='V') {
				System.out.print(":");
			}
			else if(in.charAt(i)=='w'||in.charAt(i)=='W') {
				System.out.print(";");
			}
			else if(in.charAt(i)=='x'||in.charAt(i)=='X') {
				System.out.print("<");
			}
			else if(in.charAt(i)=='y'||in.charAt(i)=='Y') {
				System.out.print(">");
			}
			else if(in.charAt(i)=='z'||in.charAt(i)=='Z') {
				System.out.print("'");
			}
			else if(in.charAt(i)==' ') {
				System.out.print(" ");
			}
			
			}
		}
	}
	


