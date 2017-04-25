import java.util.*;

public class CombiningSlimes {

	public static void main(String[] args) {

		int[] test1 = {3,4};
		int[] test2 = {2,2,2};
		int[] test3 = {3,1,2};
		int[] test4 = {7,6,5,3,4,6};

		System.out.println(maxMascots(test1));
		System.out.println(maxMascots(test2));
		System.out.println(maxMascots(test3));
		System.out.println(maxMascots(test4));
	}

	public static int maxMascots(int[] a) {

		System.out.println(Arrays.toString(a));

		int result = 0;

		Stack<Integer> stack = new Stack<Integer>();

		for(int i=0;i<a.length;i++)
			stack.push(a[i]);

		while(stack.size()>=2) {

			int operand1 = (int)stack.pop();
			int operand2 = (int)stack.pop();

			result += (operand1 * operand2);

			stack.push(operand1 + operand2);
		}

		return result;
	}
}