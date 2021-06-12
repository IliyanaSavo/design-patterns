package observer;

public class TopicSubscriber implements Observer {
	
	private String name;
	private Observable subscribedTo;

	public TopicSubscriber(String name) {
		this.name=name;
	}

	@Override
	public void update() {
		
		if(this.subscribedTo == null) {
			System.out.println(this.getName() 
					+ " has no topic set");
			return;
		}
		
		String newTopic = this.subscribedTo.getUpdate();
		System.out.println(this.getName() + " received an update: " + newTopic);
		
	}

	@Override
	public void setTopic(Observable topic) {
		this.subscribedTo = topic;

	}

	public String getName() {
		return name;
	}

	

}
