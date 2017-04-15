import java.util.*;

public class GogoXBallsAndBinsEasy {

	public static void main(String[] args) {

		int[] test1 = {0,2,5};
		int[] test2 = {5, 6, 7, 8};
		int[] test3 = {0, 1, 2, 10};
		int[] test4 = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] test5 = {};

		System.out.println(solve(test1));
		System.out.println(solve(test2));
		System.out.println(solve(test3));
		System.out.println(solve(test4));
		System.out.println(solve(test5));
	}

	public static int solve(int[] T) {

		System.out.println(Arrays.toString(T));

		int count = 0;
		int N = T.length - 1;

		for(int i=0;i<T.length/2;i++) {
			count += (T[N - i] - T[i]);
		}

		return count;
	}
}