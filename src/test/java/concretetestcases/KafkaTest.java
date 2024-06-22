package concretetestcases;

import interfaces.TestCase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testobjects.KafkaConsumer;

public class KafkaTest extends BaseTest implements TestCase {

    KafkaConsumer kafkaConsumer;

    @Override
    @Test
    public void execute() {
        kafkaConsumer = new KafkaConsumer(getConnection());
        System.out.println("Execute Kafka Test");
        kafkaConsumer.consumeMessages();
    }

}
