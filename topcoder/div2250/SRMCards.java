import java.util.*;

public class SRMCards {

	public static void main(String[] args) {

		int[] test1 = {491, 492, 495, 497, 498, 499};

		System.out.println(maxTurns(test1));
	}

	public static int maxTurns(int[] cards) {

		System.out.println(Arrays.toString(cards));

		Arrays.sort(cards);

		int turns = 0; int i;
		for(i=0;i<cards.length - 1;i++) {
			
			if(cards[i] + 1 == cards[i+1])
				cards[i+1] = -1;
			if(cards[i] != -1) {
				cards[i] = -1;
				turns += 1;
			}
			
		}
		if(cards[i] != -1) {
			cards[i] = -1;
			turns += 1;
		}

		return turns;
	}
}