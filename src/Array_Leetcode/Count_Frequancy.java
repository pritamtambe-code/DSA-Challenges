package Array_Leetcode;

import java.util.HashMap;

public class Count_Frequancy {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = {5, 4, 5, 7, 8, 5, 4, 2, 4, 7, 5};

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1);
            }

        }
        System.out.println(map);

    }
}
