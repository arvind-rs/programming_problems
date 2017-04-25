import java.util.*;


public class WhichDay {

	public static void main(String[] args) {

		String[] test1 = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		String[] test2 = {"Sunday", "Monday", "Tuesday", "Thursday", "Friday", "Saturday"};
		String[] test3 = {"Sunday", "Friday", "Tuesday", "Wednesday", "Monday", "Saturday"};

		System.out.println(getDay(test1));
		System.out.println(getDay(test2));
		System.out.println(getDay(test3));
	}

	public static String getDay(String[] notThisDay) {

		System.out.println(Arrays.toString(notThisDay));

		HashSet<String> base_set = new HashSet<String>();
		base_set.add("Sunday");
		base_set.add("Monday");
		base_set.add("Tuesday");
		base_set.add("Wednesday");
		base_set.add("Thursday");
		base_set.add("Friday");
		base_set.add("Saturday");

		//System.out.println(base_set);

		HashSet<String> new_set = new HashSet<String>();
		for(int i=0;i<notThisDay.length;i++) {
			new_set.add(notThisDay[i]);
		}

		//System.out.println(new_set);

		base_set.removeAll(new_set);

		return base_set.toString();
	}
}