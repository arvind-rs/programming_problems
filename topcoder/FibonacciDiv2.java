import java.util.*;

public class FibonacciDiv2 {

	public static void main(String[] args) {

		int test1 = 1;
		int test2 = 15;
		int test3 = 19;
		int test4 = 1000000;

		System.out.println(find(test1));
		System.out.println(find(test2));
		System.out.println(find(test3));
		System.out.println(find(test4));
	}

	public static int find(int N) {

		System.out.println(N);

		int a = 0;
		int b = 1;

		while(b < N) {
			int temp = a;
			a = b;
			b = b + temp;
		}

		return Math.min(N - a, b - N);
	}
}