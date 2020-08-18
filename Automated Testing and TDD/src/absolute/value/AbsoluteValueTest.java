package absolute.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteValueTest {

    @Test
    void findAbsoluteValue0() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteValue.findAbsoluteValue(number);
        assertEquals(expected, result);
    }

    @Test
    void findAbsoluteValue1() {
        int number = 1;
        int expected = 1;
        int result = AbsoluteValue.findAbsoluteValue(number);
        assertEquals(expected, result);
    }

    @Test
    void findAbsoluteValueNegative1() {
        int number = -1;
        int expected = 1;
        int result = AbsoluteValue.findAbsoluteValue(number);
        assertEquals(expected, result);
    }
}