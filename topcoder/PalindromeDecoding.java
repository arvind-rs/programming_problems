import java.util.*;

public class PalindromeDecoding {

	public static void main(String[] args) {

		String code_0 = "ab";
		int[] position_0 = {0};
		int[] length_0 = {2};

		String code_1 = "Misip";
		int[] position_1 = {2,3,1,7};
		int[] length_1 = {1,1,2,2};

		String code_2 = "XY";
		int[] position_2 = {0, 0, 0, 0};
		int[] length_2 = {2, 4, 8, 16};

		String code_3 = "TC206";
		int[] position_3 = {1,2,5};
		int[] length_3 = {1,1,1};

		String code_4 = "nodecoding";
		int[] position_4 = {};
		int[] length_4 = {};

		System.out.println(decode(code_0,position_0,length_0));
		System.out.println(decode(code_1,position_1,length_1));
		System.out.println(decode(code_2,position_2,length_2));
		System.out.println(decode(code_3,position_3,length_3));
		System.out.println(decode(code_4,position_4,length_4));
	}

	public static String decode(String code, int[] position,int[] length) {

		System.out.println(code);
		System.out.println(Arrays.toString(position));
		System.out.println(Arrays.toString(length));

		for(int i=0;i<position.length;i++) {

			int start = position[i];
			int end = length[i];
			int insertion_point = start + end;

			//System.out.println(code);
			String temp = code.substring(start,start+end);
			temp = new StringBuffer(temp).reverse().toString();
			code = code.substring(0,insertion_point) + temp + code.substring(insertion_point);
		}

		return code;
	}
} 