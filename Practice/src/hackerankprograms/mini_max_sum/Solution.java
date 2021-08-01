package hackerankprograms.mini_max_sum;

public class Solution {

	static void miniMaxSum(int[] arr) {
		int i, j, temp;
		long nano_startTime = System.nanoTime();
//		for (i = 0; i < arr.length; i++) {
//		for (j = 0; j < arr.length - i - 1; j++) {
//				// Swapping Logic
//				if (arr[j] > arr[j + 1]) {
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//
//		int m = arr[0] + arr[1] + arr[2] + arr[3];
//		int ma = arr[1] + arr[2] + arr[3] + arr[4];
//		System.out.print(m);
//		System.out.print(" " + ma);
		long max, min, sum;
		min = max = sum = arr[0];
		for (i = 1; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.print((sum-max)+" "+(sum-min));
		System.out.println();
		System.out.println(System.nanoTime() - nano_startTime);

	}
}
