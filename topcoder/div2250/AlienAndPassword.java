import java.util.*;

class AlienAndPassword {

	public static void main(String[] args) {

		String test1 = "ABA";
		String test2 = "AABACCCCABAA";
		String test3 = "AGAAGAHHHHFTQLLAPUURQQRRRUFJJSBSZVJZZZ";
		String test4 = "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ";

		System.out.println(getNumber(test1));
		System.out.println(getNumber(test2));
		System.out.println(getNumber(test3));
		System.out.println(getNumber(test4));
	}

	public static int getNumber(String s) {

		System.out.println(s);

		HashSet<String> hs = new HashSet<String>();

		for(int i=0;i<s.length();i++) {
			String temp = s.substring(0,i) + s.substring(i+1);
			//System.out.println(temp);
			hs.add(temp);
		}

		//System.out.println(hs);

		return hs.size();
	}
}