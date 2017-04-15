import java.util.*;

public class SortingSubsets {

	public static void main(String[] args) {

		int[] test1 = {3, 2, 1};
		int[] test2 = {1, 2, 3, 4};
		int[] test3 = {4, 4, 4, 3, 3, 3};
		int[] test4 = {11, 11, 49, 7, 11, 11, 7, 7, 11, 49, 11};

		System.out.println(getMinimalSize(test1));
		System.out.println(getMinimalSize(test2));
		System.out.println(getMinimalSize(test3));
		System.out.println(getMinimalSize(test4));
	}

	public static int getMinimalSize(int[] a) {

		System.out.println(Arrays.toString(a));

		int[] aCopy = Arrays.copyOf(a,a.length);

		Arrays.sort(aCopy);

		int count = 0;
		for(int i=0;i<aCopy.length;i++) {
			if(aCopy[i] != a[i])
				count += 1;
		}

		return count;
	}
}