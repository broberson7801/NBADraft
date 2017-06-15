package draft;

public class PingPongBall {
	private String ballLabel;

	public PingPongBall(String ballLabel) {
		super();
		this.ballLabel = ballLabel;
	}

	@Override
	public String toString() {
		return ballLabel ;
	}

	public PingPongBall() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ballLabel == null) ? 0 : ballLabel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PingPongBall other = (PingPongBall) obj;
		if (ballLabel == null) {
			if (other.ballLabel != null)
				return false;
		} else if (!ballLabel.equals(other.ballLabel))
			return false;
		return true;
	}

	public String getBallLabel() {
		return ballLabel;
	}

	public void setBallLabel(String ballLabel) {
		this.ballLabel = ballLabel;
	}
}
