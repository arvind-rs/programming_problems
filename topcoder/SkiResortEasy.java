import java.util.*;

class SkiResortEasy {

	public static void main(String[] args) {

		int[] test1 = {6, 8, 5, 4, 7, 4, 2, 3, 1};
		int[] test2 = {749, 560, 921, 166, 757, 818, 228, 584, 366, 88};
		int[] test3 = {712, 745, 230, 200, 648, 440, 115, 913, 627, 621, 186, 222, 741, 954, 581, 193, 266, 320, 798, 745};

		System.out.println(minCost(test1));
		System.out.println(minCost(test2));
		System.out.println(minCost(test3));
	}

	public static int minCost(int[] altitude) {

		System.out.println(Arrays.toString(altitude));

		int sum = 0;

		for(int i=0;i<altitude.length-1;i++) {
			//System.out.println("i="+i);
			//System.out.println("altitude[i]="+altitude[i]);
			//System.out.println("altitude[i+1="+altitude[i+1]);

			if(altitude[i] < altitude[i+1]) {
				int temp = altitude[i+1]-altitude[i];
				sum += temp;
				//System.out.println("sum="+sum);
				//System.out.println("temp="+temp);
				altitude[i+1] = altitude[i];
			}
		}

		return sum;
	}
}