package Array_Leetcode;
import java.util.*;
public class Find_Dublicates {
    public static void main(String[] args) {
        int[] nums = {8, 5, 3, 4, 5, 9, 8};
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
