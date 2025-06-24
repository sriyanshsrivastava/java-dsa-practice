package dsa.searching;

/*
 * Concept: Binary Search Algorithm
 *
 * - Binary Search is an efficient algorithm for finding a target element
 *   in a **sorted array** or list.
 *
 * - It works on the principle of divide and conquer.
 *
 * - The array is repeatedly divided into two halves by comparing the
 *   middle element with the target value.
 *
 * - Based on the comparison:
 *     → If target == middle element → return the index (found).
 *     → If target < middle element → search the left half.
 *     → If target > middle element → search the right half.
 *
 * - This process continues until the element is found or the search space is empty.
 *
 * Requirements:
 * - The input array must be sorted (ascending or descending depending on implementation).
 *
 * Time Complexity: O(log n)
 * Space Complexity:
 *     → Iterative version: O(1)
 *     → Recursive version: O(log n) due to call stack
 *
 * Advantage:
 * - Much faster than linear search for large sorted datasets.
 */


public class C_04_BinarySearch {
    // driver function main()
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45};
        int target = 22;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    // Binary Search algorithm logic and code.
    // return the index of target.
    // return -1 if it does not exist.
    static int binarySearch(int[] array, int target){
        int start=0;
        int end = array.length-1;

        while(start<=end){
            // find the middle element.
            // int mid = (start+end)/2;
            // might be possible start+end exceed the range of int in java.
            // then we get error.
            int mid = start + (end-start) / 2; // this will be better option.

            if(target < array[mid]){
                // sifting the end pointer before the mid-index.
                end = mid - 1;
            }else if(target > array[mid]){
                // shifting start pointer to after the mid-index.
                start = mid + 1;
            }else{
                // answer found
                return mid;
            }
        }
        return -1; // return -1 if loop completed and not found the target value.
    }
}
