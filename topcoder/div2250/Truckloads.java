import java.util.*;

/*
* Solution to the Truckloads problem. (https://community.topcoder.com/stat?c=problem_statement&pm=6011)
* Author: ArvindRS
* Date: 04/24/2017
*/

public class Truckloads {

	// Main function
	public static void main(String[] args) {

		// Test cases
		int test_1_n = 14;
		int test_1_l = 3;

		int test_2_n = 15;
		int test_2_l = 1;

		int test_3_n = 1024;
		int test_3_l = 5;

		// Calling numTrucks function
		System.out.println(numTrucks(test_1_n, test_1_l));
		System.out.println(numTrucks(test_2_n, test_2_l));
		System.out.println(numTrucks(test_3_n, test_3_l));
	}

	// Public function to compute the number of trucks required
	public static int numTrucks(int numCrates, int loadSize) {

		// Base case
		if(numCrates <= loadSize)
			return 1;

		// Split the number of crates into two halves
		int firstHalf = (int)Math.ceil(numCrates / 2);
		int secondHalf = numCrates - firstHalf;

		// Recursively call the numTrucks function on the two halves and add the result
		return numTrucks(firstHalf, loadSize) + numTrucks(secondHalf, loadSize);
	}
}