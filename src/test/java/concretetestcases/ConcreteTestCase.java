package concretetestcases;

import interfaces.TestCase;

// The concrete implementation of a test case
public class ConcreteTestCase implements TestCase {
    @Override
    public void execute() {
        // Perform the test case
        System.out.println("Executing concrete test case...");
    }

}
