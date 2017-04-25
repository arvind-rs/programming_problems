import java.util.*;
import java.math.*;

/*
* Solution to the BearPaints problem. (https://community.topcoder.com/stat?c=problem_statement&pm=13488)
* Author: ArvindRS
* Date: 04/24/2017
*/

public class BearPaints {

	// Main function
	public static void main(String[] args) {

		// Test cases
		int test_1_w = 3;
		int test_1_h = 5;
		BigInteger test_1_m = new BigInteger("14");

		int test_2_w = 1000000;
		int test_2_h = 1000000;
		BigInteger test_2_m = new BigInteger("720000000007");

		int test_3_w = 1000000;
		int test_3_h = 1000000;
		BigInteger test_3_m = new BigInteger("999999999999");

		// Calling the maxArea function
		System.out.println(maxArea(test_1_w,test_1_h,test_1_m));
		System.out.println(maxArea(test_2_w,test_2_h,test_2_m));
		System.out.println(maxArea(test_3_w,test_3_h,test_3_m));
	}

	// Public function to compute the max rectangular area
	public static BigInteger maxArea(int w, int h, BigInteger m) {

		// Print the parameters
		System.out.println(w + " " + h + " " + m);

		// Edge cases
		if(w <= 0 || h <= 0)
			return new BigInteger("-1");

		// Iteratively decrement w and h values until w*h is less than m, then break the loop
		BigInteger max = BigInteger.valueOf(0);
		// Using a label here to break out of the entire nested loop structure
		// In Java, using a label here will actually make the control flow come here and skip the following for loops (crazy sh*t)
		exitloop:
		for(int i = w; i > 0; i--) {
			for(int j = h; j > 0; j--) {
				max = BigInteger.valueOf(i).multiply(BigInteger.valueOf(j));
				if(max.compareTo(m) == -1)
					break exitloop;
			}
		}

		// Return the result
		return max;
	}
}