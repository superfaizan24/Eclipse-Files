package hackerankprograms.strong_password;

public class Solution {
	static int minimumNumber(int n, String password) {
		int i,j=0,counter=0;
		String number = "", uppercase = "", lowercase = "", specialchar = "";
		// Numbers
		for (i = 0; i < n; i++) {
			if (password.charAt(i) == 1 || password.charAt(i) == 2 || password.charAt(i) == 3 || password.charAt(i) == 4
					|| password.charAt(i) == 5 || password.charAt(i) == 6 || password.charAt(i) == 7
					|| password.charAt(i) == 8 || password.charAt(i) == 9 || password.charAt(i) == 0) {
				number = "YES";
			}
		}
		// Special Characters
		for (i = 0; i < n; i++) {
			if (password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#'
					|| password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '^'
					|| password.charAt(i) == '&' || password.charAt(i) == '*' || password.charAt(i) == '('
					|| password.charAt(i) == ')' || password.charAt(i) == '-' || password.charAt(i) == '+') {
				specialchar = "YES";
			}
		}
		// UpperCase
		for(i=0;i<n;i++) {
		if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
			j++;
		}
		if(j>0) {
			uppercase="YES";
		}
        }
		// LowerCase
				for(i=0;i<n;i++) {
				if (password.charAt(i) >= 97 && password.charAt(i) <= 120) {
					j++;
				}
				if(j>0) {
					lowercase="YES";
				}
		        }
			if(lowercase!="YES") {
				counter++;
			}
			else if(uppercase!="YES") {
				counter++;
			}
			else if(specialchar!="YES") {
				counter++;
			}
			else if(number!="YES") {
				counter++;
			}
			if(n<6) {
				
			}


		return counter;
	}
}
