package Array_Leetcode;

public class Find_Missing_Number {
    public static void main(String[] args) {
        int[]num = {3,0,1};
        int sum =0;
        int n = num.length;
        int total = n*(n+1)/2;

        for(int number:num){
            sum = sum+number;
        }

        int missingvalue = total-sum;

        System.out.println(missingvalue);
    }
}
