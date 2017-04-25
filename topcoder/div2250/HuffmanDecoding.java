import java.util.*;

public class HuffmanDecoding {

	public static void main(String[] args) {

		String archive_0 = "101101";
		String[] dictionary_0 = {"00","10","01","11"}; 

		String archive_1 = "10111010";
		String[] dictionary_1 = {"0","111","10"};

		String archive_2 = "0001001100100111001";
		String[] dictionary_2 = {"1","0"};

		String archive_3 = "111011011000100110";
		String[] dictionary_3 = {"010","00","0110","0111","11","100","101"};

		String archive_4 = "001101100101100110111101011001011001010";
		String[] dictionary_4 = {"110","011","10","0011","00011","111","00010","0010","010","0000"};

		String archive_5 = "00000000000000000000000000000000000000000000000000";
		String[] dictionary_5 = {"0", "11111111111111111111111111111111111111111111111111"};

		System.out.println(decode(archive_0,dictionary_0));
		System.out.println(decode(archive_1,dictionary_1));
		System.out.println(decode(archive_2,dictionary_2));
		System.out.println(decode(archive_3,dictionary_3));
		System.out.println(decode(archive_4,dictionary_4));
		System.out.println(decode(archive_5,dictionary_5));
	}

	public static String decode(String archive, String[] dictionary) {

		System.out.println(archive);
		System.out.println(Arrays.toString(dictionary));

		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String output = "";
		String comparator_string = "";
		for(int i=0;i<archive.length();i++) {
			comparator_string += archive.charAt(i);
			for(int j=0;j<dictionary.length;j++) {
				if(comparator_string.equals(dictionary[j])) {
					output += alphabets.charAt(j);
					comparator_string = "";
				}
			}
		}

		return output;
	}
}