package dsa.searching;

/*
    Order agnostic binary search will work when we don't know
    how the array is sorted ascending or descending? we are not sure only
    we know that array is sorted.
    then we apply agnostic binary search to get the result.

    --first we check how array is sorted ?
    --then we apply different logic to sift the pointer start and end
    -- if array is sorted in ascending manner
       * then we know that we sift start when target is greater than mid-value.
       * and we sift end when target is lower than mid-value.

    -- if the array is sorted in descending manner.
       -- then we do just opposite of the above.
       * we sift end when target is lower than middle value.
       * we sift start when target is greater than middle value.
 */

public class C_05_OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // creating a integer array in ascending order and searching element 22.
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45};
        int target = 22;
        int ans = orderAgnosticBinarySearch(arr,target);
        System.out.println("Your target value is at index: "+ans);

        // creating an integer array in descending order and searching element -4.
        int[] arrDes = {100,34,20,15,10,5,0,-4,-5,-10};
        int targetDes = 0;
        int ansDes = orderAgnosticBinarySearch(arrDes,targetDes);
        System.out.println("Your target value is at index: "+ansDes);

    }

    static int orderAgnosticBinarySearch(int[] array,int target){
        int start=0;
        int end = array.length-1;

        // find weather the array is sorted in ascending or descending.
        boolean isAsc = array[start]<array[end];

        while(start<=end){
            // find the middle element.
            // int mid = (start+end)/2;
            // might be possible start+end exceed the range of int in java.
            // then we get error.
            int mid = start + (end-start) / 2; // this will be better option.

            if(array[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target < array[mid]){
                    // sifting the end pointer before the mid-index.
                    end = mid - 1;
                }else {
                    // shifting start pointer to after the mid-index.
                    start = mid + 1;
                }
            }else{
                if(target > array[mid]){
                    // sifting the end pointer before the mid-index.
                    end = mid - 1;
                }else {
                    // shifting start pointer to after the mid-index.
                    start = mid + 1;
                }
            }

        }
        return -1; // return -1 if loop completed and not found the target value.
    }
}
