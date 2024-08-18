package entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Topic {
    String topicName;
    String topicId;
    Queue<String> messageQueue;

    public Topic(String topicName, String topicId)
    {
        this.topicName = topicName;
        this.topicId = topicId;
        this.messageQueue = new LinkedList<>();
    }

    public void notify(Topic t , List<Consumer> consumers)
    {
        for(Consumer c: consumers)
        {
            c.notifyConsumer(t);
        }
    }
}
