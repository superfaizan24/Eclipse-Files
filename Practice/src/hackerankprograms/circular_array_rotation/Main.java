package hackerankprograms.circular_array_rotation;

public class Main {

	public static void main(String[] args) {
		int a[] = {3,4,5,7,7,4,2,1,3};
		int k = 2;
		int queries[] = {1,2};
		int b[] = new int [a.length];
		b=Solution.circularArrayRotation(a, k, queries);
		int i;
		for(i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
