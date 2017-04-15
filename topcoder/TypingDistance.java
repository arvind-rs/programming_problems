import java.util.*;

public class TypingDistance {

	public static void main(String[] args) {

		String test1_keyboard = "qwertyuiop";
		String test1_word = "potter";

		String test2_keyboard = "tc";
		String test2_word = "tctcttccctccccttc";

		String test3_keyboard = "a";
		String test3_word = "aaaaaaaaaaa";

		String test4_keyboard = "kwadrutove";
		String test4_word = "rowerowe";

		String test5_keyboard = "qwertyuiopasdfghjklzxcvbnm";
		String test5_word = "topcodersingleroundmatchgoodluckhavefun";

		System.out.println(minDistance(test1_keyboard,test1_word));
		System.out.println(minDistance(test2_keyboard,test2_word));
		System.out.println(minDistance(test3_keyboard,test3_word));
		System.out.println(minDistance(test4_keyboard,test4_word));
		System.out.println(minDistance(test5_keyboard,test5_word));
	}

	public static int minDistance(String keyboard, String word) {

		System.out.println(keyboard);
		System.out.println(word);

		HashMap map = new HashMap();

		for(int i = 0; i < keyboard.length(); i++)
			map.put(keyboard.charAt(i) + "",i);

		int sum = 0, previous = ((Integer)map.get(word.charAt(0) + "")).intValue();
		for(int i = 1; i < word.length(); i++) {
			sum += Math.abs(((Integer)map.get(word.charAt(i) + "")).intValue() - previous);
			previous = ((Integer)map.get(word.charAt(i) + "")).intValue();
		}

		return sum;
	}
}