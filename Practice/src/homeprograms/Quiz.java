package homeprograms;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

		int q = 0, r = 0, s = 10; // To display to the user the number of errors, correct answers and remaining
									// questions

		Scanner input = new Scanner(System.in);
		// Quiz Options
		System.out.println(
				"What type of quiz would you like to do: \n 1. Math \n 2. Science \n 3. History \n 4. Avengers \n 5. Nitty Katu ");
		System.out.println("Enter your choice:"); // To get the user decided quiz choice
		String choice = input.nextLine();
		// To prevent the user from inputing random words
		while (!choice.equalsIgnoreCase("1") && !choice.equalsIgnoreCase("2") && !choice.equalsIgnoreCase("3")
				&& !choice.equalsIgnoreCase("4") && !choice.equalsIgnoreCase("5") && !choice.equalsIgnoreCase("Math")
				&& !choice.equalsIgnoreCase("Science") && !choice.equalsIgnoreCase("History")
				&& !choice.equalsIgnoreCase("Avengers") && !choice.equalsIgnoreCase("Nitty Katu")) {
			System.out.println(choice + " is not a test\n Try Again");
			choice = input.nextLine();
		}

		// MATH TEST
		if (choice.equalsIgnoreCase("Math") || choice.equalsIgnoreCase("1")) {
			System.out.println("You have selected the math test \n Press enter to begin the quiz"); // To begin the test
			String start = input.nextLine();

			// To Prevent the user from inputing random words
			while (!start.equalsIgnoreCase("")) {
				System.out.println("To begin the quiz press enter");
				start = input.nextLine();
			}

			// Question 1
			if (start.equalsIgnoreCase("")) {
				System.out.println(
						"Question 1: \nIs 5x + 3 a\n A. Quantinomial\n B. Trinomial\n C. Binomial\n D. Monomial");
				String ma1 = input.nextLine();
				while (!ma1.equalsIgnoreCase("A") && !ma1.equalsIgnoreCase("B") && !ma1.equalsIgnoreCase("C")
						&& !ma1.equalsIgnoreCase("D")) {
					System.out.println(ma1 + " is not a answer choice");
					ma1 = input.nextLine();
				}

				s--; // To decrease the number of questions remaining
				// If question is right
				if (ma1.equalsIgnoreCase("C")) {
					q++; // To increase the number of questions answered correctly
					System.out.println("Your answer is correct\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");
				}
				// If question is wrong
				else if (!ma1.equalsIgnoreCase("C")) {
					r++; // To increase the number or errors made
					System.out.println("Your answer is incorrect\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");

				}

				// Question 1 ends here

				// To move on to question 2
				System.out.println("Press enter to move on to question 2");
				String asdc = input.nextLine();

				// To force the user to press enter
				while (!asdc.equalsIgnoreCase("")) {
					System.out.println("What do you mean '" + asdc
							+ "' muttoos? Want to bang the head? If you want to move to the next question press enter");
					asdc = input.nextLine();
				}

				// Question 2
				if (asdc.equalsIgnoreCase("")) {
					System.out.println(
							"Question 2: \nWhat is the following equation in slope-intercept form?\n 7x - 4y = 23");
					String ma2 = input.nextLine();

					s--; // To decrease the number of questions remaining
					// If question is right
					if (ma2.equalsIgnoreCase("y = -7/4x + 5.75")) {
						q++; // To increase the number of questions answered correctly
						System.out.println("Your answer is correct\n" + q + " correct\n" + r + " incorrect\n" + s
								+ " questions remaining");
					}
					// If question is wrong
					else if (!ma2.equalsIgnoreCase("y = -7/4x + 5.75")) {
						r++; // To increase the number or errors made
						System.out.println("Your answer is incorrect\n" + q + " correct\n" + r + " incorrect\n" + s
								+ " questions remaining");

					}

				}

			}

			// Question 2 ends here

			// To move on to question 3
			System.out.println("Press enter to move on to question 3");
			String bsdc = input.nextLine();

			// To force the user to press enter
			while (!bsdc.equalsIgnoreCase("")) {
				System.out.println("What do you mean '" + bsdc
						+ "' muttoos? Want to bang the head? If you want to move to the next question press enter");
				bsdc = input.nextLine();
			}

			// Question 3
			if (bsdc.equalsIgnoreCase("")) {
				System.out.println(
						"Question 3: \nWhat is the answer to the following inequality?\n 3x - 4b(71²) ÷ 5/16 ≥ 234");
				String ma3 = input.nextLine();

				s--; // To decrease the number of questions remaining
				// If question is right
				if (ma3.equalsIgnoreCase("No Solution")) {
					q++; // To increase the number of questions answered correctly
					System.out.println("Your answer is correct\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");
				}
				// If question is wrong
				else if (!ma3.equalsIgnoreCase("No Solution")) {
					r++; // To increase the number or errors made
					System.out.println("Your answer is incorrect\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");

				}

			}
			// Question 3 ends here

			// To move on to question 4
			System.out.println("Press enter to move on to question 4");
			String csdc = input.nextLine();

			// To force the user to press enter
			while (!csdc.equalsIgnoreCase("")) {
				System.out.println("What do you mean '" + csdc
						+ "' muttoos? Want to bang the head? If you want to move to the next question press enter");
				csdc = input.nextLine();
			}

			// Question 4
			if (bsdc.equalsIgnoreCase("")) {
				System.out.println("Question 4: \nSolve the following equation\n 3r - 4 = 16 - 7r");
				String ma4 = input.nextLine();

				s--; // To decrease the number of questions remaining
				// If question is right
				if (ma4.equalsIgnoreCase("5")) {
					q++; // To increase the number of questions answered correctly
					System.out.println("Your answer is correct\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");
				}
				// If question is wrong
				else if (!ma4.equalsIgnoreCase("5")) {
					r++; // To increase the number or errors made
					System.out.println("Your answer is incorrect\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");

				}

			}
			// Question 4 ends here

			// To move on to question 5
			System.out.println("Press enter to move on to question 5");
			String dsdc = input.nextLine();

			// To force the user to press enter
			while (!dsdc.equalsIgnoreCase("")) {
				System.out.println("What do you mean '" + dsdc
						+ "' muttoos? Want to bang the head? If you want to move to the next question press enter");
				dsdc = input.nextLine();
			}

			// Question 5
			if (bsdc.equalsIgnoreCase("")) {
				System.out.println("Question 5: \nConvert the following fraction to a decimal\n 7/20");
				String ma5 = input.nextLine();

				s--; // To decrease the number of questions remaining
				// If question is right
				if (ma5.equalsIgnoreCase("0.35")) {
					q++; // To increase the number of questions answered correctly
					System.out.println("Your answer is correct\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");
				}
				// If question is wrong
				else if (!ma5.equalsIgnoreCase("0.35")) {
					r++; // To increase the number or errors made
					System.out.println("Your answer is incorrect\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");

				}

			}
			// Question 5 ends here

			// To move on to question 6
			System.out.println("Press enter to move on to question 6");
			String esdc = input.nextLine();

			// To force the user to press enter
			while (!esdc.equalsIgnoreCase("")) {
				System.out.println("What do you mean'" + esdc
						+ "'muttoos? Want to bang the head? If you want to move to the next question press enter");
				esdc = input.nextLine();
			}

			// Question 6
			if (esdc.equalsIgnoreCase("")) {
				System.out.println("Question 6: \n Compute the following question\n (-5)² - 4²");
				String ma6 = input.nextLine();

				s--; // To decrease the number of questions remaining
				// If question is right
				if (ma6.equalsIgnoreCase("9")) {
					q++; // To increase the number of questions answered correctly
					System.out.println("Your answer is correct\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");
				}
				// If question is wrong
				else if (!ma6.equalsIgnoreCase("9")) {
					r++; // To increase the number or errors made
					System.out.println("Your answer is incorrect\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");

				}

			}
			// Question 6 ends here

			// To move on to question 7
			System.out.println("Press enter to move on to question 7");
			String fsdc = input.nextLine();

			// To force the user to press enter
			while (!fsdc.equalsIgnoreCase("")) {
				System.out.println("What do you mean '" + fsdc
						+ "' muttoos? Want to bang the head? If you want to move to the next question press enter");
				fsdc = input.nextLine();
			}

			// Question 7
			if (esdc.equalsIgnoreCase("")) {
				System.out.println("Question 7: \n V = LWH\t Solve for W ");
				String ma7 = input.nextLine();

				s--; // To decrease the number of questions remaining
				// If question is right
				if (ma7.equalsIgnoreCase("W = V/LH")) {
					q++; // To increase the number of questions answered correctly
					System.out.println("Your answer is correct\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");
				}
				// If question is wrong
				else if (!ma7.equalsIgnoreCase("W = V/LH")) {
					r++; // To increase the number or errors made
					System.out.println("Your answer is incorrect\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");

				}

			}
			// Question 7 ends here

			// To move on to question 8
			System.out.println("Press enter to move on to question 8");
			String gsdc = input.nextLine();

			// To force the user to press enter
			while (!gsdc.equalsIgnoreCase("")) {
				System.out.println("What do you mean '" + gsdc
						+ "' muttoos? Want to bang the head? If you want to move to the next question press enter");
				gsdc = input.nextLine();
			}

			// Question 8
			if (esdc.equalsIgnoreCase("")) {
				System.out.println(
						"Question 8:\n Which of the following is a solution that makes the inequality 7 - 5x < 32 true?\n A. 0\n B. -8\n C. -7\n D. -5\n");
				String ma8 = input.nextLine();
				// To prevent the user from inputing an answer which is not displayed
				while (!ma8.equalsIgnoreCase("A") && !ma8.equalsIgnoreCase("B") && !ma8.equalsIgnoreCase("C")
						&& !ma8.equalsIgnoreCase("D")) {
					System.out.println(ma8 + " is not an answer choice");
					ma8 = input.nextLine();
				}

				s--; // To decrease the number of questions remaining
				// If question is right
				if (ma8.equalsIgnoreCase("A")) {
					q++; // To increase the number of questions answered correctly
					System.out.println("Your answer is correct\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");
				}
				// If question is wrong
				else if (!ma8.equalsIgnoreCase("A")) {
					r++; // To increase the number or errors made
					System.out.println("Your answer is incorrect\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");

				}

			}
			// Question 8 ends here

			// To move on to question 9
			System.out.println("Press enter to move on to question 9");
			String hsdc = input.nextLine();

			// To force the user to press enter
			while (!hsdc.equalsIgnoreCase("")) {
				System.out.println("What do you mean '" + hsdc
						+ "' muttoos? Want to bang the head? If you want to move to the next question press enter");
				hsdc = input.nextLine();
			}

			// Question 9
			if (hsdc.equalsIgnoreCase("")) {
				System.out.println(
						"Question 9:\n The perimeter of a rectangle is 44 inches. The length of the rectangle can be "
								+ "represented by (7x - 4), and its width can be represented by (x + 2). What are the "
								+ "dimensions of the rectangle in inches");

				String ma9 = input.nextLine();
				s--; // To decrease the number of questions remaining
				// If question is right
				if (ma9.equalsIgnoreCase("x = 3") && ma9.equalsIgnoreCase("3")) {
					q++; // To increase the number of questions answered correctly
					System.out.println("Your answer is correct\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");
				}
				// If question is wrong
				else if (!ma9.equalsIgnoreCase("x = 3") && !ma9.equalsIgnoreCase("3")) {
					r++; // To increase the number or errors made
					System.out.println("Your answer is incorrect\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");

				}

			}
			// Question 9 ends here

			// To move on to question 10
			System.out.println("Press enter to move on to question 10");
			String isdc = input.nextLine();

			// To force the user to press enter
			while (!isdc.equalsIgnoreCase("")) {
				System.out.println("What do you mean '" + isdc
						+ "' muttoos? Want to bang the head? If you want to move to the next question press enter");
				isdc = input.nextLine();
			}

			// Question 10
			if (isdc.equalsIgnoreCase("")) {
				System.out.println(
						" Question 10:\n Which of the following is equivalent to ab + c = d?\n A. a = d - c/b\n B. a = (d - c)/b\n"
								+ " C. a = d + c/b\n D. a = (d+c)/b");
				String ma10 = input.nextLine();
				// To prevent the user from inputing an answer which is not displayed
				while (!ma10.equalsIgnoreCase("A") && !ma10.equalsIgnoreCase("B") && !ma10.equalsIgnoreCase("C")
						&& !ma10.equalsIgnoreCase("D")) {
					System.out.println(ma10 + " is not an answer choice");
					ma10 = input.nextLine();
				}

				s--; // To decrease the number of questions remaining
				// If question is right
				if (ma10.equalsIgnoreCase("B")) {
					q++; // To increase the number of questions answered correctly
					System.out.println("Your answer is correct\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");
				}
				// If question is wrong
				else if (!ma10.equalsIgnoreCase("B")) {
					r++; // To increase the number or errors made
					System.out.println("Your answer is incorrect\n" + q + " correct\n" + r + " incorrect\n" + s
							+ " questions remaining");

				}

			}
			// Math questions end here

			// To give the user the option to see the results or to return to the quiz
			// selection menu
			System.out.println(
					"\nYou have completed the math quiz.\n To see your results press enter.");
			String options = input.nextLine();

			

		}
		System.out.println("To return to the quiz selection menu press 1.");
		String selection = input.nextLine();
		if (selection.equalsIgnoreCase("1")) {
			System.out.println(
					"What type of quiz would you like to do: \n 1. Math \n 2. Science \n 3. History \n 4. Avengers \n 5. Nitty Katu;\n"
							+ "Enter your choice:");
			choice = input.nextLine();
		}
		

		// Math quiz code ends here

		input.close();
	}
}
