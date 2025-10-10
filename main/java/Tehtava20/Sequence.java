package Tehtava20;


import java.util.Iterator;

public interface Sequence extends Iterable<Integer> {
    @Override
    Iterator<Integer> iterator();
}

