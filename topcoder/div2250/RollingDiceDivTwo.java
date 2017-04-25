import java.util.*;

public class RollingDiceDivTwo {

	public static void main(String[] args) {

		String[] test1 = {"137", "364", "115", "724"};
		String[] test2 = {"1112", "1111", "1211", "1111"};
		String[] test3 = {"24412", "56316", "66666", "45625"};
		String[] test4 = {"931", "821", "156", "512", "129", "358", "555"};
		String[] test5 = {"3", "7", "4", "2", "4"};
		String[] test6 = {"281868247265686571829977999522", "611464285871136563343229916655", "716739845311113736768779647392", "779122814312329463718383927626",
"571573431548647653632439431183", "547362375338962625957869719518", "539263489892486347713288936885", "417131347396232733384379841536"};
		String[] test7 = {"0"};
		String[] test8 = {};

		System.out.println(minimumFaces(test1));
		System.out.println(minimumFaces(test2));
		System.out.println(minimumFaces(test3));
		System.out.println(minimumFaces(test4));
		System.out.println(minimumFaces(test5));
		System.out.println(minimumFaces(test6));
		System.out.println(minimumFaces(test7));
		System.out.println(minimumFaces(test8));
	}

	public static int minimumFaces(String[] rolls) {

		System.out.println(Arrays.toString(rolls));

		if(rolls.length<=0)
			return 0;

		int[] output = new int[rolls[0].length()];

		for(int j=0;j<output.length;j++)
			output[j] = 0;

		for(int i=0;i<rolls.length;i++) {

			int[] temp = new int[rolls[i].length()];

			for(int j=0;j<rolls[i].length();j++) {
				temp[j] = Integer.parseInt(rolls[i].charAt(j)+"");
			}

			Arrays.sort(temp);

			for(int j=0;j<temp.length;j++) {
				if(temp[j] > output[j]) {
					output[j] = temp[j];
				}
			}
		}

		int sum = 0;
		for(int j=0;j<output.length;j++) {
			sum += output[j];
		}

		return sum;
	}
}