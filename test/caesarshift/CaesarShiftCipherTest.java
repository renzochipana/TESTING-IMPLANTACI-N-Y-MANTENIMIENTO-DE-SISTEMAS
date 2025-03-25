package tudelft.caesarshift;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "Message={0}, Shift={1}, Expected={2}")
    @CsvSource({
            "'abc', 3, 'def'",
            "'xyz', 3, 'abc'",
            "'hello world', 5, 'mjqqt btwqi'",
            "'abc', -3, 'xyz'",
            "'invalid1', 3, 'invalid'",
            "'UPPERCASE', 3, 'invalid'"
    })
    public void testCaesarShiftCipher(String message, int shift, String expected) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher(message, shift);
        assertEquals(expected, result);
    }
}
