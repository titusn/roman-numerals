import com.titusnachbauer.numerals.Numerals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumeralsTest {
    @Test
    void Nothing() {

    }
    @Test
    void ConvertNumberToNumeralTest() {
        Numerals numerals = new Numerals();
        assertEquals("I", numerals.convert(1));
    }
}
