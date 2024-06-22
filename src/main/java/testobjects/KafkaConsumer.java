package testobjects;

public class KafkaConsumer {
    private String connection;
    public KafkaConsumer(String connection){
        this.connection = connection;
    }

    public String consumeMessages(){
        System.out.println("Connect to cluster using " + connection);
        return "message 1";
    }
}
