import java.util.*;

public class TheTournamentDivTwo {

	public static void main(String[] args) {

		int[] test1 = {10, 1, 1};
		int[] test2 = {1, 1, 1};
		int[] test3 = {0, 0, 0, 0, 0, 0, 0};
		int[] test4 = {13, 8, 7};

		System.out.println(find(test1));
		System.out.println(find(test2));
		System.out.println(find(test3));
		System.out.println(find(test4));
	}

	public static int find(int[] points) {

		System.out.println(Arrays.toString(points));

		int total = 0;
		for(int i=0;i<points.length;i++)
			total += points[i];
		if(total % 2 == 1)
			return -1;

		int wins = 0;
		int draws = 0;
		for(int i=0;i<points.length;i++) {
			int current = points[i];
			if(current % 2 == 0)
				wins += current / 2;
			else if(current % 2 == 1) {
				wins += (current - 1) / 2;
				draws += 1;
			}
		}

		return wins + (draws / 2);
	}
}