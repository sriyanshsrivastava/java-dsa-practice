package dsa.sorting;
import java.util.Arrays;

/*
    Bubble Sort: Concept and Implementation

    Concept:
    - Bubble Sort is a simple comparison-based sorting algorithm.
    - It works by repeatedly swapping adjacent elements if they are in the wrong order.
    - In each pass through the array, the largest unsorted element "bubbles up" to its correct position at the end.
    - This process is repeated until the list is sorted.

    How it works:
    1. Compare each pair of adjacent elements in the array.
    2. Swap them if they are in the wrong order.
    3. After each full pass, the largest remaining unsorted element is placed at its correct sorted position.
    4. Continue the process for the remaining unsorted portion of the list.

    Time Complexity:
    - Worst case: O(n^2)
    - Best case (already sorted): O(n)
    - Space complexity: O(1) (in-place)

    Optimization:
    - If no swaps are made during a pass, the list is already sorted, and we can stop early.

    Use case:
    - Simple to implement and understand.
    - Not suitable for large datasets due to poor performance.

    Implementation below follows the optimized version with early exit.

 */

public class C_01_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2,0,8,6,7,13,16,25,40,13};
        // in above array there is multiple 13 which is at index 9, and 13
        // so in sorted array order of 13 will be maintained like above means
        // 13 at index 9 will be before of 13 of index 13 this concept is known as stability.
        int[] result = bubbleSort(arr);
        int[] result2 = optimizedBubbleSort(arr);
        System.out.println("Normal Code Bubble Sort: "+Arrays.toString(result));
        System.out.println("Optimized Code Bubble Sort: "+Arrays.toString(result2));
    }

    // bubble sort logic
    public static int[] bubbleSort(int[] array){
       int temp = 0; // temp variable to swap the value
       for(int i=0; i<array.length;i++) { // loop running to the length of array
           for (int j=0; j<array.length-i-1;j++){ // loop running only till value is not sorted. means
                                                  // it will run -1 times of its length in each iteration because,
                                                  // last element is already sorted.
               if(array[j]>array[j+1]){  // checking swaping condition if previous is less than next then swap.
                   temp = array[j];
                   array[j] = array[j+1];
                   array[j+1]=temp;
               }
           }
       }
       return array;
    }

    // more optimized code of bubble sort.
    public static int[] optimizedBubbleSort(int[] array) {
        int temp;
        boolean swapped;

        for (int i = 0; i < array.length; i++) {
            swapped = false;

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps were made in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        return array;
    }
}
