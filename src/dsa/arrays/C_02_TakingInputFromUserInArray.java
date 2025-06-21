package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C_02_TakingInputFromUserInArray {
    public static void main(String[] args) {
        // Creating Scanner Object to take input from user
        Scanner in = new Scanner(System.in);

        // array of primitives datatypes.
        int[] arr = new int[5];

        // input using for loop from user

        for (int i=0; i< arr.length; i++){
            arr[i]= in.nextInt();
        }


        // printing all the values of arr using enhanced for loop

        for(int num:arr){ // for every element in array, print the element.
            System.out.print(num + " "); // here num represent element of arr array.
        }
        System.out.print(" -> using enhanced for loop");
        System.out.println(); // doing nothing it only makes new line for print

        // printing using Array class toString method.
        System.out.print(Arrays.toString(arr));
        System.out.print(" -> Using toString method of Arrays Class");


        // Array of Objects
        String[] str = new String[4];
        for (int i = 0; i<str.length; i++){
            str[i]=in.next();
        }

        // printing the value of the array
        System.out.println(Arrays.toString(str));

    }
}
