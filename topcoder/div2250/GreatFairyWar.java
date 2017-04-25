import java.util.*;

public class GreatFairyWar {

	public static void main(String[] args) {

		int[] test1_a = {1,2};
		int[] test1_b = {3,4};

		int[] test2_a = {1,1,1,1,1,1,1,1,1,1};
		int[] test2_b = {1,1,1,1,1,1,1,1,1,1};

		int[] test3_a = {30,2,7,4,7,8,21,14,19,12};
		int[] test3_b = {2,27,18,19,14,8,25,13,21,30};

		int[] test4_a = {1};
		int[] test4_b = {1};

		System.out.println(minHp(test1_a,test1_b));
		System.out.println(minHp(test2_a,test2_b));
		System.out.println(minHp(test3_a,test3_b));
		System.out.println(minHp(test4_a,test4_b));

	}

	public static int minHp(int[] dps,int[] hps) {

		System.out.println(Arrays.toString(dps));
		System.out.println(Arrays.toString(hps));

		int damage_caused = 0;

		for(int i=0;i<hps.length;i++) {
			int damage_caused_per_fairy = 0;
			for(int j =i;j<dps.length;j++) {

				damage_caused_per_fairy += dps[j];
			}
			damage_caused += hps[i]*damage_caused_per_fairy;
		}

		return damage_caused;
	}
}