package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private static final String countOffForMultipleOfThree = "Fizz";
    private static final String countOffForMultipleOfFive = "Buzz";
    private static final String countOffForMultipleOfSeven = "Whizz";

    @Test
    void should_return_order_number_when_order_given_not_special_number() {
        //given
        int order = 1;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String countOff = fizzBuzz.countingOff(order);
        //then
        assertEquals(String.valueOf(order), countOff);
    }

    @Test
    void should_return_fizz_when_order_given_multiple_of_three() {
        //given
        int order = 3;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String countOff = fizzBuzz.countingOff(order);
        //then
        assertEquals(countOffForMultipleOfThree, countOff);
    }

    @Test
    void should_return_buzz_when_order_given_multiple_of_five() {
        //given
        int order = 5;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String countOff = fizzBuzz.countingOff(order);
        //then
        assertEquals(countOffForMultipleOfFive, countOff);
    }

    @Test
    void should_return_buzz_when_order_given_multiple_of_seven() {
        //given
        int order = 7;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String countOff = fizzBuzz.countingOff(order);
        //then
        assertEquals(countOffForMultipleOfSeven, countOff);
    }

    @Test
    void should_return_fizzBuzz_when_order_given_multiple_of_three_and_five() {
        //given
        int order = 15;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String countOff = fizzBuzz.countingOff(order);
        //then
        assertEquals(countOffForMultipleOfThree.concat(countOffForMultipleOfFive), countOff);
    }

    @Test
    void should_return_fizzBuzz_when_order_given_multiple_of_three_and_seven() {
        //given
        int order = 21;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String countOff = fizzBuzz.countingOff(order);
        //then
        assertEquals(countOffForMultipleOfThree.concat(countOffForMultipleOfSeven), countOff);
    }

    @Test
    void should_return_fizzBuzz_when_order_given_multiple_of_five_and_seven() {
        //given
        int order = 35;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String countOff = fizzBuzz.countingOff(order);
        //then
        assertEquals(countOffForMultipleOfFive.concat(countOffForMultipleOfSeven), countOff);
    }

    @Test
    void should_return_fizzBuzz_when_order_given_multiple_of_three_and_five_and_seven() {
        //given
        int order = 105;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String countOff = fizzBuzz.countingOff(order);
        //then
        assertEquals(countOffForMultipleOfThree.concat(countOffForMultipleOfFive.concat(countOffForMultipleOfSeven)), countOff);
    }
}
