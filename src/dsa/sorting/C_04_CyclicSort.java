package dsa.sorting;

import java.util.Arrays;

/*
 * ================================
 *  CYCLIC SORT - CONCEPT EXPLAINED
 * ================================
 *
 * Cyclic sort is a very efficient in-place sorting algorithm
 * particularly designed for arrays containing numbers in a
 * specific range — typically 1 to n or 0 to n-1 without duplicates.
 *
 * The idea is:
 * ----------------------------
 * - Each number ideally belongs at index (number - 1) if range is 1..n
 *   or at index (number) if range is 0..n-1.
 * - The algorithm places each element at its correct index
 *   by repeatedly swapping it with the element at its target position.
 * - It cycles misplaced elements into their correct spots
 *   with minimal passes over the array.
 *
 * Why is it called "cyclic" sort?
 * ----------------------------
 * Because during the swaps, elements move in cycles
 * toward their correct positions — forming a cycle of moves
 * that fixes multiple positions with minimal work.
 *
 * ==========================
 *  CHARACTERISTICS:
 * ==========================
 * - Time Complexity: O(n)
 *   Every element is moved at most once into its place.
 * - Space Complexity: O(1)
 *   It is an in-place sorting algorithm with no extra space used.
 * - Best suited for:
 *     * Arrays of integers in known fixed ranges.
 *     * Problems like finding missing numbers, duplicates, etc.
 *
 * ==========================
 *  BASIC EXAMPLE:
 * ==========================
 * Array: [3, 1, 2, 4]
 *
 * Step-by-step:
 * 1. i=0
 *    array[0] = 3
 *    correct index = 2
 *    swap array[0] and array[2]
 *    Result: [2, 1, 3, 4]
 *
 * 2. array[0] = 2
 *    correct index = 1
 *    swap array[0] and array[1]
 *    Result: [1, 2, 3, 4]
 *
 * 3. array[0] = 1
 *    at correct index
 *
 * 4. Repeat for i=1,2,3 — all in place.
 *
 * ==========================
 *  FINAL RESULT:
 *  Sorted array = [1, 2, 3, 4]
 *
 * ==========================
 *  PSEUDO-CODE:
 * ==========================
 * for i from 0 to n-1:
 *     while array[i] is not at correct position:
 *         swap array[i] with array[array[i] - 1]
 *
 * ==========================
 *  NOTE:
 * ==========================
 * - Works only when numbers are in the known fixed range
 *   without gaps if you're expecting a complete range.
 * - Can be adapted to variations that handle duplicates,
 *   missing numbers, etc.
 *
 * ==========================
 *  ADVANTAGES:
 * ==========================
 * - Simple to implement.
 * - Extremely efficient (linear time) for its use case.
 * - Great for interview questions about array manipulation.
 *
 */

public class C_04_CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSearch(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void cyclicSearch(int[] array){
        int i =0;
        while (i < array.length){
            int correct = array[i]-1;
            if(array[i]!=array[correct]){
                C_02_SelectionSort.swap(array, i, correct);
            }else{
                i++;
            }
        }
    }

}
