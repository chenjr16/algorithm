import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryToDecimalTest {
    BinaryToDecimal convert;
    @Before
    public void setUp() {
        convert = new BinaryToDecimal();
    }
    @Test
    public void convertToDecimal() {
        assertEquals(2, convert.convertToDecimal("10"));
        assertNotEquals(3,convert.convertToDecimal("10"));
    }

    @Test
    public void convertToDecimalAlt() {
        assertEquals(2, convert.convertToDecimalAlt("10"));
    }
    @Test
    public void convertOctalToDecimal() {
        assertEquals(16146, convert.convertOctalToDecimal("37422"));
    }
    @Test
    public void convertDecimalToBase() {
        assertEquals(16146, convert.convertDecimalToBase("37422", 8));
    }
    @Test(expected = IllegalArgumentException.class)
    public void convertDecimalToBase_returnExceptionWhenStringOutOfBounds() {
        convert.convertDecimalToBase("37922", 8);
    }
    @Test(expected = IllegalArgumentException.class)
    public void convertDecimalToBase_returnExceptionWhenBaseOutOfBoundsHigh() {
        convert.convertDecimalToBase("37422", 11);
    }
    @Test(expected = IllegalArgumentException.class)
    public void convertDecimalToBase_returnExceptionWhenBaseOutOfBoundsLow() {
        convert.convertDecimalToBase("37422", -5);
    }
    @Test
    public void main() {
    }
}