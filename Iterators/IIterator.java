package Iterators;

public interface IIterator<T> {
    boolean hasNext();
    T next();
    void reset();
}

