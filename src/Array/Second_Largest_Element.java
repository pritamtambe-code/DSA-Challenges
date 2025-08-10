package Array;


import java.util.Arrays;

public class Second_Largest_Element {
    public static void main(String[] args) {

        int[]arr = {23,45,88,56,88,12};

        Arrays.sort(arr);

        int largest = arr[arr.length-1];
        int secondlargest = -1;

        for(int i = arr.length-2 ;i>=0;i--){
            if(arr[i] != largest){
                secondlargest = arr[i];
                break;
            }
        }
        System.out.println(secondlargest);

    }
}
