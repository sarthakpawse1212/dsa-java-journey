/*
 * ==========================================
 *              BINARY SEARCH
 * ==========================================
 *
 * Definition:
 * Binary Search is an efficient searching algorithm that finds
 * the position of a target element in a sorted array by repeatedly
 * dividing the search interval into two halves.
 *
 * Important:
 * - The array must be sorted.
 * - Works with both ascending and descending sorted arrays.
 * - Each iteration eliminates half of the remaining search space.
 *
 * How it works (Ascending Order):
 *
 * 1. Initialize two pointers:
 *    start = 0
 *    end = array.length - 1
 *
 * 2. Calculate the middle index:
 *    mid = start + (end - start) / 2
 *
 *    Why not (start + end) / 2?
 *    - Adding start and end directly may cause integer overflow
 *      if their sum exceeds the maximum int value.
 *    - The safer formula calculates the difference first and
 *      adds half of it to start.
 *
 * 3. Compare the target with the middle element:
 *    - If target == arr[mid], the element is found.
 *    - If target > arr[mid], search the right half:
 *      start = mid + 1
 *    - If target < arr[mid], search the left half:
 *      end = mid - 1
 *
 * 4. Repeat until the element is found or:
 *    start > end
 *    This means the target element is not present.
 *
 * Order-Agnostic Binary Search:
 *
 * A variation of Binary Search that works without knowing
 * whether the array is sorted in ascending or descending order.
 *
 * 1. Identify the sorting order:
 *    - If arr[start] < arr[end], array is ascending.
 *    - If arr[start] > arr[end], array is descending.
 *
 * 2. Based on the sorting order, change the comparison conditions:
 *
 *    Ascending:
 *    - target > arr[mid] -> search right.
 *    - target < arr[mid] -> search left.
 *
 *    Descending:
 *    - target < arr[mid] -> search right.
 *    - target > arr[mid] -> search left.
 *
 *    The main algorithm remains the same; only the comparison
 *    conditions change.
 *
 * Time Complexity:
 *
 * Case          Complexity       Explanation
 * ---------------------------------------------------------
 * Best Case     O(1)             Target is found at the middle
 *                                in the first comparison.
 *
 * Average Case  O(log n)         Search space is halved
 *                                in every iteration.
 *
 * Worst Case    O(log n)         Target is found after multiple
 *                                iterations or is not present.
 *
 * Space Complexity:
 * O(1) - Iterative Binary Search uses constant extra space.
 *
 * Important:
 * - Binary Search is much faster than Linear Search for
 *   large sorted datasets.
 * - It reduces the search space by half in every iteration.
 * - If the array is not sorted, Binary Search cannot be
 *   directly applied.
 *
 * ==========================================
 */


package dsa.array;

public class BinarySearchAlgo {
    public static void main(String[] args) {

        // Normal Binary search for ascending order arr
        int[] arr = {1, 3, 5, 12, 24, 35, 48};
        int target = 35;

        int index = binarySearch(arr, target);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
