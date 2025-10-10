package Tehtava20;


import java.util.Iterator;

/**
 * This class encapsulates the iteration logic for the Fibonacci sequence.
 * It maintains its own state (previous and current values), ensuring that
 * multiple iterators can operate independently without shared state.
 */
public class FibonacciIterator implements Iterator<Integer> {
    private int count = 0;
    private final int maxCount;
    private int prev = 0;
    private int curr = 1;

    public FibonacciIterator(int maxCount) {
        this.maxCount = maxCount;
    }

    @Override
    public boolean hasNext() {
        return count < maxCount;
    }

    @Override
    public Integer next() {
        count++;
        int nextValue = curr;
        int temp = curr;
        curr = curr + prev;
        prev = temp;
        return nextValue;
    }
}
