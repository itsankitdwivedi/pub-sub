package entities;

import java.util.List;

public class Publisher {
    String publisherName;
    String publisherId;

    public Publisher(String publisherName, String publisherId)
    {
        this.publisherId = publisherId;
        this.publisherName=publisherName;
    }

    public void pushMessage(Topic topic, String message, List<Consumer> consumers)
    {
        System.out.println("Pushing message");
        topic.messageQueue.add(message);
        
        topic.notify(topic, consumers);
        
    }
}
