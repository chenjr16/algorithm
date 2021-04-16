import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChainedHashTableTest {

    ChainedHashTable<Integer, String > hashTable = null;
    @Before
    public void setUp() throws Exception {
        hashTable = new ChainedHashTable<>(10, new RemainderHashing());
        hashTable.put(32, "Marco");
        hashTable.put(52, "Kathy");
    }

    @Test
    public void put() {
        hashTable.put(42, "Junru");
        assertEquals("Junru", hashTable.get(42));
    }

    @Test
    public void putNull() {
        hashTable.put(98, null);
        assertEquals(null, hashTable.get(98));
    }

    @Test
    public void get() {
        assertEquals("Kathy", hashTable.get(52));
        assertEquals(null, hashTable.get(99));
    }

    @Test
    public void remove() {
        hashTable.remove(32);
        assertEquals(null, hashTable.get(32));
    }
}