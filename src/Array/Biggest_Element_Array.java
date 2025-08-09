package Numbers;

public class Biggest_Element_Array {
    public static void main(String[] args) {
        int[] arr = {23,44,90,670,50,89};
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("The biggest element is "+max);
    }
}
