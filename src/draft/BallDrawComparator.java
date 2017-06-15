package draft;

import java.util.Comparator;
import java.util.Map;

public class BallDrawComparator implements Comparator<String> {
	private Map<String, Integer> compMap;

	public BallDrawComparator(Map<String, Integer> inMap) {
		compMap = inMap;
	}

	public int compare(String keyOne, String keyTwo) {
		Integer value1 = compMap.get(keyOne);
		Integer value2 = compMap.get(keyTwo);
		
		int output = value2.compareTo(value1);
		if(output != 0) {
			return output;
		} else {
			return keyTwo.compareTo(keyOne);
		}
	}

}
