import java.util.*;

public class KPositive {

	public static void main(String[] args) {

		int[] test1_a = createRandomArray(10);
		int test1_k = 5;

		System.out.println(findKPositive(test1_a,test1_k));
	}

	public static int[] createRandomArray(int n) {

		int[] a = new int[n];
		Random randomNumberGenerator = new Random();

		for(int i = 0; i < n; i++) {
			a[i] = (randomNumberGenerator.nextInt(n) + 1) - (n / 2);
		}
		
		Arrays.sort(a);

		return a;
	}

	public static boolean findKPositive(int[] a, int k) {

		System.out.println(Arrays.toString(a));

		int n = a.length;
		if(a[n - k] > 0)
			return true;
		else 
			return false;
	}
}