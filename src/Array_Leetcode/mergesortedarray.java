package Array_Leetcode;
public class mergesortedarray {
    public static void main(String[] args) {
        int n =3;
        int m=3;
        int[] nums1 = {1,2,3,0,0,0,};
        int[] nums2 = {2,5,6};

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0&& j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else {
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }

        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
        System.out.print("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }

    }
}
