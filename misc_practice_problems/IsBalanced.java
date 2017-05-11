import java.util.*;

public class IsBalanced {

	public static void main(String[] args) {

		int[] test1 = {-5,-2,-1,4,8,9};
		int[] test2 = {5,7,9,12};
		int[] test3 = {-6,-4,0};
		int[] test4 = {-1,0,1,2};

		System.out.println(isBalanced(test1));
		System.out.println(isBalanced(test2));
		System.out.println(isBalanced(test3));
		System.out.println(isBalanced(test4));
	}

	public static boolean isBalanced(int[] a) {

		System.out.println(Arrays.toString(a));

		int n = a.length;
		int mid = 0 + ((n-1) - 0) / 2;

		if(n % 2 != 0)
			return false;

		if(a[mid] < 0 && a[mid + 1] > 0)
			return true;
		else
			return false;
	}
}