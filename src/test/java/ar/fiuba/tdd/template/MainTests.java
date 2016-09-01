package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTests {

    @Test
    public void dummy() {
        assertEquals(0, 0);
    }

    @Test
    public void queueShouldBeEmpty(){
        Queue<Item> aQueue = new Queue<>();
        assertTrue(aQueue.isEmpty());
    }

    @Test
    public void queueShouldNotBeEmpty(){
        Item anItem = new Item();
        Queue<Item> aQueue = new Queue<>();
        aQueue.add(anItem);
        assertFalse(aQueue.isEmpty());
    }

    @Test
    public void queueSizeShouldBeThree(){
        Item firstItem = new Item();
        Item secondItem = new Item();
        Item thirdItem = new Item();
        Queue<Item> aQueue = new Queue<>();
        aQueue.add(firstItem);
        aQueue.add(secondItem);
        aQueue.add(thirdItem);
        assertEquals(3,aQueue.size());
    }
}
