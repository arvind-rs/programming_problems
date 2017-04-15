import java.util.*;

public class DengklekTryingToSleep {

	public static void main(String[] args) {

		int[] test1 = {5,2,3};
		int[] test2 = {58};
		int[] test3 = {9, 3, 6, 4};
		int[] test4 = {7, 4, 77, 47, 74, 44};
		int[] test5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		System.out.println(minDucks(test1));
		System.out.println(minDucks(test2));
		System.out.println(minDucks(test3));
		System.out.println(minDucks(test4));
		System.out.println(minDucks(test5));
	}

	public static int minDucks(int[] ducks) {

		System.out.println(Arrays.toString(ducks));

		Arrays.sort(ducks);

		int min = 0;
		for(int i=1;i<ducks.length;i++)
			min += ducks[i] - ducks[i-1] - 1;

		return min;
	}
}