package Array;

import java.util.Scanner;

public class Search_Element_Array {
    public static void main(String[] args) {

        int[] arr = {2,33,4,56,23};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number u want to search :");
        int number = sc.nextInt();

        int element= number;

        boolean found = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i]== element){
                System.out.println("Element "+element +" is at index"+" "+i);
                found = true;
                break;
            };
        };

        if(found == false){
            System.out.println("Element not found");
        }

    }
    }

