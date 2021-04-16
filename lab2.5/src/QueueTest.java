import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    Queue<String> q;
    @Before
    public  void setup(){
        q =  new Queue<>();
    }
    @Test
    public void testAddingToQueue(){
        q.enqueue("one");
        assertEquals("one", q.dequeue());
    }
    @Test
    public void testDeletingFromQueue(){
        q.enqueue("one");
        q.enqueue("two");
        assertEquals("one", q.dequeue());
        assertEquals("two", q.dequeue());
    }
    @Test
    public void testEmptyQueue(){
        q.enqueue("one");
        q.enqueue("two");
        q.dequeue();
        q.dequeue();
        assertEquals(null, q.dequeue());
    }
