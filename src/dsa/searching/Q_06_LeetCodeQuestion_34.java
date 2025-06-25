package dsa.searching;

/*
    Find first and Last position of element in Sorted array.

    Given an array of integers nums sorted in ascending order, find the starting and ending position of
    given target value.

    if target is not found in array , return [-1,-1]
    You must write an algorithm with O(logN) runtime complexity.

    Example:
          Input: nums = [5,7,7,8,8,10], Target = 8
          output: [3,4]

    Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */

import java.util.Arrays;

public class Q_06_LeetCodeQuestion_34 {
    public static void main(String[] args) {

        int[] nums = {5,7,7,7,7,7,8,8,10};
        int[] answer = new int[2];
        answer = searchRange(nums,8);
        System.out.println(Arrays.toString(answer));

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] answer = {-1,-1};

        int start =search(nums,target,true);
        int end =search(nums,target,false);

        answer[0] = start;
        answer[1] = end;
        return answer;

    }

    static int search(int[] array,int target,boolean findStartIndex){
        int ans = -1;

        int start = 0;
        int end = array.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < array[mid]){
                end = mid-1;
            } else if (target > array[mid]) {
                start = mid+1;

            }else{
                ans=mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = start + 1;
                }
            }
        }
        return ans;
    }

}
