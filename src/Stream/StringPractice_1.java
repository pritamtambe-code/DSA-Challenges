package Stream;

import java.util.Arrays;

public class StringPractice_1 {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "cherry"};

        Arrays.stream(fruits)
                .map(s -> s.toUpperCase())
                .sorted()
                .forEach(System.out::println);
    }
}
