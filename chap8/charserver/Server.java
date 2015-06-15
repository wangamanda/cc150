package chatserver;

import java.util.List;
import java.util.ArrayList;

public class Server {
	List<User> onlineUser;
	List<User> offlineUser;

	public Server(){
		onlineUser = new ArrayList<User>();
		offlineUser = new ArrayList<User>();
	}
}
