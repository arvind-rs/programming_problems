import java.util.*;

/*
* Solution to the DerivativeSequence problem. (https://community.topcoder.com/stat?c=problem_statement&pm=6665)
* Author: ArvindRS
* Date: 04/24/2017
*/

public class DerivativeSequence {

	// Main function 
	public static void main(String[] args) {

		// Test cases
		int[] test_1_a = {5,6,3,9,-1};
		int test_1_n = 1;

		int[] test_2_a = {5,6,3,9,-1};
		int test_2_n = 2;

		int[] test_3_a = {5,6,3,9,-1};
		int test_3_n = 6;

		int[] test_4_a = {4,4,4,4,4,4,4,4};
		int test_4_n = 3;

		int[] test_5_a = {-100,100};
		int test_5_n = 0;

		// Calling the derive sequence function
		System.out.println(Arrays.toString(derSeq(test_1_a,test_1_n)));
		System.out.println(Arrays.toString(derSeq(test_2_a,test_2_n)));
		System.out.println(Arrays.toString(derSeq(test_3_a,test_3_n)));
		System.out.println(Arrays.toString(derSeq(test_4_a,test_4_n)));
		System.out.println(Arrays.toString(derSeq(test_5_a,test_5_n)));
	}

	// Public function to recursively find the difference sequence of a given sequence
	public static int[] derSeq(int[] a, int k) {

		// Base cases
		if(k <= 0) return a;
		if(k > a.length) return new int[]{-1};

		// Compute the difference sequence
		int[] diffArray = new int[a.length - 1];
		for(int i = 1; i < a.length; i++) {
			diffArray[i-1] = a[i] - a[i-1];
		}

		// Recursively compute the difference sequence until k = 0
		return derSeq(diffArray,k - 1);
	}
}