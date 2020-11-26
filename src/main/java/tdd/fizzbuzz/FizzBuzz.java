package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String countOffForMultipleOfThree = "Fizz";
    private static final String countOffForMultipleOfFive = "Buzz";

    public String countingOff(int order) {
        String countOff = String.valueOf(order);
        boolean isMultipleOfThree = this.isMultipleOfThree(order);
        boolean isMultipleOfFive = this.isMultipleOfFive(order);

        if(isMultipleOfThree) {
            countOff = countOffForMultipleOfThree;
        }
        else if(isMultipleOfFive) {
            countOff = countOffForMultipleOfFive;
        }

        return countOff;
    }

    private boolean isMultipleOfThree(int order) {
        return order % 3 == 0;
    }

    private boolean isMultipleOfFive(int order) {
        return order % 5 == 0;
    }
}
