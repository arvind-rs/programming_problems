import java.util.*;

public class ForgetfulAddition {

	public static void main(String[] args) {

		String test1 = "1289";
		String test2 = "22";
		String test3 = "123";
		String test4 = "31415926";
		String test5 = "98765";

		System.out.println(minNumber(test1));
		System.out.println(minNumber(test2));
		System.out.println(minNumber(test3));
		System.out.println(minNumber(test4));
		System.out.println(minNumber(test5));
	}

	public static int minNumber(String expression) {

		System.out.println(expression);

		int n = expression.length() - 1;
		int number = Integer.parseInt(expression);
		int min = 99999;
		int left = 0;
		int right = 0;
		for(int i = 10; i <= Math.pow(10,n); i *= 10) {
			left = number / i;
			right = number % i;
			if((left + right) < min)
				min = left + right;
		}

		return min;
	}
}