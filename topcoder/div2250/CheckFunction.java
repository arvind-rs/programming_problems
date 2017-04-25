import java.util.*;

class CheckFunction {

	public static void main(String args[]) {

		String test1 = "13579";
		String test2 = "73254370932875002027963295052175";


		System.out.println(newFunction(test1));
		System.out.println(newFunction(test2));
	}

	public static int newFunction(String code) {

		System.out.println(code);

		int[] base = {6,2,5,5,4,5,6,3,7,6};
		int sum = 0;

		for(int i=0;i<code.length();i++) {
			sum += base[Integer.parseInt(""+code.charAt(i))];
		}

		return sum;
	}
}