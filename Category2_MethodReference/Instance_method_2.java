import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<List<Integer>> sorter = Collections::sort;
        List<Integer> nums = Arrays.asList(5, 1, 3);
        sorter.accept(nums);
        System.out.println("Sorted List: " + nums);
    }
}
