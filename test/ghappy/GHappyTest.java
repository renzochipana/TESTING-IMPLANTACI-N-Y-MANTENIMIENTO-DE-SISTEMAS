package tudelft.ghappy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GHappyTest {
    @ParameterizedTest(name = "Input={0}, Expected={1}")
    @CsvSource({
            "'xxggxx', true", // todas son felices
            "'xxgxx', false", //sola
            "'xxggyygxx', false", // no esta acompañada
            "'gg', true", // todas felices
            "'g', false", // no es feliz
            "'gggg', true", // feliz grupal
            "'', true", //sin g
            "'abcdefg', false"   //ultimo g no es feliz
    })
    public void testGHappy(String input, boolean expected) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(input);
        assertEquals(expected, result);
    }
}
