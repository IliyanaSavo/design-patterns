package observer;

public class ObserverMain {

	public static void main(String[] args) {
		Topic topic = new Topic();
		
		Observer observer1 = new TopicSubscriber("Topic subscriber 01");
		Observer observer2 = new TopicSubscriber("Topic subscriber 02");
		Observer observer3 = new TopicSubscriber("Topic subscriber 03");

		topic.subscribe(observer1);
		topic.subscribe(observer2);
		topic.subscribe(observer3);
		
		topic.setTopic("News: Ethereum hit the top");
		topic.setTopic("News: Free steak for vacination sertificate");
	}

}
