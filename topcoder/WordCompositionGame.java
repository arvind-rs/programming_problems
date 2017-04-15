import java.util.*;

public class WordCompositionGame {

	public static void main(String[] args) {

		String[] a_0 = {"cat", "dog", "pig", "mouse"};
		String[] b_0 = {"cat", "pig"};
		String[] c_0 = {"dog", "cat"};

		String[] a_1 = {"bcdbb","aaccd","dacbc","bcbda","cdedc","bbaaa","aecae"};
		String[] b_1 = {"bcdbb","ddacb","aaccd","adcab","edbee","aecae","bcbda"};
		String[] c_1 = {"dcaab","aadbe","bbaaa","ebeec","eaecb","bcbba","aecae","adcab","bcbda"};

		System.out.println(score(a_0,b_0,c_0));
		System.out.println(score(a_1,b_1,c_1));
	}

	public static String score(String[] lista,String[] listb,String[] listc) {

		System.out.println(Arrays.toString(lista));
		System.out.println(Arrays.toString(listb));
		System.out.println(Arrays.toString(listc));

		//Checking for lista
		int score_a = 0;
		for(int i=0;i<lista.length;i++) {
			int temp_a = 3;

			for(int j=0;j<listb.length;j++) {
				if(lista[i].equals(listb[j]))
					temp_a--;
			}

			for(int k=0;k<listc.length;k++) {
				if(lista[i].equals(listc[k]))
					temp_a--;
			}

			score_a += temp_a;
		}

		//Checking for listb
		int score_b = 0;
		for(int i=0;i<listb.length;i++) {
			int temp_b = 3;

			for(int j=0;j<lista.length;j++) {
				if(listb[i].equals(lista[j]))
					temp_b--;
			}

			for(int k=0;k<listc.length;k++) {
				if(listb[i].equals(listc[k]))
					temp_b--;
			}

			score_b += temp_b;
		}

		//Checking for listc
		int score_c = 0;
		for(int i=0;i<listc.length;i++) {
			int temp_c = 3;

			for(int j=0;j<listb.length;j++) {
				if(listc[i].equals(listb[j]))
					temp_c--;
			}

			for(int k=0;k<lista.length;k++) {
				if(listc[i].equals(lista[k]))
					temp_c--;
			}

			score_c += temp_c;
		}

		return (score_a + "/" + score_b + "/" + score_c);

	}
}