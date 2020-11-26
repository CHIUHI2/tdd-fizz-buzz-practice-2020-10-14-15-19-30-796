package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
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
}
