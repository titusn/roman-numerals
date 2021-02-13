import com.titusnachbauer.numerals.Numerals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumeralsTest {
    @Test
    public void ConvertNumberToNumeralTest() {
        Numerals numerals = new Numerals();
        assertEquals("I", numerals.convert(1));
        assertEquals("II", numerals.convert(2));
        assertEquals("III", numerals.convert(3));
        assertEquals("IV", numerals.convert(4));
        assertEquals("V", numerals.convert(5));
        assertEquals("VI", numerals.convert(6));
        assertEquals("VII", numerals.convert(7));
        assertEquals("VIII", numerals.convert(8));
        assertEquals("IX", numerals.convert(9));
        assertEquals("X", numerals.convert(10));
        assertEquals("XI", numerals.convert(11));
        assertEquals("XX", numerals.convert(20));
        assertEquals("XXVII", numerals.convert(27));
        assertEquals("XL", numerals.convert(40));
        assertEquals("LIV", numerals.convert(54));
        assertEquals("CXXIV", numerals.convert(124));
        assertEquals("DLXIX", numerals.convert(569));
        assertEquals("MCMXCIX", numerals.convert(1999));
    }
}
