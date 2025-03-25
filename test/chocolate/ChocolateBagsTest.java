package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChocolateBagsTest {
    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({
            "1,1,5,0",  // prueba 1
            "1,1,6,1",  // prueba 2
            "4,0,10,-1", // prueba 3
            "4,1,10,-1", // prueba 4
            "5,2,10,0",  // prueba 5
            "5,3,10,0"   // prueba 6
    })
    public void totalIsTooBig(int small, int big, int total, int expectedResult) {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({ "4,0,10,-1", "4,1,10,-1", "5,2,10,0", "5,3,10,0" })
    public void onlyBigBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({
            "2,3,17,2",
            "3,3,17,2",
            "4,1,9,4",
            "1,2,7,-1"
    })
    public void bigAndSmallBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        assertEquals(expectedResult, result);
    }



    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({
            "3,0,3,3",
            "5,0,4,4",
            "2,0,5,-1",
            "4,0,2,2"
    })
    public void onlySmallBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        assertEquals(expectedResult, result);
    }
}
