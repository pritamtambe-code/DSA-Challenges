package Stream;

import java.util.Arrays;

public class find_max {
    public static void main(String[] args) {
        int[]num = {10,5,12,3};

        int max = Arrays.stream(num).
                   max().getAsInt();
                   System.out.println(max);
    }
}
