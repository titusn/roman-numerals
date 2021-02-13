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
    }
}
