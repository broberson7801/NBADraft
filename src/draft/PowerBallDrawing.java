package draft;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PowerBallDrawing {
	private static Map<String, Integer> pBMap = new HashMap<>();
	private static Map<String, Integer> nBMap = new HashMap<>();

	public static void main(String[] args) {
		System.out.println(runSimulation(20));

	}

	public static List<PingPongBall> runLottery() {
		Factory factory = new Factory();
		Hopper hopper = new Hopper();
		Hopper pBHopper = new Hopper();

		List<PingPongBall> balls = hopper.mixBall(factory.createBalls(nBMap), 5);
		balls.add(0, (hopper.mixBall(factory.createBalls(pBMap), 1).get(0)));
		return balls;
	}

	public static void pBSetUp() {
		for (int i = 1; i <= 26; i++) {

			pBMap.put("Power ball: " + i, 1);
		}
		for (int i = 1; i <= 69; i++) {
			nBMap.put("ball: " + i, 1);
		}

	}

	public static String runSimulation(int numTimes) {
		pBSetUp();
		String output = "";
		for (int i = 0; i < numTimes; i++) {
			output = output + runLottery().toString() + "\n";

		}
		return output;
	}

}