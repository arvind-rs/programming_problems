import java.util.*;

public class InequalityChecker {

	public static void main(String[] args) {

		int test1 = 3;
		int test2 = 5;
		int test3 = 50;
		int test4 = 100;

		System.out.println(Arrays.toString(getDifferences(test1)));
		System.out.println(Arrays.toString(getDifferences(test2)));
		System.out.println(Arrays.toString(getDifferences(test3)));
		System.out.println(Arrays.toString(getDifferences(test4)));
	}

	public static int[] getDifferences(int n) {

		System.out.println(n);

		int[] result = new int[2];

		result[0] = (int)Math.pow(n,2);
		result[1] = 4;

		int mod = result[0] % result[1];
		if(mod > 0) {
			result[0] /= mod;
			result[1] /= mod;
		}
		else {
			result[0] /= 4;
			result[1] /= 4;
		}

		return result;
	}
}