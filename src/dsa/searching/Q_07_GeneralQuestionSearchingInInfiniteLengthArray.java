package dsa.searching;
/*
    Find position of an element in a sorted array of infinite number.

    Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
    Source: Amazon interview Experience.
    Since array is sorted, the first thing clicks into mind is binary search, but the problem her is that we don't know
    size of array.

    if the array is infinite, that means we don't have proper bounds to apply binary search algorithm.
    Let low be pointing to first element and high pointing to 2nd element fo array, now compare
    key with high index element,

    -> if it is greater than high index element then copy high index in low index and double the high
        index.
    -> if it is smaller, than apply binary search on high and low indices found.

 */

/*
      Concept: Search in Infinite Sorted Array

      In an infinite length array, we can't use the typical binary search directly
      because we don't know the end index. So we use a two-phase approach:

      1. Range Finding (Exponential Search Phase):
         - Start with a small window (e.g., start = 0, end = 1).
         - Repeatedly double the window size (end = end * 2) until:
           target <= arr[end], or we reach the end of accessible data.
         - This ensures the target lies within the range [start, end].

      2. Binary Search Phase:
         - Apply standard binary search between indices start and end
           to find the actual position of the target.

      This method is efficient for large or infinite arrays because it:
         - Narrows down the search space quickly (logarithmic range finding),
         - Then uses binary search (log n) within that space.

      Assumption: The array is sorted in ascending order.

 */

public class Q_07_GeneralQuestionSearchingInInfiniteLengthArray {
    public static void main(String[] args) {

        int[] arr = {3,5,7,9,10,100,130,140,160,170,180,182,190,200}; // suppose this is infinite length array.
        int ans = infiniteArraySearch(arr,10);
        System.out.println(ans);


    }
    static int infiniteArraySearch(int[] array,int target){
        // first find the range
        // first start with a box size 2.

        int start=0;
        int end = 1;

        // condition for the target to lie in the range.
        while(target > array[end]){

            int newStart = end + 1;
            end = end + (end- start + 1)*2;
            start = newStart;
        }
        return binarySearchWithStartEndIndex(array,target,start,end);
    }

    // we can not use array.length here because we don't know the size of array (its infinite).

    public static int binarySearchWithStartEndIndex(int[] array,int target, int start, int end){
        // we are not initiating start and end index here
        // we are taking from the user using this function
        // in this case infiniteArraySearch() method is responsible to pass start and end.
        while(start<=end){
            int mid = start +(end-start)/2;
            if (target < array[mid]) {
                end = mid-1;
            } else if (target > array[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
