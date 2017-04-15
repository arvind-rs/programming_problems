import java.util.*;

public class BlackAndRed {

	public static void main(String[] args) {

		String test_0 = "RBRBRB";
		String test_1 = "BRBRBR";
		String test_2 = "BBBRRRRB";
		String test_3 = "BR";
		String test_4 = "RBRBBRRRRBBBRBBRRBRBBRRRBRBBBRBRBRBRBRRB";

		/*System.out.println(cut(test_0));
		System.out.println(cut(test_1));
		System.out.println(cut(test_2));
		System.out.println(cut(test_3));*/
		System.out.println(cut(test_4));
	}

	public static int cut(String deck) {

		System.out.println(deck);

		int b_counter = 0;
		int r_counter = 0;
		int break_point = 0;

		for(int i=0;i<deck.length();i++) {

			if(r_counter > b_counter) {
				if(deck.charAt(i) == 'B')
					break_point = i;
					break;
			}
			if(deck.charAt(i) == 'B')
				b_counter++;
			else if(deck.charAt(i) == 'R')
				r_counter++;

		}

		return break_point;
	}
}