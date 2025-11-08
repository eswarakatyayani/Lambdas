import java.util.*;
import java.util.function.Consumer;

public class Q5_ConsumerForEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        Consumer<Integer> printNum = n -> System.out.println("Number: " + n);
        nums.forEach(printNum);
    }
}
