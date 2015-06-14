package callcenter;

import java.util.List;
import java.util.ArrayList;

public class CallHandler{
	private static CallHandler instance;
	List<List<Employee>> handlers;
	List<List<Call>> calls;

	public CallHandler() {
		handlers = new ArrayList<ArrayList<Employee>>();
		calls = new ArrayList<ArrayList<Call>>();
	}

	public static CallHandler getInstance(){
		if (instance == null) {
			instance = new CallHandler();
		}
		return instance;
	}

	public Employee getEmployee() {}

	public void dispatchCall(Call c) {
		Employee e = getEmployee();
		if (e != null) {
			c.setHandler(e);	
			e.startCall(c);
		} else {
			calls.get(c.getRank()).add(c);
		}
	}
}
