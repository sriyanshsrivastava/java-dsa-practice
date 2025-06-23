package dsa.searching;

import java.util.Arrays;

public class Q_01_SearchInRange {
    public static void main(String[] args) {
        int[] arr = {7,9,54,26,48,10,3,57};
        int[] empty ={};

        // printing the whole array
        System.out.println(Arrays.toString(arr));

        // searching target value in the range.
        int searchIndex = searchInRange(arr,8,1,5);

        // printing searchIndex
        System.out.println("Element is present at Index: "+searchIndex);

        // try catch block for exception handling.

        try{
            int result = searchInRange(arr,48,1,7);
            System.out.println("Element is present at Index: "+result);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Something went wrong.");
        }finally {
            System.out.println("Thank you !!!");
        }

    }

    // write a function who search a target value in integer array in given range.
    static int searchInRange(int[] array, int target,int start, int end){
        // throwing exception when array is Empty.
        if(array.length==0){
            throw new IllegalArgumentException("Array is empty.");
        }

        // checking start, end index is valid or not and throwing exception.
        if( start < 0 || end > array.length || start > end){
            throw new ArrayIndexOutOfBoundsException("Custom error: check the index values.");
        }

        // Searching logic
        for(int index=start;index<=end;index++){
            if(array[index]==target){
                return index; // returns index if target is found.
            }
        }
        return -1; // returning -1 if target is not found in the array Range.
    }
}
