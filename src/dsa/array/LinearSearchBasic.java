package dsa.array;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchBasic {
    public static void main(String[] args) {

        // Search Number in Array
        Scanner input = new Scanner(System.in);

        int[] arr = {5, 4, 6, -2};

        int target = 4;

        /*

        int index = search(arr, target);
        System.out.println(index);

        // search in range
        int ans = searchInRange(arr, target, 1, 3 );
        System.out.println(ans);

         */

        // Search in String

        /*

        String name = "Sarthak";
        char find = 'p';

        boolean ans = findInString(name, find);
        System.out.println(ans);

         */

        // Find minimum number from array

        /*

        int min = searchMin(arr);
        System.out.println(min);

         */

        // Search in 2D arrays

        int[][] arr2d = {
            {1, 2, 3},
            {5 ,8, 12},
            {6, 24, 32}
        };

        int find = 12;
        int ans[] = findIn2DArray(arr2d, find);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findIn2DArray(int[][] arr2d, int find) {
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                if(find == arr2d[row][col]){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    private static int searchMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    private static boolean findInString(String name, char find) {
        for (int i = 0; i < name.length(); i++) {
            if(find == name.charAt(i)){
                return true;
            }
        }
        return false;
    }

    private static int searchInRange(int[] arr, int target, int index1, int index2) {
        for (int index = index1; index <= index2; index++) {
            if(target == arr[index]){
                return index;
            }
        }
        return -1;
    }

    private static int search(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            if(target == arr[index]){
                return index;
            }
        }
        return -1;
    }
}
