package dsa.sorting;

/*
 ============================================================================
 📚 Insertion Sort - Full Conceptual Explanation
 ============================================================================
 🧠 What is Insertion Sort?
 ---------------------------
 Insertion Sort is a simple sorting algorithm that works much like the way
 you sort playing cards in your hands.

 You pick one card at a time from the unsorted set, and insert it into the
 correct position in the already sorted part of your hand.

 Similarly, in insertion sort, we divide the array into two parts:
   - The LEFT part is sorted.
   - The RIGHT part is unsorted.
 We pick elements from the unsorted part and insert them into the correct
 position in the sorted part.

 ============================================================================
 🔧 How It Works – Step-by-Step
 -------------------------------
 Let's say we have an array: [5, 2, 4, 6, 1, 3]

 Step 1:
   Sorted part: [5]
   Unsorted part: [2, 4, 6, 1, 3]
   - Take 2, compare with 5
   - Since 2 < 5, shift 5 to the right
   - Insert 2 at position 0
   => Array becomes: [2, 5, 4, 6, 1, 3]

 Step 2:
   Take 4, compare with 5 → shift 5
   Compare 4 with 2 → no shift
   Insert 4 at correct position
   => Array becomes: [2, 4, 5, 6, 1, 3]

 Step 3:
   6 is already in the correct position
   => Array remains: [2, 4, 5, 6, 1, 3]

 Step 4:
   Take 1, shift 6, 5, 4, 2
   Insert 1 at position 0
   => [1, 2, 4, 5, 6, 3]

 Step 5:
   Take 3, shift 6, 5, 4
   Compare with 2 → no shift
   Insert at position 2
   => [1, 2, 3, 4, 5, 6]

 Final Result:
   Sorted Array: [1, 2, 3, 4, 5, 6]

 ============================================================================
 🔄 Internal Logic (Pseudocode Style)
 -------------------------------------
 for i from 1 to n-1:
     key = array[i]
     j = i - 1
     while j >= 0 and array[j] > key:
         array[j+1] = array[j]
         j--
     array[j+1] = key

 ============================================================================
 🧮 Time Complexity
 ------------------
 Best Case (Already Sorted):        O(n)
 Average Case (Random Order):       O(n²)
 Worst Case (Reverse Sorted):       O(n²)

 - Best case occurs when the array is already sorted; no shifting needed.
 - Worst case occurs when each element is smaller than the previous one.

 ============================================================================
 📦 Space Complexity
 -------------------
 Space: O(1)
 - In-place algorithm: No extra array or memory is used
 - Only a few extra variables are used

 ============================================================================
 ⚙️ Characteristics
 -------------------
 ✅ Stable Sorting Algorithm
    - Maintains the relative order of equal elements

 ✅ Adaptive
    - Performs better on nearly sorted data (less shifting)

 ✅ Simple and Easy to Understand
    - Great for learning basic sorting concepts

 ❌ Not Efficient on Large Lists
    - Because of O(n²) time in worst and average cases

 ============================================================================
 🧰 When Should You Use It?
 ---------------------------
 ✔ When working with small datasets
 ✔ When input data is already partially sorted
 ✔ In embedded systems with memory constraints
 ✔ For educational or interview purposes
 ✔ As a helper in more complex hybrid sorting algorithms (like TimSort)

 ============================================================================
 🧠 Tips to Remember
 --------------------
 - Think of inserting each element into a growing sorted list.
 - Shift larger elements to the right to make room for insertion.
 - It’s like sorting playing cards manually.
 - More efficient than bubble sort, especially for nearly sorted data.

 ============================================================================
 ✅ Summary
 ----------
 Insertion Sort is a beginner-friendly, intuitive sorting algorithm with
 decent performance for small or nearly sorted datasets. It teaches key
 concepts like in-place sorting, shifting elements, and stepwise growth
 of a sorted list.

 Even though it's not used for large datasets in practice, it forms the
 foundation of understanding for more advanced algorithms.

 ============================================================================
*/


import java.util.Arrays;

public class C_03_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10,5,1,18,45,0,7};
        int[] arr2 = {10,5,1,18,45,0,7};
        insertionSort1(arr);
        insertionSort2(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }

    // logic -1, inner while loop implementation (More efficient)
    public static void insertionSort1(int[] array){
        int n = array.length;
        for (int i = 1; i < n;i++){
            int j = i-1;
            int key = array[i];
            while(j>=0 && array[j]>key){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    // logic -2, inner for loop implementation (Less Efficient)
    public static void insertionSort2(int[] array){
        for (int i =0;i <array.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(array[j]< array[j-1]){
                    Utility.swap(array,j,j-1); // using swap() method from Utility Class.
                }else{
                    break;
                }
            }
        }
    }
}
