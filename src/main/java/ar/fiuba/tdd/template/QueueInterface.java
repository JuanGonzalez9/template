package ar.fiuba.tdd.template;

/**
 * Created by juan on 01/09/16.
 */
public interface QueueInterface<T> {

    boolean isEmpty();
    int size();
    void add(T item);
    T top();
    void remove();
}
