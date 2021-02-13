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
    }
}
