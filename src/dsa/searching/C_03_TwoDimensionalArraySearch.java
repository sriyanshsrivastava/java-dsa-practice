package dsa.searching;

import java.util.Arrays;

public class C_03_TwoDimensionalArraySearch {
    public static void main(String[] args) {
        int[][] arr ={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        // Printing the array
        for(int[] inerArray: arr){
            System.out.println(Arrays.toString(inerArray));
        }

        System.out.println("------------------------------");

        // Searching target in the two-dimensional Array.
        int target =56;
        int[] result = search(arr,target);
        System.out.println("Target value is located at: "+Arrays.toString(result));

        // finding Max value in the same array.

        int max = maxValue(arr);
        System.out.println("Maximum value in this 2-D array is: "+max);

    }

    // search() method which returns an array which first element gives row and second will give column.
    static int[] search(int[][] array,int target){
        for(int index=0; index<array.length;index++){
            for(int indexInner=0;indexInner<array[index].length;indexInner++){
                if(array[index][indexInner]==target){
                    return new int[]{index,indexInner}; // returning array where first element shows row and second element show column
                }
            }
        }
        return new int[]{-1,-1};
    }

    // max value using enhanced for loop. we can also achieve this using conventional for loop.

    static int maxValue(int[][] array){
        int max = Integer.MIN_VALUE;
        for(int[] row:array){
            for(int num:row){
                if(num>max){
                    max = num;
                }
            }
        }
        return max;
    }
}
