package dsa.arrays;

import java.util.Arrays;

public class PassingArrayInFunctions {
    // creating a function change in this class
    static void change(int[] arr ){
        arr[0]=99;
    }

    // main method of this class
    public static void main(String[] args) {
        int[] nums ={3,4,5,13};
        // Printing nums array before applying method change();
        System.out.println("Printing nums array before applying method change()");
        System.out.println(Arrays.toString(nums));
        System.out.println();

        // calling change method on nums array.
        change(nums);

        // Printing the array after calling change() method.
        System.out.println("Printing the array after calling change() method.");
        System.out.println(Arrays.toString(nums));
    }
}
