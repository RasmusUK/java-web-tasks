package ws;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {
    public int add(String input) throws Exception {
        if (input == null || input.isEmpty()) return 0;
        var del = ",";
        if (input.startsWith("//")){
            del = input.substring(2,3);
            input = input.substring(3);
        }
        input = input.replace("\n","");
        var numbers = Arrays.stream(input.split(del)).mapToInt(Integer::parseInt).toArray();
        if(Arrays.stream(numbers).anyMatch(x -> x < 0)) {
            throw new Exception(input);
        }
        return Arrays.stream(numbers).sum();
    }
}
