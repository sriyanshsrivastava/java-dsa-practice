package dsa.searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C_01_LinearSearch {
    public static void main(String[] args) {
        // Linear Search says Search Starting from first element until you find your desired result

        int[] arr = {23,4,65,69,47,10,1,9,0,50};
        System.out.println(Arrays.toString(arr));

        System.out.println(linearSearch(arr,100));

    }
    // linear search Function.
    static int linearSearch(int[] array,int target){
        if(array.length==0){
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
        // run a for loop
        for(int index=0; index<array.length;index++){
            if(array[index]==target){
                return index;
            }
        }
        // if not found in array return -1
        return -1;
    }
}
