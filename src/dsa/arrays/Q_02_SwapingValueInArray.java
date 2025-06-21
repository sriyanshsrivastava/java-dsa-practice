package dsa.arrays;

import java.util.Arrays;

public class Q_02_SwapingValueInArray {
    public static void main(String[] args) {
        int[] arr = {3,4,7,0,100};

        // printing value before swap
        System.out.println(Arrays.toString(arr));

        // swaping value of index 0 with index 4
        swap(arr,0,4);

        // printing after swap
        System.out.println(Arrays.toString(arr));

        // reversing the array arr.
        // before reverse
        System.out.println(Arrays.toString(arr));
        // reversing the array
        reverse(arr);
        // printing after reversing the array
        System.out.println(Arrays.toString(arr));


    }
    // write a function to swap any index with given index value.
    public static void  swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // write function to reverse the array elements

    public static void reverse(int[] array){
        int startIndex = 0;
        int endIndex = array.length -1;
        while(startIndex<endIndex){
            swap(array,startIndex,endIndex);
            startIndex++;
            endIndex--;
        }
    }
}
