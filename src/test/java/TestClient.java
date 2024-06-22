import concretetestcases.BaseTest;
import concretetestcases.ConcreteTestCase;
import concretetestcases.KafkaTest;
import decorators.LoggingDecorator;
import decorators.RetryDecorator;
import interfaces.TestCase;
import org.testng.annotations.Test;

public class TestClient extends BaseTest {


    public static void main(String[] args) {
        //code here
    }

    @Test
    public void testDecorators(){
        // Create a concrete test case
        TestCase testCase = new ConcreteTestCase();

        // Decorate the test case with logging and retry functionality
        testCase = new LoggingDecorator(testCase);
        testCase = new RetryDecorator(testCase, 3);

        // Execute the decorated test case
        testCase.execute();
    }

    @Test
    public void testKafka(){
        // Create a concrete test case
        TestCase testCase = new KafkaTest();

        // Decorate the test case with logging and retry functionality
        testCase = new LoggingDecorator(testCase);

        // Execute the decorated test case
        testCase.execute();
    }
}
