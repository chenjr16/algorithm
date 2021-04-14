import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BigOTest {

    private BigO bigO;
    @Before
    public void setUp() throws Exception {
        bigO = new BigO();
    }

    @Test
    public void primeFactors() {
        long startTime = System.nanoTime();
        bigO.primeFactors(2100078577);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Large Prime number took %,d nanoseconds", duration));
    }

    @Test
    public void testNonPrime(){
        long startTime = System.nanoTime();
        bigO.primeFactors(2100078578);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Large NonPrime number took %,d nanoseconds", duration));

    }
}