package dsa.sorting;
/*
    Find all the Numbers Disappeared in an Array

    Given an array nums of n integers where nums[i] is in the range [1,n],
    return an array of all the integers in range [1,n] that do not appear in nums.

    Example:
        Input: nums =[4,3,2,7,8,2,3,1]
        Output: [5,6]

    Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 */

// solution

/*
    Logic Explanation: Cyclic Sort Approach

    Problem:
    Given an array of length n, with elements in [1, n] (some may be missing or duplicated),
    find all numbers in [1, n] that do not appear in the array.

    Example:
      Input:  [4,3,2,7,8,2,3,1]
      Output: [5,6]

    Core Idea:
      Each number in [1, n] "wants" to be at index (number - 1).
      For example:
        1 should be at index 0
        2 should be at index 1
        ...
        n should be at index n - 1

    Steps:
      1. Iterate through the array.
         - For each index i, check if the current number is in its correct position.
         - If not, swap it with the number at its correct position.
         - Repeat until the number at i is correct or is a duplicate in the correct spot.

      2. After this process, the array will have most elements in the form:
           index -> value
           0     -> 1
           1     -> 2
           ...
           But missing numbers will leave incorrect values in their positions.

      3. Finally, iterate through the array again:
         - For any index j where array[j] != j + 1,
           we know that (j + 1) is missing.

    Why it works:
      - We rearrange the array in-place so each number moves toward its target index.
      - Duplicates stay stuck, creating "holes" where a number is missing.
      - These holes identify the missing numbers.

    Time Complexity: O(n)
      - Each element can move at most once to its correct position.
    Space Complexity: O(1) extra space (excluding output list)
*/

// Code implementation


import java.util.ArrayList;
import java.util.List;

public class Q_02_LeetcodeQuestion_448 {
    public static void main(String[] args) {
        int[] array = {7,3,2,4,8,2,3,1};
        List<Integer> answer = findDisappearedNumbers(array);
        System.out.println(answer);

    }

    public static List<Integer> findDisappearedNumbers(int[] array) {
        int i = 0;
        List<Integer> answer = new ArrayList<>();
        while (i < array.length) {
            int correctValueAtIndex = array[i] - 1;
            if (array[i]>=1 && array[i] <= array.length && array[i] != array[correctValueAtIndex]) {
                Utility.swap(array, i, correctValueAtIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] != j+1) {
                answer.add(j+1);
            }
        }
        return answer;
    }
}