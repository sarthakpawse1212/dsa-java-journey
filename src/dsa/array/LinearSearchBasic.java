/*
 * ==========================================
 *              LINEAR SEARCH
 * ==========================================
 *
 * Definition:
 * Linear Search (also known as Sequential Search) is a simple
 * searching algorithm that finds the position of a target element
 * by checking each element one by one from the beginning.
 *
 * How it works:
 * 1. Start from the first element (index 0).
 * 2. Compare the current element with the target value.
 * 3. If a match is found, return its index.
 * 4. Otherwise, move to the next element.
 * 5. If the entire array is traversed without a match, return -1.
 *
 * Comparisons:
 * - Best case: Only 1 comparison (element found at first index).
 * - Worst case: N comparisons (element at last index or not found).
 * - N = Total number of elements in the array.
 *
 * Time Complexity:
 *
 * Case          Complexity       Explanation
 * ---------------------------------------------------------
 * Best Case     O(1)             Target is at the first index.
 * Average Case  O(n)             Target is somewhere in the array.
 * Worst Case    O(n)             Target is at the last index
 *                                or is not present.
 *
 * Space Complexity:
 * O(1) - Uses constant extra space; no additional data
 * structure is required.
 *
 * Important:
 * - Works on both sorted and unsorted arrays.
 * - No sorting is required before searching.
 * - Suitable for small datasets.
 * - For large sorted datasets, Binary Search can be more efficient.
 *
 * ==========================================
 */

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

        /*

        int[][] arr2d = {
            {1, 2, 3},
            {5 ,8, 12},
            {6, 24, 32}
        };

        int find = 12;
        int ans[] = findIn2DArray(arr2d, find);
        System.out.println(Arrays.toString(ans));

         */

        // How many them contain even number of digits in array of numbers
        // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
        // LeetCode Easy

        /*
        int[] nums = {12, 345, 2, 6, 1818};
        int ans = checkDigits(nums);
        System.out.println(ans);
         */


        // Richest Customer Wealth
        // https://leetcode.com/problems/richest-customer-wealth/
        // LeetCode Easy

        /*

        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        int maxWealth = wealthCheck(accounts);
        System.out.println(maxWealth);

         */
    }

    private static int wealthCheck(int[][] accounts) {
        int winner = 0;
        for (int row = 0; row < accounts.length; row++) {
            int max = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                max = max + accounts[row][col];
            }
            if(max > winner){
                winner = max;
            }
        }
        return winner;
    }

    private static int checkDigits(int[] nums) {
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int even = 0;
            while(temp > 0){
                even++;
                temp = temp / 10;
            }
            if(even % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
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
