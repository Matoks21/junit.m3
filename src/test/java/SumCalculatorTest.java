import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
  Напиши тестовий клас для SumCalculator,
  де протестуй наступну поведінку методу sum() (кожний пункт списку - окремий тест):
виклик sum(1) повертає 1
виклик sum(3) повертає 6
виклик sum(0) викидає виключення IllegalArgumentException
 */

class SumCalculatorTest {
    private SumCalculator sumNumbers;

    @BeforeEach
    public void beforeEach() {
        sumNumbers = new SumCalculator();
    }

    @Test
    void testSumAllNumbersForOne() {
        int actual = sumNumbers.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSumAllNumbersForThree() {
        int actual = new SumCalculator().sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSumAllNumbersForZero() {

        try {
            sumNumbers.sum(0);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Can't sum numbers for zero", e.getMessage());
        }

    }
}
