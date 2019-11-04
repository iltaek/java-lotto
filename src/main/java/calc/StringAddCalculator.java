package calc;

import java.util.Arrays;

public class StringAddCalculator {

    public int add(String input) {
        if (input == null || input.equals("")) {
            return 0;
        }

        if (input.contains(",")||input.contains(":")) {
            String[] numbers = input.split(",|:");
            return Arrays.stream(numbers)
                        .mapToInt(Integer::parseInt)
                        .reduce(0, Integer::sum);
        }

        return Integer.parseInt(input);
    }
}