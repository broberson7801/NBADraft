package draft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NBADraft {
	private static Map<String, Integer> draftMap = new HashMap<>();

	public static void main(String[] args) {
		// draftSetUp();
		// runDraft();
		System.out.println(runSimulation(100));

	}

	public static List<PingPongBall> runDraft() {
		Factory factory = new Factory();
		Hopper hopper = new Hopper();

		List<PingPongBall> winner = hopper.mixBall(factory.createBalls(draftMap), 1);
		// System.out.println(winner);
		return winner;
	}

	public static void draftSetUp() {
		draftMap.put("Seed1", 250);
		draftMap.put("Seed2", 199);
		draftMap.put("Seed3", 156);
		draftMap.put("Seed4", 119);
		draftMap.put("Seed5", 88);
		draftMap.put("Seed6", 63);
		draftMap.put("Seed7", 43);
		draftMap.put("Seed8", 28);
		draftMap.put("Seed9", 17);
		draftMap.put("Seed10", 11);
		draftMap.put("Seed11", 8);
		draftMap.put("Seed12", 7);
		draftMap.put("Seed13", 6);
		draftMap.put("Seed14", 5);

	}

	public static String runSimulation(int numTimes) {
		Map<String,Integer> simMap = new TreeMap<>();
		int counter = 0;
		for(int i = 0; i < numTimes; i ++) {
			draftSetUp();
			String winner = runDraft().get(0).getBallLabel();
			if(simMap.containsKey(winner)) {
				counter = simMap.get(winner);
				simMap.put(winner, counter+1);
			} else {
				simMap.put(winner, 1);
			}
		} 
		List<String> winnerList = new ArrayList<>(simMap.keySet());
		Comparator<String> compare = new BallDrawComparator(simMap);
		Collections.sort(winnerList, compare);
		String output = "";
		for (String winners : winnerList) {
			output = output + (winners + ": " + simMap.get(winners) + "\n");
		}
		
		
		return output;
	}

}
