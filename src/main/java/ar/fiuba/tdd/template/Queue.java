package ar.fiuba.tdd.template;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juan on 01/09/16.
 */
public class Queue<T> implements QueueInterface<T> {

    List<T> lista;
    static final int top = 0;

    public Queue(){
        lista = new ArrayList<T>();
    }

    public boolean isEmpty(){
        return lista.isEmpty();
    }

    public int size(){
        return lista.size();
    }

    public void add(T item){
        lista.add(top,item);
    }

    public T top(){
        return lista.get(top);
    }

    public void remove(){
        lista.remove(top);
    }
}
