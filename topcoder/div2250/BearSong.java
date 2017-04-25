import java.util.*;

/*
* Solution to the BearSong problem. (https://community.topcoder.com/stat?c=problem_statement&pm=14082)
* Author: ArvindRS
* Date: 04/24/2017
*/

public class BearSong {

	// Main function
	public static void main(String[] args) {

		// Test cases
		int[] test1 = {9,10,7,8,9};
		int[] test2 = {8,8,7,6,7,3,5,10,9,3};
		int[] test3 = {234,462,715,596,906};
		int[] test4 = {1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,
1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,
1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000};
		int[] test5 = null;

		// Calling the count function
		System.out.println(countRareNotes(test1));
		System.out.println(countRareNotes(test2));
		System.out.println(countRareNotes(test3));
		System.out.println(countRareNotes(test4));
		System.out.println(countRareNotes(test5));
	}

	// Public function to count the singular numbers in the given input array
	public static int countRareNotes(int[] array) {

		// Print the input array
		System.out.println(Arrays.toString(array));

		// Check for edge cases
		if(array == null)
			return -1;

		// Create a table to store the number and it's count
		HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
		for(int i = 0; i < array.length; i++) {
			// Check if the number is already in the table; if yes, get it's count and increment it, else add it to the table
			if(table.get(array[i]) != null) {
				int count = table.get(array[i]);
				table.put(array[i],count + 1);
			}
			else
				table.put(array[i],1);
		}

		// Create a counter variable to keep track of the number of singleton variables
		int counter = 0;
		for(int i = 0; i < array.length; i++) {
			if(table.get(array[i]) == 1)
				counter++;
		}

		// Return the result
		return counter;
	}
}