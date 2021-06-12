package mediator;

public class MediatorMain {

	public static void main(String[] args) {
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Iliyana");
		User user2 = new ChatUser(chat, "Tanya");
		User user3 = new ChatUser(chat, "Valeriya");
		
		user1.send("cat");
		user2.send("addBot");
		user1.send("cat");
		user3.send("cat");

	}

}
