package chatserver;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class User {
	Status status;
	String id;
	String userName;
	String password;
	List<User> friends;
	List<User> blackList;
	HashMap<User, List<Message>> messages;

	public User(String id, String name, String pwd) {
		this.id = id;
		userName = name;
		password = pwd;
		friends = new ArrayList<User>();
		blackList = new ArrayList<User>();
		msg = new HashMap<User, List<Message>>();
	}
	
	public void logIn(){
		status = Status.Online;
	}

	public void logOut(){
		status = Status.Offline;
	}

	public void addToBlackList(User user) {
		blackList.add(user);
		if(friends.contains(user)){
			deleteFriend(user.getName());
		}
	}

	public boolean sendMsg(Message msg, User user){
		if(user.status == Status.Online) {
			System.out.println(msg.getMsg());
			return true;
		}else{
			if(messages.contains(user)) {
				messages.get(user).add(msg);
			} else {
				messages.put(user, new ArrayList<Message>(msg));
			}
			return false;
		}
	}

	public boolean findFriend(String name){
		for (int i = 0 ; i < friends.size() ; i ++ ) {
			if (friends.get(i).getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public void deleteFriend(String name) {
		for (int i = 0 ; i < friends.size() ; i ++ ) {
			if (friends.get(i).getName().equals(name)){
				friends.delete(i);
			}
		}
	}

	public String getId(){
		return id;
	}

	public void setName(String name){
		userName = name;
	}

	public String getName() {
		return userName;
	}

	public void setPassword(String pwd) {
		password = pwd;
	}

	public Status getStatus(){
		return status;
	}
}
