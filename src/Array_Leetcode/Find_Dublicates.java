package Array_Leetcode;
import java.util.*;
public class Find_Dublicates {
    public static void main(String[] args) {
        int[] nums = {8, 5, 3, 4, 5, 9, 8};
        Set<Integer> set = new HashSet<>();        // Track seen numbers
        Set<Integer> duplicates = new HashSet<>(); // Store duplicates

        for (int num : nums) {
            if (!set.add(num)) {   // add() returns false if already exists
                duplicates.add(num); // duplicate found → add to duplicates set
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
