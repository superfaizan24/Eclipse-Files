package simpleprograms;

public class EvenNumbersToTwenty {

	public static void main(String arr[]) {
		int i;

		// for(i=6;i<=20;i++)
		// System.out.println(i % 2 == 0? i:"");

		/*
		 * for(i=6;i<=20;i++) { if(i%2==0) System.out.println(i); }
		 */

		/*
		 * for(i=6;i<=20;i+=2) System.out.println(i);
		 */
		i = 6;
		while (i <= 20) {
			System.out.println(i);
			i += 2;
		}

	}
}