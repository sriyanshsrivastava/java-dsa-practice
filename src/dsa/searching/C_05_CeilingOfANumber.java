package dsa.searching;

public class C_05_CeilingOfANumber {
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int target = 15 ;

        System.out.println(ceiling(arr,target));

    }

    // Return the index: smallest number which is greater than target if target is not present in the array.
    static int ceiling(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        while(start<=end){
            int mid = start + (end-start) / 2;

            if(target < array[mid]){
                end = mid-1;
            } else if (target > array[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
