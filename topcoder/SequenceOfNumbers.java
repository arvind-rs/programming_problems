import java.util.*;

public class SequenceOfNumbers {

	public static void main(String[] args) {

		String[] test1 = {"1","174","23","578","71","9"};
		String[] test2 = {"172","172","172","23","23"};
		String[] test3 = {"183","2","357","38","446","46","628","734","741","838"};

		System.out.println(Arrays.toString(rearrange(test1)));
		System.out.println(Arrays.toString(rearrange(test2)));
		System.out.println(Arrays.toString(rearrange(test3)));
	} 

	public static String[] rearrange(String[] sequence) {

		System.out.println(Arrays.toString(sequence));

		int[] temp = new int[sequence.length];

		for(int i = 0; i < sequence.length; i++)
			temp[i] = Integer.parseInt(sequence[i]);

		Arrays.sort(temp);

		for(int i = 0; i < temp.length; i++)
			sequence[i] = temp[i] + "";

		return sequence;
	}
}