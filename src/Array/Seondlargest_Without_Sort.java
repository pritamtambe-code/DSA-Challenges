package Array;

public class Seondlargest_Without_Sort {
    public static void main(String[] args) {
        int[]arr = {45,88,56,333,90};
        int largest=-1;
        int secondlargest =-1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondlargest && arr[i]<largest){
                secondlargest = arr[i];
            }
        }
        System.out.println(secondlargest);
    }

}
