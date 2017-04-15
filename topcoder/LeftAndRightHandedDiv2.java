import java.util.*;

public class LeftAndRightHandedDiv2 {

	public static void main(String[] args) {

		String test1 = "LRLRLR";
		String test2 = "RRR";
		String test3 = "RLRLRL";

		System.out.println(count(test1));
		System.out.println(count(test2));
		System.out.println(count(test3));
	}

	public static int count(String s) {

		System.out.println(s);

		int num = 0;
		for(int i = 0;i < s.length() - 1;i++) {
			if(s.charAt(i) == 'R' && s.charAt(i + 1) == 'L')
				num += 1;
		}

		return num;
	}
}