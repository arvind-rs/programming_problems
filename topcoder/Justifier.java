import java.util.*;

public class Justifier {

	public static void main(String[] args) {

		String[] test1 = {"BOB","TOMMY","JIM"};
		String[] test2 = {"JOHN","JAKE","ALAN","BLUE"};
		String[] test3 = {"LONGEST","A","LONGER","SHORT"};

		System.out.println(Arrays.toString(justify(test1)));
		System.out.println(Arrays.toString(justify(test2)));
		System.out.println(Arrays.toString(justify(test3)));
	}

	public static String[] justify(String[] textIn) {

		System.out.println(Arrays.toString(textIn));

		int maxLength = 0;
		for(int i=0;i<textIn.length;i++) {
			if(textIn[i].length() > maxLength)
				maxLength = textIn[i].length();
		}

		String[] textOut = new String[textIn.length];

		for(int i=0;i<textIn.length;i++) {
			String current = textIn[i];
			int diff = maxLength - current.length();
			//System.out.println(maxLength);
			//System.out.println(current.length());
			for(int j=0;j<diff;j++) {
				current = " " + current;
			}
			textOut[i] = current;
		}

		return textOut;
	}
}