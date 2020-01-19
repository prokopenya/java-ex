package bags;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;


class BagTest {

    @Test
    public void testBagSize() {
        Bag<Integer> bags = new Bag<Integer>();
        assertEquals(true, bags.isEmpty());
        assertEquals(0, bags.size());
    }

    @Test
    public void testAddOperation() {
        Bag<Integer> balls = new Bag<Integer>();
        balls.add(1);
        balls.add(2);
        balls.add(3);

        assertEquals(3, balls.size());

    }

    @Test
    public void testRemoveOperation() {
        Bag<Integer> bags = new Bag<Integer>();
        bags.add(1);
        bags.add(2);
        bags.add(3);
        Iterator<Integer> it = bags.iterator();
        while (it.hasNext()) {
            try {
                it.remove();
            } catch (UnsupportedOperationException e) {
                assertNotNull(e);
            } catch (Throwable ex) {
                assertEquals(false,true);
            }
        }
    }
}