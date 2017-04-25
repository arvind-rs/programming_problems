import java.util.*;

public class Soccer {

	public static void main(String[] args) {

		int[] test1_wins = {1,4,3,0,0};
		int[] test1_ties = {3,1,5,3,1};
		int[] test2_wins = {35,0};
		int[] test2_ties = {0,76};
		int[] test3_wins = {0,0,0,0};
		int[] test3_ties = {0,0,0,0};
		int[] test4_wins = {13,79,26,73,14,89,71,37,89,71,19,59,39};
		int[] test4_ties = {88,27,5,70,84,94,20,50,2,11,31,22,50};

		System.out.println(maxPoints(test1_wins,test1_ties));
		System.out.println(maxPoints(test2_wins,test2_ties));
		System.out.println(maxPoints(test3_wins,test3_ties));
		System.out.println(maxPoints(test4_wins,test4_ties));
	}

	public static int maxPoints(int[] wins,int[] ties) {

		System.out.println(Arrays.toString(wins));
		System.out.println(Arrays.toString(ties));

		int max = 0;

		for(int i=0;i<wins.length;i++) {
			int score = 3 * wins[i] + 1 * ties[i];
			if(score > max)
				max = score;
		}

		return max;
	}
}