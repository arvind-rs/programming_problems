import java.util.*;

public class CheckFunction_1 {

	public static void main(String[] args) {

		String test1 = "13579";
		String test2 = "02468";
		String test3 = "73254370932875002027963295052175";

		System.out.println(newFunction(test1));
		System.out.println(newFunction(test2));
		System.out.println(newFunction(test3));
	}

	public static int newFunction(String code) {

		System.out.println(code);

		int[] arrayMap = {6,2,5,5,4,5,6,3,7,6};

		int result = 0;

		for(int i=0;i<code.length();i++)
			result += arrayMap[Character.getNumericValue(code.charAt(i))];

		return result;
	}
}