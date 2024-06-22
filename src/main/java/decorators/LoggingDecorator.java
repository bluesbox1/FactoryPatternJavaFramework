package decorators;

import interfaces.TestCase;

// A concrete decorator that adds a logging functionality
public class LoggingDecorator extends TestCaseDecorator {
    public LoggingDecorator(TestCase decoratedTestCase) {
        super(decoratedTestCase);
    }

    @Override
    public void execute() {
        // Add logging before and after executing the test case
        System.out.println("Logging before test case...");
        decoratedTestCase.execute();
//        System.out.println("from ConcreteTestCase class: " + decoratedTestCase.value());
//        System.out.println(decoratedTestCase.sentence());
//        System.out.println("from LoggingDecorator (this) class: " + value());
//        System.out.println(sentence());
        System.out.println("Logging after test case...");
    }

//    @Override
//    public int value() {
//        //do something with value retrieved from ConcreteTestCase
//        return this.decoratedTestCase.value() + 1;
//    }
//
//    @Override
//    public String sentence() {
//        return this.decoratedTestCase.sentence() + "_appended!";
//    }
}