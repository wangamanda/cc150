package problem2;

import java.util.ArrayList;
import java.util.HashMap;

public class Server {
	HashMap<Integer, Machine> machines;

	public Server(){
		machines = new HashMap<Integer, Machine>();
	}

	public Machine getMachineById(int n) {
		return machines.get(n);
	}

	public Person getPersonByIds(int n, int i) {
		Machine machine = getMachineById(n);
		if (machine == null) {
			return null;
		}
		return machine.getPersonById(i);
	}

	public static void main(String[] args){}
}
