package Tehtava20;


import java.util.Iterator;

/**
 * This class acts as a generator for FibonacciIterator instances.
 * It does not maintain any state itself, allowing each iterator
 * to be independent and reusable.
 */
public class FibonacciSequence implements Sequence {
    private final int maxCount;

    public FibonacciSequence(int maxCount) {
        this.maxCount = maxCount;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(maxCount);
    }
}
