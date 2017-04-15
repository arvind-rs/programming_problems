import java.util.*;

public class LargestSubsequence {

	public static void main(String[] args) {

		String test1 = "test";
		String test2 = "a";
		String test3 = "example";
		String test4 = "aquickbrownfoxjumpsoverthelazydog";

		System.out.println(getLargest(test1));
		System.out.println(getLargest(test2));
		System.out.println(getLargest(test3));
		System.out.println(getLargest(test4));
	}

	public static String getLargest(String s) {

		System.out.println(s);

		char max = '0';
		String result = "";

		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i) >= max) {
				max = s.charAt(i);
				result = s.charAt(i) + result; 
			}
		}

		return result;
	}
}