import java.util.*;

public class LittleElephantAndBooks {

	public static void main(String[] args) {

		int[] pages_test_1 = {74, 7, 4, 47, 44};
		int number_test_1 = 3;

		int[] pages_test_2 = {3, 1, 9, 7, 2, 8, 6, 4, 5};
		int number_test_2 = 7;

		int[] pages_test_3 = {74, 86, 32, 13, 100, 67, 77};
		int number_test_3 = 2;

		int[] pages_test_4 = {1, 2};
		int number_test_4 = 1;

		System.out.println(getNumber(pages_test_1,number_test_1));
		System.out.println(getNumber(pages_test_2,number_test_2));
		System.out.println(getNumber(pages_test_3,number_test_3));
		System.out.println(getNumber(pages_test_4,number_test_4));
	}

	public static int getNumber(int[] pages,int number) {

		System.out.println(Arrays.toString(pages));
		System.out.println(number);

		Arrays.sort(pages);

		int[] subset = new int[number];

		for(int i=0;i<number;i++) {
			subset[i] = pages[i];
		}

		subset[number-1] = pages[number];

		int sum = 0;
		for(int i=0;i<number;i++) {
			sum += subset[i];
		}

		return sum;
	}
}