package Array_Leetcode;

import java.util.HashMap;

public class Two_Sum_HashMap {
    public static void main(String[] args) {


        int[] num = {2, 6, 7, 8};
        int find = 9;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

         for(int i = 0;i<num.length;i++){
             int target = find- num[i];
             if(map.containsKey(target)){
                 System.out.println(map.get(target) +""+i);
             }
             map.put(num[i],i);
         }

        }
    }

