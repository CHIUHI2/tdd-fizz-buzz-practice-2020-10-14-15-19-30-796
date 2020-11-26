package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private final String countOffForMultipleOfThree = "Fizz";

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
        assertEquals(this.countOffForMultipleOfThree, countOff);
    }
}
