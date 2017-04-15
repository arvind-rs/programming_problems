import java.util.*;

public class KiwiJuiceEasy {

	public static void main(String[] args) {

		int[] test1_cap = {10, 10};
		int[] test1_bot = {5, 8};
		int[] test1_from = {0};
		int[] test1_to = {1};
		int[] test2_cap = {30, 20, 10};
		int[] test2_bot = {10, 5, 5};
		int[] test2_from = {0, 1, 2};
		int[] test2_to = {1, 2, 0};
		int[] test3_cap = {14, 35, 86, 58, 25, 62};
		int[] test3_bot = {6, 34, 27, 38, 9, 60};
		int[] test3_from = {1, 2, 4, 5, 3, 3, 1, 0};
		int[] test3_to = {0, 1, 2, 4, 2, 5, 3, 1};
		int[] test4_cap = {700000, 800000, 900000, 1000000};
		int[] test4_bot = {478478, 478478, 478478, 478478};
		int[] test4_from = {2, 3, 2, 0, 1};
		int[] test4_to = {0, 1, 1, 3, 2};

		System.out.println(Arrays.toString(thePouring(test1_cap,test1_bot,test1_from,test1_to)));
		System.out.println(Arrays.toString(thePouring(test2_cap,test2_bot,test2_from,test2_to)));
		System.out.println(Arrays.toString(thePouring(test3_cap,test3_bot,test3_from,test3_to)));
		System.out.println(Arrays.toString(thePouring(test4_cap,test4_bot,test4_from,test4_to)));
	}

	public static int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {

		System.out.println(Arrays.toString(capacities));
		System.out.println(Arrays.toString(bottles));
		System.out.println(Arrays.toString(fromId));
		System.out.println(Arrays.toString(toId));

		for(int i = 0;i < fromId.length;i++) {
			int from = fromId[i];
			int to = toId[i];

			if(capacities[to] - bottles[to] > bottles[from]) {
				bottles[to] += bottles[from];
				bottles[from] = 0;
			}
			else {
				int diff = capacities[to] - bottles[to];
				bottles[to] += diff;
				bottles[from] -= diff;
			}
		}

		return bottles;
	}
}