package Array;

public class Count_Even_Numbers {
    public static void main(String[] args) {
        int[] arr = {2,3,4,55,10,12};
        int even = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                even++;
            }
        };
        System.out.println("There are "+even+ " even numbers in array");
    }

    }

