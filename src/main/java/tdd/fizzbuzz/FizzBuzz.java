package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String countOffForMultipleOfThree = "Fizz";
    private static final String countOffForMultipleOfFive = "Buzz";
    private static final String countOffForMultipleOfSeven = "Whizz";

    public String countingOff(int order) {
        String countOff = String.valueOf(order);
        boolean isMultipleOfThree = this.isMultipleOfThree(order);
        boolean isMultipleOfFive = this.isMultipleOfFive(order);
        boolean isMultipleOfSeven = this.isMultipleOfSeven(order);

        if(isMultipleOfThree) {
            countOff = countOffForMultipleOfThree;
        }
        else if(isMultipleOfFive) {
            countOff = countOffForMultipleOfFive;
        }
        else if(isMultipleOfSeven) {
            countOff = countOffForMultipleOfSeven;
        }

        return countOff;
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
