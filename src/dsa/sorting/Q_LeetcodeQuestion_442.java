package dsa.sorting;

/*
    Find all Duplicates in Array

    Given an integer array nums of length n where all integers of nums are
    in rhe range [1,n] and each integer appears once or twice, return an array
    of all the integers that appears twice.

    you must write an algorithm that runs in O(n) time and uses only constant
    extra space.

    Example:
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [2,3]

    Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */

import java.util.ArrayList;
import java.util.List;

public class Q_LeetcodeQuestion_442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDuplicates(arr);
        System.out.println(result);

    }

    public static List<Integer> findDuplicates(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i] - 1;
            if (array[i] != array[correctIndex]) {
                Utility.swap(array, i, correctIndex);
            } else {
                i++;
            }
        }
        List<Integer> resultList = new ArrayList<>();
        for (int j = 0; j < array.length; j++) {
            if (array[j] != j + 1) {
                resultList.add(array[j]);
            }
        }
        return resultList;
    }
}