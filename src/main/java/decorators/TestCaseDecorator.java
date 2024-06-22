package decorators;

import interfaces.TestCase;

// The base class for decorators
public abstract class TestCaseDecorator implements TestCase {
    protected TestCase decoratedTestCase;

    public TestCaseDecorator(TestCase decoratedTestCase) {
        this.decoratedTestCase = decoratedTestCase;
    }
}
