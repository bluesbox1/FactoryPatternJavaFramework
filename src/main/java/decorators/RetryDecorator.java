package decorators;

import interfaces.TestCase;

// A concrete decorator that adds a retry functionality
public class RetryDecorator extends TestCaseDecorator {
    private int maxRetries;

    public RetryDecorator(TestCase decoratedTestCase, int maxRetries) {
        super(decoratedTestCase);
        this.maxRetries = maxRetries;
    }

    @Override
    public void execute() {
        // Retry the test case up to the maximum number of times
        int retries = 0;
        while (retries < maxRetries) {
            try {
                System.out.println("the retry decorator wraps starting here");
                decoratedTestCase.execute();
                System.out.println("the retry decorator wraps ending here");
                return;
            } catch (Exception e) {
                retries++;
            }
        }

        // Throw an exception if the test case still fails
        throw new RuntimeException("Test case failed after " + maxRetries + " retries.");
    }

}
