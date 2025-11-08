/*
Use Predicate<String> to check if a word starts with a vowel.
*/

import java.util.function.Predicate;
public class Q3_PredicateStartsWithVowel {
    public static void main(String[] args) {
        Predicate<String> startsWithVowel = s -> s.matches("^[AEIOUaeiou].*");
        System.out.println(startsWithVowel.test("Infinite")); // true
        System.out.println(startsWithVowel.test("java")); // false
    }
}
