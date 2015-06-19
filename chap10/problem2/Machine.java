package problem2; 

import java.util.HashMap;

public class Machine{
	int id;
	HashMap<Integer, Person> map;

	public Machine(int n) {
		id = n;
		map = new HashMap<Integer, Person>();
	}

	public Person getPersonById(int i){
		return map.get(i);
	}
}
