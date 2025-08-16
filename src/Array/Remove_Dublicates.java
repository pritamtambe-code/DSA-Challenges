package Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_Dublicates {
    public static void main(String[] args) {
        int[]arr = {3,4,5,3,6,7,6,3,5,4};
        Set<Integer>set = new HashSet<>();
        for( int num : arr){
            set.add(num);
        }

        int[]sorted = new int[set.size()];
        int i =0;
        for (int num : set){
            sorted[i] = num;
            i++;
        }
        System.out.println(Arrays.toString(sorted));


    }
}
