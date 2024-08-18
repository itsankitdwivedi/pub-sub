import java.util.Arrays;

import entities.Consumer;
import entities.Publisher;
import entities.Topic;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Pub Sub!");

        Topic topic1 = new Topic("TopicA", "1");
        Consumer consumerA = new Consumer("123" ,  "Consumer A");
        Consumer consumerB = new Consumer("126" ,  "Consumer B");

        consumerA.subscribe(topic1);
        consumerB.subscribe(topic1);

        Publisher pub1 = new Publisher("Publisher Ankit", "12345");
        pub1.pushMessage(topic1, "Sent 12 records", Arrays.asList(consumerA, consumerB));

    }
}
