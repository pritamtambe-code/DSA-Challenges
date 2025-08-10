package Array;


import java.util.Arrays;

public class Second_Smallest_Element {
    public static void main(String[] args) {

        int[]arr = {23,45,88,12,13,56,88,12};

        Arrays.sort(arr);

        int smallest = arr[0];
        int secondsmallest = -1;

        for(int i = 1;i < arr.length;i++){
            if(arr[i] != smallest){
                secondsmallest = arr[i];
                break;
            }
        }
        System.out.println(secondsmallest);

    }
}
