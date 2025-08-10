package Array;

public class Frequency_of_Element {
    public static void main(String[] args) {

        int[]arr = {23,45,88,12,13,12,56,88,12};

        int num = 12;
        int freq = 0;
        for (int i = 0; i< arr.length; i++){
            if(arr[i]==num){
                freq++;
            }
        }
        System.out.println("frequncy of of number "+num+" is "+ freq);

    }
}
