package dsa.searching;

public class C_06_floorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        System.out.println(floor(arr,target));

    }

    // Return the index: greatest number which is smaller than target if target is not present in the array.
    static int floor(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        while(start<=end){
            int mid = start + (end-start) / 2;

            if(target < array[mid]){
                end = mid-1;
            } else if (target > array[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
