import java.util.*;

public class WorkingRabbitsWithoutExtraSpace {

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

	public static double getEfficiency(String[] profits) {

		System.out.println(Arrays.toString(profits));

		int totalProfit = 0;
		int number = 0;

		for(int i=0;i<profits.length;i++) {
			for(int j=i;j<profits[i].length();j++) {
				if(i != j) {
					//System.out.println(i+","+j);
					totalProfit += Integer.parseInt(profits[i].charAt(j)+"");
					number++;
				}
			}
		}

		double efficiency = (double)totalProfit / number;

		return efficiency;
	}
}