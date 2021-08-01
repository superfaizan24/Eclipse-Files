package homeprograms;

import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String arr[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the the number of the month:");
		int month = input.nextInt();
		System.out.println("Enter the day of the month:");
		int day = input.nextInt();
		System.out.println("Enter the year:");
		int year = input.nextInt();
		int nod = (day + numberOfOddDaysInMonth(month - 1, year) + numberOfOddDaysInYear(year - 1)) % 7; 
		// To find what day of the week it is
		String answer = "";
		if (nod == 1)
			answer = "MONDAY";
		else if (nod == 2)
			answer = "TUESDAY";
		else if (nod == 3)
			answer = "WEDNESDAY";
		else if (nod == 4)
			answer = "THURSDAY";
		else if (nod == 5)
			answer = "FRIDAY";
		else if (nod == 6)
			answer = "SATURDAY";
		else if(nod==7)
			answer = "SUNDAY";
		System.out.println(answer);

	}

	public static int numberOfOddDaysInYear(int year) {
		return year + numberOfLeapYears(year);
	}

	public static int numberOfOddDaysInMonth(int month, int year) {
		int i, nod = 0; // Loop Variables
		for (i = 1; i <= month; i++) { // To identify how many days have passed in the year
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				nod += 31;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				nod += 30;
			} else {
				nod += 28;
				if (isLeapYear(year))
					nod++;
			}
		}

		return nod % 7;

	}

	public static int numberOfLeapYears(int year) {
		int i;
		int count = 0;
		for (i = 1; i <= year; i++) { // To find the number of leap years in the input
			if (isLeapYear(i))
				count++;
		}
		return count;
	}

	public static boolean isLeapYear(int year) {
		// To identify whether it is a leap year
		if (year % 400 == 0)
			return true;
		if (year % 100 != 0 && year % 4 == 0)
			return true;

		return false;

	}
}
