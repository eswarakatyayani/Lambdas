import java.util.function.Function;
public class Q4_FunctionToUpper {
    public static void main(String[] args) {
        Function<String, String> toUpper = str -> str.toUpperCase();
        System.out.println(toUpper.apply("infinite")); // INFINITE
    }
}
