import java.util.*;

public class DitherCounter {

	public static void main(String[] args) {

		String test1_dither = "BW"; 
		String[] test1_screen = {"AAAAAAAA",
 								"ABWBWBWA",
 								"AWBWBWBA",
 								"ABWBWBWA",
 								"AWBWBWBA",
 								"AAAAAAAA"};

 		String test2_dither = "ACEGIKMOQSUWY"; 
		String[] test2_screen = {"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX"};

 		String test3_dither = "CA"; 
		String[] test3_screen = {"BBBBBBB",
 "BBBBBBB",
 "BBBBBBB"};

 		String test4_dither = "DCBA"; 
		String[] test4_screen = {"ACBD"};


 		System.out.println(count(test1_dither,test1_screen));
 		System.out.println(count(test2_dither,test2_screen));
 		System.out.println(count(test3_dither,test3_screen));
 		System.out.println(count(test4_dither,test4_screen));
	}

	public static int count(String dither, String[] screen) {

		System.out.println(dither);
		System.out.println(Arrays.toString(screen));

		HashSet<String> hs = new HashSet<String>();

		for(int i=0;i<dither.length();i++)
			hs.add(dither.charAt(i) + "");

		int count = 0;

		for(int i=0;i<screen.length;i++) {
			for(int j=0;j<screen[i].length();j++) {
				if(hs.contains(screen[i].charAt(j) + ""))
					count++;
			}
		}

		return count;
	}
}