import java.util.*;

public class ShorterSuperSum {

	static HashMap<String,Integer> hm = new HashMap<String,Integer>();

	public static void main(String[] args) {

		int test1_k = 1;
		int test1_n = 3;

		int test2_k = 2;
		int test2_n = 3;

		int test3_k = 4;
		int test3_n = 10;

		int test4_k = 10;
		int test4_n = 10;

		System.out.println(calculate(test1_k,test1_n));
		System.out.println(calculate(test2_k,test2_n));
		System.out.println(calculate(test3_k,test3_n));
		System.out.println(calculate(test4_k,test4_n));
	}

	public static int calculate(int k,int n) {

		if(k == 0) 
			return n;
		if(hm.get(""+k+n) != null)
			return hm.get(""+k+n).intValue();

		int result = 0;
		for(int i=1;i<=n;i++)
			result += calculate(k - 1,i);

		hm.put(""+k+n,Integer.valueOf(result));
		return result;
	}
}