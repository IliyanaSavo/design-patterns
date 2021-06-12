package mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	private boolean addBotExist = false;
	
	public Chat() {
		this.users = new ArrayList<>();
	}



	@Override
	public void sendMessage(String message, User user) {
		if(message == "addBot") {
			Singleton connection = Singleton.getInstance();
			connection.postMessage("Special word 'addBot' is written");
			addBotExist = true;
		}
		
		for(User chatUser: this.users) {
			if(chatUser!=user) {
				chatUser.receive(message);
			}
		}
		
		
	  
		if(addBotExist == true && message == "cat") {
			users.remove(user);
			
			System.out.println("'Cat' is prohibidado word");
			System.out.println("User list: ");
			
			for(User userN: this.users) {
				System.out.println(userN.name);
			}
		}

	}
	@Override
	public void addUser(User user) {
		this.users.add(user);

	}

}
