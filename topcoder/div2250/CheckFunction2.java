import java.util.*;

public class CheckFunction2 {

	public static void main(String[] args) {

		String test1 = "13579";
		String test2 = "02468";
		String test3 = "73254370932875002027963295052175";

		System.out.println(newFunction(test1));
		System.out.println(newFunction(test2));
		System.out.println(newFunction(test3));
	}

	public static int newFunction(String code) {

		int[] key = {6,2,5,5,4,5,6,3,7,6};
		int sum = 0;

		for(int i = 0; i < code.length(); i++)
			sum += key[code.charAt(i) - '0'];

		return sum;
	}
}