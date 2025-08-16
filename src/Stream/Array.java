package Stream;
import java.util.Arrays;

public class Array {
        public static void main(String[] args) {


            int[]age = {10,5,5};

            Arrays.stream(age)
                    .map(n -> n*2)
                    .sorted()
                    .forEach(System.out::println);



        }
    }

