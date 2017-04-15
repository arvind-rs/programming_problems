import java.util.*;

public class MultiNumber {

	public static void main(String[] args) {

		int test1 = 1221;
		int test2 = 1236;
		int test3 = 4729382;
		int test4 = 42393338;
		int test5 = 1234;

		System.out.println(check(test1));
		System.out.println(check(test2));
		System.out.println(check(test3));
		System.out.println(check(test4));
		System.out.println(check(test5));
	}

	public static String check(int number) {

		System.out.println(number);

		int right = number % 10;
		int temp = number / 10;
		int left = 1;
		while(temp > 0) {
			left *= temp % 10;
			temp /= 10;
		}
		
		temp = number / 10;
		while(temp > 0) {
			int current = temp % 10;
			if(left == right)
				return "YES";
			left /= current;
			right *= current;
			temp /= 10;
		}

		return "NO";
	}
}