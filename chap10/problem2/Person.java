package problem2;

import java.util.ArrayList;

public class Person{
	int id;
	ArrayList<Person> friends;

	public Person(int n){
		id = n;
		friends = new ArrayList<Person>();
	}

	public int getId(){
		return id;
	}

	public void addFriend(Person person) {
		friends.add(person);
	}
}
