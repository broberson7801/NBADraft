package draft;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Factory {

	public List<PingPongBall> createBalls(Map<String, Integer> ballsMap) {
		List<PingPongBall> ballsList = new ArrayList<>();
		Set<String> ballSet = ballsMap.keySet();

		for (String label : ballSet) {

			for (int j = 0; j < ballsMap.get(label); j++) {
				PingPongBall ball = new PingPongBall(label);
				ballsList.add(ball);
			}

		}

		return ballsList;
	}

	public Factory() {
		super();
		// TODO Auto-generated constructor stub
	}
}