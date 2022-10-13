import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.*;

public class LinkedListTests {
    
    @Test
    public void ShotgunAsserts() {
        LinkedList list = new LinkedList();
        list.prepend(0);
        assertEquals(list.first(), 0);
        list.append(3);
        list.append(2467);
        assertEquals(list.last(), 2467);
        assertEquals("0 3 2467 ", list.toString());
        assertEquals(3, list.length());

        LinkedList list2 = new LinkedList();
        assertThrows(NoSuchElementException.class, () -> list2.last());
        assertThrows(NoSuchElementException.class, () -> list2.first());
    }
}
