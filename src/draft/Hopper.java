package draft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hopper {

	public Hopper() {
		super();
	}

	public List<PingPongBall> mixBall(List<PingPongBall> ballsList, int numBall) {
		
		List<PingPongBall> balls = new ArrayList<>();
		
		Collections.shuffle(ballsList);
		Collections.shuffle(ballsList);
		Collections.shuffle(ballsList);
		
		for(int i = 0; i < numBall; i++) {
			balls.add(ballsList.get(i));
		}

		return balls;

	}

}
