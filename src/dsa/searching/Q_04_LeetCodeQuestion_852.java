package dsa.searching;
/*
    Peak index in a Mountain Array.

    let's call an array arr a mountain if the following properties hold.
    -- array.length>=3
    -- there exist some i with 0 < i < arr.length -1 such that:
        * arr[0]< arr[1]< arr[2]<....arr[i-1]< arr[i]
        * arr[i]> arr[i+1]> arr[2]>.... >arr[arr.length - 1]

    given an integer array arr that is guaranteed to be a mountain, return any i
    such that arr[0]<arr[1]<......arr[i-1]<arr[i]>arr[i+1]>.....>arr[arr.length-1]

    Example:
           Input: arr = [0,1,0]
           output: 1

    link: https://leetcode.com/problems/peak-index-in-a-mountain-array/

 */

public class Q_04_LeetCodeQuestion_852 {
    public static void main(String[] args) {
        // will do it later
        int[] arr = {0,1,2,8,5,6,4};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){

            int mid = start + (end-start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else{
                start = mid+1; // we know that mid+1 is greater than mid value
            }
        }
        return end;
    }
}
