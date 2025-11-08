/*
Print a message using Runnable (no parameters, no return)
Question:
Use a lambda to print "Welcome to Infosys Interview Practice" using Runnable.
*/
public class Q1_RunnableLambda {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Welcome to Interview Practice");
        r.run();
    }
}
