package dsa.sorting;
/*
    Missing Number

    ** Previously asked in Amazon

    Given an array nums containing n distinct numbers in the range [0,n], return the only number
    in the range that is missing form the array.

    Follow Up: could you implement a solution using only O(1) extra space complexity and O(n)
    run time complexity?

    Example 1:
        Input: nums = [3,0,1]
        Output: 2
        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
        2 is the missing number in the range since it does not appear in nums.

    Link:https://leetcode.com/problems/missing-number/

 */

public class Q_01_LeetcodeQuestion_268 {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        System.out.println(missingNumber(arr));

    }

    public static int missingNumber(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correctIndex = nums[i];
            if (nums[i]<nums.length && correctIndex != i){
                C_02_SelectionSort.swap(nums, i,correctIndex);
            }else{
                i++;
            }
        }

        // search for the first missing number
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }

        // case 2 when missing number is the last one
        return nums.length;
    }
}
