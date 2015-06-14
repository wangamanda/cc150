package callcenter;

public class Call {
	Caller caller;
	Employee employee;
	int rank;

	public void start(Caller c, Employee e){
		caller = c;
		employee = e;
		rank = e.level;
	}

	public void end() {
		employee = null;
	}

	public void escalate() {
		end();
		rank += 1;
	}

	public void setHandler(Employee e){
		employee = e;
	}

	public void reAssign(Employee e) {
		employee = e;
		rank = e.getRank();
	}
}
