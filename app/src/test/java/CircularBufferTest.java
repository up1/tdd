import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CircularBufferTest {

    CircularBuffer circularBuffer = new CircularBuffer();

    @Test
    public void
    create_buffer_then_buffer_empty() {
        assertTrue(circularBuffer.isEmpty());
    }

    @Test @Ignore
    public void
    create_buffer_then_buffer_not_full() {
        assertTrue(circularBuffer.isFull());
    }

    @Test
    public void
    create_buffer_then_default_size_is_five() {
        assertEquals(5, circularBuffer.size());
    }

    @Test
    public void
    create_buffer_with_size_2_then_size_is_two() {
        CircularBuffer circularBuffer2 = new CircularBuffer(2);
        assertEquals(2, circularBuffer2.size());
    }


    @Test
    public void
    add_one_element_then_buffer_not_empty() {
        circularBuffer.add("A");
        assertFalse(circularBuffer.isEmpty());
    }

    @Test
    public void
    add_one_element_and_remove_then_buffer_empty() {
        circularBuffer.add("A");
        circularBuffer.remove();
        assertTrue(circularBuffer.isEmpty());
    }

    @Test
    public void
    add_one_element_and_remove_then_should_return_same_element() {
        circularBuffer.add("A");
        String result = circularBuffer.remove();
        assertEquals("A", result);
    }

    @Test
    public void
    add_one_element_and_remove_then_should_return_same_element_02() {
        circularBuffer.add("B");
        assertEquals("B", circularBuffer.remove());
    }

    @Test
    public void
    add_two_elements_and_remove_then_should_return_same_element() {
        circularBuffer.add("A");
        circularBuffer.add("B");
        assertEquals("A", circularBuffer.remove());
        assertEquals("B", circularBuffer.remove());
    }





}
