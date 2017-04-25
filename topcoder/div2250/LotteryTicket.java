import java.util.*;

/*
* Solution to the LotteryTicket problem. (https://community.topcoder.com/stat?c=problem_statement&pm=10860)
* Author: ArvindRS
* Date: 04/24/2017
*/

public class LotteryTicket {

	// Main function
	public static void main(String[] args) {

		// Test cases
		int test_1_p = 10;
		int test_1_b1 = 1;
		int test_1_b2 = 5;
		int test_1_b3 = 10;
		int test_1_b4 = 50;

		int test_2_p = 15;
		int test_2_b1 = 1;
		int test_2_b2 = 5;
		int test_2_b3 = 10;
		int test_2_b4 = 50;

		int test_3_p = 65;
		int test_3_b1 = 1;
		int test_3_b2 = 5;
		int test_3_b3 = 10;
		int test_3_b4 = 50;

		int test_4_p = 66;
		int test_4_b1 = 1;
		int test_4_b2 = 5;
		int test_4_b3 = 10;
		int test_4_b4 = 50;

		int test_5_p = 1000;
		int test_5_b1 = 999;
		int test_5_b2 = 998;
		int test_5_b3 = 997;
		int test_5_b4 = 996;

		int test_6_p = 20;
		int test_6_b1 = 5;
		int test_6_b2 = 5;
		int test_6_b3 = 5;
		int test_6_b4 = 5;

		int test_7_p = 2;
		int test_7_b1 = 1;
		int test_7_b2 = 5;
		int test_7_b3 = 10;
		int test_7_b4 = 50;

		// Calling the buy function
		System.out.println(buy(test_1_p,test_1_b1,test_1_b2,test_1_b3,test_1_b4));
		System.out.println(buy(test_2_p,test_2_b1,test_2_b2,test_2_b3,test_2_b4));
		System.out.println(buy(test_3_p,test_3_b1,test_3_b2,test_3_b3,test_3_b4));
		System.out.println(buy(test_4_p,test_4_b1,test_4_b2,test_4_b3,test_4_b4));
		System.out.println(buy(test_5_p,test_5_b1,test_5_b2,test_5_b3,test_5_b4));
		System.out.println(buy(test_6_p,test_6_b1,test_6_b2,test_6_b3,test_6_b4));
		System.out.println(buy(test_7_p,test_7_b1,test_7_b2,test_7_b3,test_7_b4));
	}

	// Public function to recursivey apply brute force and check if a ticket can be bought with the given cash bills without change
	public static String buy(int price, int b1, int b2, int b3, int b4) {

		// Base cases
		if(price == 0)
			return "POSSIBLE";
		if(price < 0)
			return "IMPOSSIBLE";

		// Recursively check for all possibilities
		if(b1 != 0) {
			String result = buy(price - b1, 0, b2, b3, b4);
			if(result.equals("POSSIBLE"))
				return result;
		}
		if(b2 != 0) {
			String result = buy(price - b2, b1, 0, b3, b4);
			if(result.equals("POSSIBLE"))
				return result;
		}
		if(b3 != 0) {
			String result = buy(price - b3, b1, b2, 0, b4);
			if(result.equals("POSSIBLE"))
				return result;
		}
		if(b4 != 0) {
			String result = buy(price - b4, b1, b2, b3, 0);
			if(result.equals("POSSIBLE"))
				return result;
		}

		// If no option was a success, return IMPOSSIBLE
		return "IMPOSSIBLE";
	}
}