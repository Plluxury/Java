import static org.junit.Assert.*;
import org.junit.Test;

public class Number1Tests {

    @Test
    public void testMaxAndSquare() {
        int x = 3;
        int y = 5;
        int expectedMax = 5;
        int expectedResult = 25;

        int actualMax = Math.max(x, y);
        int actualResult = actualMax * actualMax;

        assertEquals(expectedMax, actualMax);  // проверка максимума
        assertEquals(expectedResult, actualResult);  // проверка квадрата максимума
    }
}
