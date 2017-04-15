import java.util.*;

public class TopFox {

	public static void main(String[] args) {

		String test1_family = "abb";
		String test1_given = "bbc";

		String test2_family = "fox";
		String test2_given = "ciel";

		String test3_family = "ababababab";
		String test3_given = "bababababa";


		System.out.println(possibleHandles(test1_family,test1_given));
		System.out.println(possibleHandles(test2_family,test2_given));
		System.out.println(possibleHandles(test3_family,test3_given));
	}

	public static int possibleHandles(String family, String given) {

		System.out.println(family);
		System.out.println(given);

		HashSet<String> hs = new HashSet<String>();

		String familyPrefix = "";
		for(int i=0;i<family.length();i++) {
			familyPrefix += family.charAt(i) + "";
			String givenPrefix = "";
			for(int j=0;j<given.length();j++) {
				givenPrefix += given.charAt(j) + "";
				hs.add(familyPrefix + givenPrefix);
			}
		}

		System.out.println(hs);

		return hs.size();
	}
}