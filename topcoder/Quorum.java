import java.util.*;

public class Quorum {

	public static void main(String[] args) {

		int[] test1 = {5,2,3};
		int k1 = 1;

		int[] test2 = {50,2,9,49,38};
		int k2 = 3;

		int[] test3 = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		int k3 = 14;

		System.out.println(count(test1,k1));
		System.out.println(count(test1,k2));
		System.out.println(count(test3,k3));
	}

	public static int count(int[] arr, int k) {

		System.out.println(Arrays.toString(arr));
		System.out.println(k);

		Arrays.sort(arr);

		//System.out.println(Arrays.toString(arr));
		//System.out.println(arr[0]);

		int sum = 0;

		for(int i=0;i<k;i++) {
			//System.out.println(i);
			//System.out.println(arr[0]);
			//System.out.println(arr[i]);
			sum += arr[i];
		}

		return sum;
	}
}