package dsa.sorting;

import java.util.Arrays;

/*
    Selection Sort: Concept, Working, and Algorithm

    Concept:
    - Selection Sort is a simple, comparison-based sorting algorithm.
    - It divides the array into two parts:
      1. The sorted part (initially empty)
      2. The unsorted part (initially the whole array)
    - In each iteration, the algorithm selects the smallest (or largest) element
      from the unsorted part and swaps it with the first element of the unsorted part.
    - As a result, the sorted part grows one element at a time from left to right.

    How It Works (Ascending Order):
    1. Start from index 0. Assume it's the minimum index.
    2. Scan the rest of the array to find the actual minimum element.
    3. Swap the current element with the found minimum.
    4. Move to the next index and repeat steps 1–3 until the end.

    Example:
    Input: [5, 2, 8, 1, 3]

    Pass 1:
    - i = 0 → Assume 5 is minimum
    - Compare with 2 → 2 < 5 → update min
    - Compare with 8 → skip
    - Compare with 1 → 1 < 2 → update min
    - Compare with 3 → skip
    - Swap 5 and 1 → [1, 2, 8, 5, 3]

    Pass 2:
    - i = 1 → Assume 2 is min
    - 2 is already the smallest → no swap → [1, 2, 8, 5, 3]

    Pass 3:
    - i = 2 → Assume 8 is min
    - Compare with 5 → 5 < 8 → update min
    - Compare with 3 → 3 < 5 → update min
    - Swap 8 and 3 → [1, 2, 3, 5, 8]

    Remaining passes do nothing (array is sorted)

    Key Properties:
    - Time Complexity:
      - Best Case: O(n^2)
      - Worst Case: O(n^2)
      - Not adaptive (doesn’t improve on partially sorted arrays)
    - Space Complexity: O(1) → Sorts in-place
    - Stable: ❌ Not stable by default
      (equal elements may be reordered unless extra care is taken)

    Use Cases:
    - Good for small datasets or when memory is very limited
    - Easy to implement and understand
*/


public class C_02_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2,8,23,1,6,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    // Selection sort Algorithm
    static void selectionSort(int[] array){
        for(int i=0; i<array.length;i++){
            // find the max item in the remaining array and swap with correct index
            int last = array.length-1-i;
            int max = getMaxIndex(array,0, last);
            swap(array,max,last);
        }
    }

    // method to swap values in the given array.
    public static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    // method to get maximum index
    private static int getMaxIndex(int[] array, int start,int end){
        int max= start;
        for(int i=start; i<=end;i++){
            if(array[max] < array[i]){
                max = i;
            }
        }
        return max;
    }
}
