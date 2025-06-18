package dsa.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        // Array to sort, and Required Variables

        int[] nums = {6, 5, 2, 8, 9, 4};
        int size = nums.length;
        int temp =0;
        int minIndex = -1;

        // Printing whole array before sorting.

        System.out.println("Before Sorting");
        for(int num:nums){
            System.out.print(num + " ");
        }

        // Selection sort logic

        for(int i=0;i < size-1;i++){
            minIndex=i;
            for(int j=i+1; j<size;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;

            // printing intermediate steps
            System.out.println();
            for(int num:nums){
                System.out.print(num + " ");
            }

        }

        // Printing Sorted array.
        System.out.println();
        System.out.println("After Sorting");
        for(int num:nums){
            System.out.print(num + " ");
        }
    }
}
