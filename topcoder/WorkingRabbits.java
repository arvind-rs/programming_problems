import java.util.*;


public class WorkingRabbits {

	public static void main(String[] args) {

		String[] test1 = { "071", 
  						"702", 
  						"120" };

  		String[] test2 = { "0999", "9099", "9909", "9990" };

  		String[] test3 = { "013040", "100010", "300060", "000008", "416000", "000800" };

  		String[] test4 = { "06390061", "60960062", "39090270", "96900262", "00000212", "00222026", "66761201", "12022610" };

  		String[] test5 = { "00", "00" };

  		String[] test6 = {};

  		System.out.println(getEfficiency(test1));
  		System.out.println(getEfficiency(test2));
  		System.out.println(getEfficiency(test3));
  		System.out.println(getEfficiency(test4));
  		System.out.println(getEfficiency(test5));
  		System.out.println(getEfficiency(test6));
	}

	public static double getEfficiency(String[] profit) {

		System.out.println(Arrays.toString(profit));

		float cumulative_profit = 0;
		float no_of_pairs = 0;
		HashSet<String> hs = new HashSet<String>();

		for(int i=0;i<profit.length;i++) {
			for(int j=0;j<profit[i].length();j++) {
				if(i!=j){
				if(!hs.contains((i+""+j))) {
					cumulative_profit += Integer.parseInt(profit[i].charAt(j)+"");
					no_of_pairs++;
					hs.add((j+""+i));
				}
			}
			}
		}
		System.out.println(hs);
		return cumulative_profit / no_of_pairs;
	}
}