package linked_list_leetcode;

public class Two_sum {

    public static void main(String[] args) {

        int arr[] = {2, 78, 55, 15, 67, 6, 7};
        int num = 8;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + " and " + arr[j]);
                    found = true;


                }

            }
        }

        if (found == false) {
            System.out.println("nothing");
        }
    }
}



