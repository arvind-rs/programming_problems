import java.util.*;

public class AnagramStringSearch {

	public static void main(String args[]) {

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

		int[] permutation = new int[256];
		int[] current_window = new int[256];

		for(int i=0;i<256;i++) {
			permutation[i] = 0;
			current_window[i] = 0;
		}

		for(int i=0;i<s.length();i++) {
			permutation[s.charAt(i)]++;
			current_window[b.charAt(i)]++;
		}

		int M = s.length();
		for(int i=M;i<b.length();i++) {
			if(compare(permutation,current_window)) {
				System.out.println(i-M);
			}

			current_window[b.charAt(i)]++;
			current_window[b.charAt(i-M)]--;
		}
	}

	public static boolean compare(int[] array1,int[] array2) {

		for(int i=0;i<256;i++) {
			if(array1[i]!=array2[i])
				return false;
		}
		return true;
	}
}