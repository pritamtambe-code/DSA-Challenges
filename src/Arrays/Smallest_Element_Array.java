package Arrays;

public class Smallest_Element_Array {
    public static void main(String[] args) {
        int[] arr = {23,44,90,670,5,89};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print("smallest element is "+min);
    }
}
