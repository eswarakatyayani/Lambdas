/*
Create a Calculator interface with int operate(int a, int b) and use a lambda to add two numbers.
*/
public class Q2_CustomFunctionalInterface {
    @FunctionalInterface
    interface Calculator {
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println("Addition: " + add.operate(5, 10));
    }
}
