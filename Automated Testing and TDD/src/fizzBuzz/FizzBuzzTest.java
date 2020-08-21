package fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void printFizzBuzz_0() {
        int number = 0;
        String expected = "Wrong number";
        String result = FizzBuzz.printFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void printFizzBuzz_negative1() {
        int number = -1;
        String expected = "Wrong number";
        String result = FizzBuzz.printFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void printFizzBuzz_1() {
        int number = 1;
        String expected = "";
        String result = FizzBuzz.printFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void printFizzBuzz_33() {
        int number = 33;
        String expected = "FizzFizz";
        String result = FizzBuzz.printFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void printFizzBuzz_55() {
        int number = 55;
        String expected = "BuzzBuzz";
        String result = FizzBuzz.printFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void printFizzBuzz_60() {
        int number = 60;
        String expected = "FizzBuzz";
        String result = FizzBuzz.printFizzBuzz(number);
        assertEquals(expected, result);
    }
}