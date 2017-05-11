import java.util.*;

//This is a wrong algorithm for Anagram String Search. AnagramStringSearch.java is the correct solution.

public class StringSearch {

	public static void main(String[] args) {

		String b = "cbabadcbbabbcbabaabccbabc";
		String s = "abbc";

		String b1 = "bgfdg";
		String s1 = "g";

		String b2 = "";
		String s2 = "";

		findPermutations(b,s);
	}

	public static void findPermutations(String b, String s) {

		System.out.println(b);
		System.out.println(s);

		Hashtable ht = new Hashtable();

		int count = 0, pos = -1;

		for(int i=0;i<s.length();i++)
			ht.put(i,s.charAt(i));

		for(int i=0;i<b.length();i++) {
			if(ht.contains(b.charAt(i))) {
				count++;
				if(pos == -1)
					pos = i;
			}
			else {
				count = 0;
				pos = -1;
			}
			if(count == s.length()) {
				System.out.println(pos);
				pos = -1;
				count = 0;
			}
		}
	}
}