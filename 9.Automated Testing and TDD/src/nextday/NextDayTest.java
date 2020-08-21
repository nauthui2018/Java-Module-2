package nextday;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {

    @Test
    void findNextDay1_1_2018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2-1-2018";
        String result = NextDay.findNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void findNextDay31_1_2018() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1-2-2018";
        String result = NextDay.findNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void findNextDay30_4_2018() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1-5-2018";
        String result = NextDay.findNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void findNextDay28_2_2018() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1-3-2018";
        String result = NextDay.findNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void findNextDay29_2_2020() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1-3-2020";
        String result = NextDay.findNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void findNextDay31_12_2018() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1-1-2019";
        String result = NextDay.findNextDay(day, month, year);
        assertEquals(expected, result);
    }
}