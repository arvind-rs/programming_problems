import java.util.*;

public class ThePalindrome {

	public static void main(String[] args) {

		String test1 = "abab";
		String test2 = "abacaba";
		String test3 = "qwerty";
		String test4 = "abdfhdyrbdbsdfghjkllkjhgfds";

		System.out.println(find(test1));
		System.out.println(find(test2));
		System.out.println(find(test3));
		System.out.println(find(test4));
	}

	public static int find(String s) {

		String ss = "";
		String ret = "";
		if(isPalindrome(s)) return s.length();

		for(int i=0;i<s.length();i++) {
			ss += s.charAt(i);
			StringBuilder sb = new StringBuilder(ss);
			ret = s + sb.reverse().toString();
			if(isPalindrome(ret))
				break;
		}

		return ret.length();
	}

	private static boolean isPalindrome(String str) {

		StringBuilder sb = new StringBuilder(str);

		if(sb.reverse().toString().equals(str))
			return true;
		else
			return false;
	}
}