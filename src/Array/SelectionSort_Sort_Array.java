package Array;

public class SelectionSort_Sort_Array {
    public static void main(String[] args) {

        int[]arr = {23,45,88,12,13};

        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
