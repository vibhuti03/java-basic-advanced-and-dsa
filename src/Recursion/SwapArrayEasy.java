package Recursion;

import java.util.Arrays;

public class SwapArrayEasy {
    static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swapArrayTwoPointer(int left, int right, int[] arr){
        if(left>=right){
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(left,right,arr);
        swapArrayTwoPointer(left+1, right-1, arr);
    }

    static void swapArraySinglePointer(int i, int[] arr){
        int n = arr.length;

        if(i>=(n/2)){
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(i, n-i-1, arr);
        swapArraySinglePointer(i+1, arr);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int left = 0, right = arr.length-1;
        swapArrayTwoPointer(left, right, arr); // => [6,5,4,3,2,1]

        swapArraySinglePointer(left, arr); //=> [1,2,3,4,5,6]
    }
}
