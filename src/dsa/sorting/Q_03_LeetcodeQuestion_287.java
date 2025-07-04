package dsa.sorting;
/*
    Find the Duplicate Number

    Given an array of integers nums containing n+1 integers where each integer is in the range
    [1,n] inclusive.

    There is only one repeated number in nums, return this repeated number.

   You must solve problem without modifying tha array nums and  uses only constant extra space.

   Example:
        Input: nums = [1,3,4,2,2]
        Output: 2
 */

public class Q_03_LeetcodeQuestion_287 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int result = findDuplicate(arr);
        System.out.println(result);
    }

    public static int findDuplicate(int[] array){
        int i =0;
        while(i<array.length){
            int correctIndex = array[i]-1;
            if(array[i] != array[correctIndex]){
                Utility.swap(array,i, correctIndex);
            }else{
                i++;
            }
        }

        for(int j=0; j<array.length;j++){
            if(array[j]!=j+1){
                return array[j];
            }
        }
        return -1;

        // another solution

        // int i = 0;
        // while( i < array.length ){
        //     if(array[i]!=i+1){
        //         int correct = array[i] -1;
        //         if(array[i]!=array[correct]){
        //             Utility.swap(array, i , correct);
        //         }else{
        //             return array[i];
        //         }
        //     }else{
        //         i++;
        //     }
        // }
        // return -1;
    }
}
