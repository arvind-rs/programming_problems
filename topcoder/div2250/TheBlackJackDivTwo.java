import java.util.*;

public class TheBlackJackDivTwo {

	public static void main(String[] args) {

		String[] test1 = {"4S", "7D"};
		String[] test2 = {"KS", "TS", "QC"};
		String[] test3 = {"AS", "AD", "AH", "AC"};
		String[] test4 = {"3S", "KC", "AS", "7C", "TC", "9C", "4H", "4S", "2S"};

		System.out.println(score(test1));
		System.out.println(score(test2));
		System.out.println(score(test3));
		System.out.println(score(test4));
	}

	public static int score(String[] cards) {

		System.out.println(Arrays.toString(cards));

		HashMap<String,Integer> hm = new HashMap<String,Integer>();

		hm.put("A",Integer.valueOf(11));
		hm.put("2",Integer.valueOf(2));
		hm.put("3",Integer.valueOf(3));
		hm.put("4",Integer.valueOf(4));
		hm.put("5",Integer.valueOf(5));
		hm.put("6",Integer.valueOf(6));
		hm.put("7",Integer.valueOf(7));
		hm.put("8",Integer.valueOf(8));
		hm.put("9",Integer.valueOf(9));
		hm.put("T",Integer.valueOf(10));
		hm.put("J",Integer.valueOf(10));
		hm.put("Q",Integer.valueOf(10));
		hm.put("K",Integer.valueOf(10));

		int sum = 0;
		for(int i = 0;i < cards.length;i++) {
			sum += (hm.get(cards[i].charAt(0) + "")).intValue();
		}

		return sum;
	}
}