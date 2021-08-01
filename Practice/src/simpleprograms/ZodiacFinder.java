package simpleprograms;

import java.util.Scanner;

class ZodiacFinder {
	public static void main(String arr[])

	{
		Scanner input = new Scanner(System.in);
		System.out.println("What Month Were You Born In");
		String month = input.next();

		while (!month.equalsIgnoreCase("January") && !month.equalsIgnoreCase("february")
				&& !month.equalsIgnoreCase("march") && !month.equalsIgnoreCase("april")
				&& !month.equalsIgnoreCase("may") && !month.equalsIgnoreCase("june") && !month.equalsIgnoreCase("july")
				&& !month.equalsIgnoreCase("august") && !month.equalsIgnoreCase("september")
				&& !month.equalsIgnoreCase("october") && !month.equalsIgnoreCase("november")
				&& !month.equalsIgnoreCase("december")) {
			System.out.println("Invalid Month\n Try Again");
			month = input.next();
		}

		System.out.println("What Day Of The Month Were You Born In");
		int day = input.nextInt();

		while ((month.equalsIgnoreCase("January") && month.equalsIgnoreCase("March") && month.equalsIgnoreCase("May")
				&& month.equalsIgnoreCase("July") && month.equalsIgnoreCase("August")
				&& month.equalsIgnoreCase("October") && month.equalsIgnoreCase("December")) && (day < 1 || day > 31)) {
			System.out.println("Invalid Day\n Try Again");
			day = input.nextInt();
		}
		while (month.equalsIgnoreCase("April") && month.equalsIgnoreCase("June") && month.equalsIgnoreCase("September")
				&& month.equalsIgnoreCase("November") && day < 1 || day > 30) {
			System.out.println("Invalid Day\n Try Again");
			day = input.nextInt();
		}
		while (month.equalsIgnoreCase("February") && day < 1 || day > 29) {
			System.out.println("Invalid Day\n Try Again");
			day = input.nextInt();
		}

		if (month.equalsIgnoreCase("January") && day >= 20) {
			System.out.println("Your Zodiac Sign is Aquarius");
		} else if (month.equalsIgnoreCase("January") && day <= 19) {
			System.out.println("Your Zodiac Sign is Capricorn");
		} else if (month.equalsIgnoreCase("February") && day <= 18) {
			System.out.println("Your Zodiac Sign is Aquarius");
		} else if (month.equalsIgnoreCase("February") && day >= 19) {
			System.out.println("Your Zodiac Sign is Pisces");
		} else if (month.equalsIgnoreCase("March") && day <= 20) {
			System.out.println("Your Zodiac Sign is Pisces");
		} else if (month.equalsIgnoreCase("March") && day >= 21) {
			System.out.println("Your Zodiac Sign is Aries");
		} else if (month.equalsIgnoreCase("April") && day <= 19) {
			System.out.println("Your Zodiac Sign is Aries");
		} else if (month.equalsIgnoreCase("April") && day >= 20) {
			System.out.println("Your Zodiac Sign is Taurus");
		} else if (month.equalsIgnoreCase("May") && day <= 20) {
			System.out.println("Your Zodiac Sign is Taurus");
		} else if (month.equalsIgnoreCase("May") && day >= 21) {
			System.out.println("Your Zodiac Sign is Gemini");
		} else if (month.equalsIgnoreCase("June") && day <= 20) {
			System.out.println("Your Zodiac Sign is Gemini");
		} else if (month.equalsIgnoreCase("June") && day >= 21) {
			System.out.println("Your Zodiac Sign is Cancer");
		} else if (month.equalsIgnoreCase("July") && day <= 22) {
			System.out.println("Your Zodiac Sign is Cancer");
		} else if (month.equalsIgnoreCase("July") && day >= 23) {
			System.out.println("Your Zodiac Sign is Leo");
		} else if (month.equalsIgnoreCase("August") && day <= 22) {
			System.out.println("Your Zodiac Sign is Leo");
		} else if (month.equalsIgnoreCase("August") && day >= 23) {
			System.out.println("Your Zodiac Sign is Virgo");
		} else if (month.equalsIgnoreCase("September") && day <= 22) {
			System.out.println("Your Zodiac Sign is Virgo");
		} else if (month.equalsIgnoreCase("September") && day >= 23) {
			System.out.println("Your Zodiac Sign is Libra");
		} else if (month.equalsIgnoreCase("October") && day <= 22) {
			System.out.println("Your Zodiac Sign is Libra");
		} else if (month.equalsIgnoreCase("October") && day >= 23) {
			System.out.println("Your Zodiac Sign is Scorpio");
		} else if (month.equalsIgnoreCase("November") && day <= 21) {
			System.out.println("Your Zodiac Sign is Scorpio");
		} else if (month.equalsIgnoreCase("November") && day >= 22) {
			System.out.println("Your Zodiac Sign is Sagittarius");
		} else if (month.equalsIgnoreCase("December") && day <= 21) {
			System.out.println("Your Zodiac Sign is Sagittarius");
		} else if (month.equalsIgnoreCase("December") && day >= 22) {
			System.out.println("Your Zodiac Sign is Capricorn");
		}

	}
}
