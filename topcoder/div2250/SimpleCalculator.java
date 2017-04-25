import java.util.*;

public class SimpleCalculator {

	public static void main(String[] args) {

		String test1 = "5/3";
		String test2 = "15*3";
		String test3 = "1-10000";
		String test4 = "17+18";
		String test5 = "0000000000000018/00000000000000000009";

		System.out.println(calculate(test1));
		System.out.println(calculate(test2));
		System.out.println(calculate(test3));
		System.out.println(calculate(test4));
		System.out.println(calculate(test5));
	}

	public static int calculate(String input) {

		System.out.println(input);

		StringTokenizer st = new StringTokenizer(input,"+-*/",true);

		String num1 = st.nextToken();
		String op = st.nextToken();
		String num2 = st.nextToken();

		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		int result = 0;

		if(op.equals("+"))
			result = num11 + num22;
		else if(op.equals("-"))
			result = num11 - num22;
		else if(op.equals("*"))
			result = num11 * num22;
		else
			result = num11 / num22;

		return result;
	}

	public static int calculate1(String input) {

		System.out.println(input);

		int result = 0;
		int num1 = Character.getNumericValue(input.charAt(0));
		int num2 = Character.getNumericValue(input.charAt(2));

		System.out.println(num1);
		System.out.println(num2);
		String op = input.charAt(1) + "";

		if(op.equals("+"))
			result = num1 + num2;
		else if(op.equals("-"))
			result = num1 - num2;
		else if(op.equals("*"))
			result = num1 * num2;
		else
			result = num1 / num2;

		return result;
	}

}