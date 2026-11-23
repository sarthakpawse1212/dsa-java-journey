package dsa.array;

import java.util.Arrays;
import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Swapping values in Array

        int[] arr = {5, 4, 3, 2, 1};

        /*

        swap(arr, 1, 2);

        System.out.println(Arrays.toString(arr));

         */


        // Maximum value of an array

        /*

        int maxValue = maxValueFromArray(arr);
        System.out.println(maxValue);

         */

        // Reverse array

        /*

        String reverseArray = reverseArr(arr);
        System.out.println(reverseArray);

         */

    }

    static String reverseArr(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while(first < last){
            swap(arr, first, last);
            first++;
            last--;
        }
        String reverse = Arrays.toString(arr);
        return reverse;
    }

    static int maxValueFromArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
