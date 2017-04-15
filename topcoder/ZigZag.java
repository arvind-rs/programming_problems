import java.util.*;

public class ZigZag {

	public static void main(String[] args) {

		int[] test1 = { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };

		System.out.println(longestZigZag(test1));
	}

	public static int longestZigZag(int[] sequence) {

		System.out.println(Arrays.toString(sequence));

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		String next = "";

		if(sequence.length == 1)
			return 1;

		for(int i=0;i<sequence.length-1;i++) {
			int difference = sequence[i+1] - sequence[i];
			if(i == 0) {
				if(difference > 0) {
					arrayList.add(sequence[i+1]);
					next = "negative";
				}
				else if(difference < 0) {
					arrayList.add(sequence[i+1]);
					next = "positive";
				}
			}

			if(next.equals("positive") && difference > 0) {
				arrayList.add(sequence[i+1]);
				next = "negative";
			}
			else if(next.equals("negative") && difference < 0) {
				arrayList.add(sequence[i+1]);
				next = "positive";
			}
		}

		System.out.println(arrayList);

		return arrayList.size();
	}
}