import java.util.*;

public class FixedDiceGameDiv2 {

	public static void main(String[] args) {

		int a1 = 2;
		int b1 = 2;

		int a2 = 4;
		int b2 = 2;

		int a3 = 3;
		int b3 = 3;

		int a4 = 11;
		int b4 = 13;

		System.out.println(getExpectation(a1,b1));
		System.out.println(getExpectation(a2,b2));
		System.out.println(getExpectation(a3,b3));
		System.out.println(getExpectation(a4,b4));
	}

	public static double getExpectation(int a,int b) {

		System.out.println(a);
		System.out.println(b);

		double sum = 0;
		double iterations = 0;
		for(int j=1;j<=b;j++) {
			for(int i=j+1;i<=a;i++) {
				sum += (double)i;
				iterations++;
			}
		}

		//System.out.println(sum);
		//System.out.println(iterations);

		return ((double)sum / (double)iterations);
	}
}