import java.util.*;

public class ScoringEfficiency {

	public static void main(String[] args) {

		String[] test1 = {"Made 3 point field goal",
 						"Missed 2 point field goal"};

 		String[] test2 = {"Made free throw",
 "Missed free throw",
 "Missed free throw",
 "Missed free throw",
 "Made free throw"};

 		String[] test3 = {"Made 2 point field goal", "Made 2 point field goal", "Made 2 point field goal", 
 "Made 2 point field goal", "Missed 2 point field goal",
 "Made 3 point field goal", "Made 3 point field goal", "Made 3 point field goal",
 "Missed 3 point field goal", "Missed 3 point field goal", 
 "Missed 3 point field goal", "Missed 3 point field goal",
 "Made free throw", "Made free throw", "Made free throw", 
 "Made free throw", "Made free throw", "Made free throw", 
 "Made free throw", "Missed free throw", "Missed free throw"};

 		String[] test4 = {"Made 2 point field goal", "Missed free throw",
 "Made free throw", "Missed free throw", "Made free throw", 
 "Made 2 point field goal", "Made 2 point field goal",
 "Missed 2 point field goal", "Missed 2 point field goal",
 "Made 3 point field goal", "Missed 2 point field goal",
 "Made 2 point field goal", "Missed 2 point field goal",
 "Made 3 point field goal", "Missed 2 point field goal",
 "Missed 2 point field goal", "Missed 3 point field goal",
 "Made free throw", "Made free throw", 
 "Missed 3 point field goal", "Missed 2 point field goal",
 "Missed 2 point field goal", "Made 2 point field goal",
 "Missed 2 point field goal", "Made 2 point field goal",
 "Missed 3 point field goal"};

 		System.out.println(getPointsPerShot(test1));
 		System.out.println(getPointsPerShot(test2));
 		System.out.println(getPointsPerShot(test3));
 		System.out.println(getPointsPerShot(test4));
	}

	public static double getPointsPerShot(String[] gameLog) {

		System.out.println(Arrays.toString(gameLog));

		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Made 2 point field goal",Integer.valueOf(2));
		hm.put("Missed 2 point field goal",Integer.valueOf(0));
		hm.put("Made 3 point field goal",Integer.valueOf(3));
		hm.put("Missed 3 point field goal",Integer.valueOf(0));
		hm.put("Made free throw",Integer.valueOf(1));
		hm.put("Missed free throw",Integer.valueOf(0));

		int totalPoints = 0;
		int fieldAttempts = 0;
		int freeAttempts = 0;

		for(int i=0;i<gameLog.length;i++) {
			int point = hm.get(gameLog[i]).intValue();
			if(gameLog[i].contains("free"))
				freeAttempts++;
			else
				fieldAttempts++;
			totalPoints += point;
		}

		return ((double)totalPoints) / (fieldAttempts + (0.5 * freeAttempts));
	}
}