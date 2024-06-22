package concretetestcases;

import interfaces.TestCase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import testobjects.KafkaConsumer;

// The concrete implementation of a test case
public class BaseTest {
    private String connection = null;
    private String driver = null;

    public void setConnection(){
        connection = "connection";
    }
    public String getConnection() {
        return connection;
    }
    public void setDriver(){
        driver = "driver";
    }
    public String getDriver() {
        return driver;
    }

    @BeforeSuite
    public void setUp(){
        setConnection();
        setDriver();
        System.out.println("Connected to driver: " + getDriver());
        System.out.println("Connected to Kafka: " + getConnection());
    }

    @AfterSuite
    public void tearDown(){
        System.out.println("Close DB connection");
        System.out.println("Close Kafka connection");
    }
}
