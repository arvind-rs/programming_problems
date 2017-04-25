import java.util.*;

public class ElectionFraudDiv2 {

	public static void main(String[] args) {

		int[] test1 = {34, 34, 34};
		int[] test2 = {34, 33, 34};

		System.out.println(IsFraudulent(test1));
		System.out.println(IsFraudulent(test2));
	}

	public static String IsFraudulent(int[] percentages) {

		System.out.println(Arrays.toString(percentages));

		double lower = 0;
		double upper = 0;

		for(int i : percentages) {
			//System.out.println(i);
			if(i > 0)
				lower += i - 0.5;
			else
				lower += 0;
			upper += i + 0.49;
		}

		//System.out.println(lower);
		//System.out.println(upper);

		if(lower > 100 || upper < 100)
			return "YES";
		return "NO";
	}
}