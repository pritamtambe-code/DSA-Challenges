package Stream;

import java.util.Arrays;


public class count_evennumbers {
    public static void main(String[] args) {
        int[] num = {6,3,6,7,24,4,};

        long count = Arrays.stream(num)
                   .filter(n-> n%2==0)
                   .count();

         System.out.println(count);

    }
}
