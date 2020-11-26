package tdd.fizzbuzz;

public class FizzBuzz {
    private final String countOffForMultipleOfThree = "Fizz";

    public String countingOff(int order) {
        String countOff = String.valueOf(order);
        boolean isMultipleOfThree = this.isMultipleOfThree(order);

        if(isMultipleOfThree) {
            countOff = this.countOffForMultipleOfThree;
        }

        return countOff;
    }

    private boolean isMultipleOfThree(int order) {
        return order % 3 == 0;
    }
}
