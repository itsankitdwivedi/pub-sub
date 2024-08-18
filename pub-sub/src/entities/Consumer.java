package entities;

import java.util.ArrayList;

public class Consumer {
    String consumerId, consumerName;
    ArrayList<Topic> subscriptions;

    public Consumer(String consumerId, String consumerName)
    {
        this.consumerId = consumerId;
        this.consumerName = consumerName;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(Topic topic)
    {
        subscriptions.add(topic);
        for( String message : topic.messageQueue)
        {
            consume(message);
        }
    }

    void unsubscribe(Topic topic)
    {
        subscriptions.remove(topic);
    }

    String consume(String message)
    {
        System.out.println("Message consumed: \t" + message);

        return message;
    }

    void notifyConsumer( Topic t)
    {
        while(t.messageQueue.size() > 0)
        {
            consume(t.messageQueue.poll());
        }
    }
}
