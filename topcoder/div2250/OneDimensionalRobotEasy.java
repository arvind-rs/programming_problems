import java.util.*;

public class OneDimensionalRobotEasy {

	public static void main(String[] args) {

		String test1_com = "RRLRRLLR";
		int test1_A = 10;
		int test1_B = 10;

		String test2_com = "RRRRR";
		int test2_A = 3;
		int test2_B = 4;

		String test3_com = "LLLLLLLLLLR";
		int test3_A = 2;
		int test3_B = 6;

		String test4_com = "RRRRRRRLRRLRRRRRRRRRRRRLRLRRRRRRRRLRRRRRLRRRRRRRRR";
		int test4_A = 5;
		int test4_B = 20;

		String test5_com = "RLRLLLLLLLRLLLRLLLLLLLLRLLLLLRLLLRRLLLLLRLLLLLRLLL";
		int test5_A = 34;
		int test5_B = 15	;

		System.out.println(finalPosition(test1_com,test1_A,test1_B));
		System.out.println(finalPosition(test2_com,test2_A,test2_B));
		System.out.println(finalPosition(test3_com,test3_A,test3_B));
		System.out.println(finalPosition(test4_com,test4_A,test4_B));
		System.out.println(finalPosition(test5_com,test5_A,test5_B));
	}

	public static int finalPosition(String commands, int A, int B) {

		System.out.println(commands);
		System.out.println(A);
		System.out.println(B);

		int position = 0;
		for(int i=0;i<commands.length();i++) {
			if(commands.charAt(i) == 'L' && position > (A * -1))
				position -= 1;
			else if(commands.charAt(i) == 'R' && position < B)
				position += 1;
		}

		return position;
	}
}