package dsa.sorting;

public class BubbleSort {
    public static void main(String[] args) {

        // Array to sort, and Required Variables

        int[] nums = {6, 5, 2, 8, 9, 4};
        int size = nums.length;
        int temp =0;

        // Printing whole array before sorting.

        System.out.println("Before Sorting");
        for(int num:nums){
            System.out.print(num + " ");
        }

        // Quick sort logic into code.

        for(int i=0; i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j]; // saving value to temp variable
                    nums[j] = nums[j+1]; // swaping value on index
                    nums[j+1] = temp; // saving value on swaped value of next index.
                }
            }
        }

        // Printing Sorted array.

        System.out.println("\nAfter Sorting");
        for(int num:nums){
            System.out.print(num + " ");
        }

    }
}
