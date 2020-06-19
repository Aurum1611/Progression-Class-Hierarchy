public class FibonacciSeries extends Progression {
    private long prev;

    FibonacciSeries(long first, long second) {
        super(first);
        prev = second - first; // Get the previous value from the specified ones in the series
    }

    FibonacciSeries() {
        super(0);
        prev = 1;
    }

    @Override
    protected void advance() {
        start += prev; // Get the next value
        prev = start - prev; // Get the value preceding that
    }
}
