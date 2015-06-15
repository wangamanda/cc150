package chatserver;

public class Message{
	String message;
	String time;
	User sender;
	User receiver;

	public Message(String msg, String t) {
		message = msg;
		time = t;
	}

	public void setSender(User user){
		sender = user;
	}

	public void setReceiver(User user) {
		receiver = user;
	}

	public String getMsg(){
		return message;
	}
}
