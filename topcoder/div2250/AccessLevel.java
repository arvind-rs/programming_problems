import java.util.*;

public class AccessLevel {

	public static void main(String[] args) {

		int[] test1_rights = {0,1,2,3,4,5};
		int test1_min = 2;

		int[] test2_rights = {34,78,9,52,11,1};
		int test2_min = 49;

		System.out.println(canAccess(test1_rights,test1_min));
		System.out.println(canAccess(test2_rights,test2_min));
	}

	public static String canAccess(int[] rights, int min) {

		System.out.println(Arrays.toString(rights));
		System.out.println(min);

		String level = "";
		for(int i=0;i<rights.length;i++) {
			if(rights[i] >= min)
				level += "A";
			else
				level += "D";
		}

		return level;
	}
}