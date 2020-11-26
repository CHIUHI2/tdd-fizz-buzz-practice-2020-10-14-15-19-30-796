package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String countOffForMultipleOfThree = "Fizz";
    private static final String countOffForMultipleOfFive = "Buzz";
    private static final String countOffForMultipleOfSeven = "Whizz";

    public String countingOff(int order) {
        String countOff = "";
        boolean isMultipleOfThree = this.isMultipleOfThree(order);
        boolean isMultipleOfFive = this.isMultipleOfFive(order);
        boolean isMultipleOfSeven = this.isMultipleOfSeven(order);

        if(isMultipleOfThree) {
            countOff += countOffForMultipleOfThree;
        }

        if(isMultipleOfFive) {
            countOff += countOffForMultipleOfFive;
        }

        if(isMultipleOfSeven) {
            countOff += countOffForMultipleOfSeven;
        }

        return countOff.isEmpty() ? String.valueOf(order) : countOff;
    }

    private boolean isMultipleOfThree(int order) {
        return order % 3 == 0;
    }

    private boolean isMultipleOfFive(int order) {
        return order % 5 == 0;
    }

    private boolean isMultipleOfSeven(int order) {
        return order % 7 == 0;
    }
}
