package callcenter;

public class Employee {
	Rank rank;
	Call currentCall;

	public void receiveCall (Call c) {
		currentCall = c;
	}

	public void endCall() {
		if (currentCall != null) {
			currentCall = null;
		}
	}

	public void escalateCall() {
		if (currentCall != null) {
			currentCall.escalate();
		}
	}

	public int getRank(){
		return rank.getValue();
	}
}
