package Arrays;

public class Count_Odd_Numbers {
    public static void main(String[] args) {
        int[] arr = {2,3,4,55,10,12};
        int odd = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                odd++;
            }
        };
        System.out.println("There are "+odd+" odd numbers in array");
    }
    }

