import java.util.*;

/*
* Solution to the ThePalindrome problem. (https://community.topcoder.com/stat?c=problem_statement&pm=10182)
* Author: ArvindRS
* Date: 04/26/2017
*/

public class ThePalindrome {

	// Main function
	public static void main(String[] args) {

		// Test cases
		String test1 = "abab";
		String test2 = "cabcb";
		String test3 = "abacaba";
		String test4 = "qwerty";
		String test5 = "abdfhdyrbdbsdfghjkllkjhgfds";
		String test6 = "zazazazazazazazazazazazazazazazazazazazazazazazaza";
		String test7 = "repggxrpnrvystmwcysyycqpevikeffmzn";

		// Calling the find()
		System.out.println(find(test1));
		System.out.println(find(test2));
		System.out.println(find(test3));
		System.out.println(find(test4));
		System.out.println(find(test5));
		System.out.println(find(test6));
		System.out.println(find(test7));
	}

	// Public function to find the length of the shortest palindrome string that can be created.
	// Keep taking the chars from the front and insert them into the nth position until the string is a palindrome
	// T(N) = O(N^2) & S(N) = O(N)
	public static int find(String s) {

		// Print the string
		System.out.println(s);

		// Check if the input string already a palindrome
		if(isPalindrome(s))
			return s.length();

		// Create a StringBuilder object
		StringBuilder sb = new StringBuilder(s);

		// Iteratively take the chars from the front and insert them into the nth position
		int n = s.length();
		for(int i = 0; i < n; i++) {
			char c = s.charAt(i);
			sb.insert(n,c);
			// Check if the newly formed string is a palindrome; if yes break the loop 
			if(isPalindrome(sb.toString()))
				break;
		}

		// Finally, check if the formed string is a palindrome; if yes return it's length else return -1 as error code
		if(isPalindrome(sb.toString()))
			return sb.toString().length();
		else
			return -1;
	}

	// Private helper function to check if the given string is a palindrome
	private static boolean isPalindrome(String s) {
		int j = s.length();
		for(int i = 0; i < s.length(); i++) {
			j--;
			if(s.charAt(i) != s.charAt(j))
				return false;
			if(i == j)
				break;
		}
		return true;
	}
}