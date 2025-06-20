package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 2-D array looks like below
        // it means array of arrays.
        /*
            1 2 3
            4 5 6
            7 8 9

         */

        // Syntax of 2D-array

        //int[][] arr = new int[3][]; // specifying column is not required. yet you can specify it.
        int[][] arr2D ={
                {1,2,3},    // no of column - 3
                {4,5},      // no of column - 2
                {6,7,8,9}   // no of column - 4 these are not fixed or same.
        };

        // input
        // Scanner object creation
        Scanner sc = new Scanner(System.in);

        // for loop to input values using user input
        // I don't want to use this because everytime programs runs
        // we have to manually inter all the value everytime.

        /*
        for (int i =0; i<arr2D.length;i++){
            // for each column in each row
            for(int j=0; j<arr2D[i].length;j++){
                arr2D[i][j]=sc.nextInt();
            }
        }
         */

        // all value using random() method of inbuilt class Math
        // here we are updating all the default value. because we already defined
        // and filled all the value when it initiated.

        // for each row in the array
        for (int row =0; row<arr2D.length;row++){
            // for each column in each row
            for(int col=0; col<arr2D[row].length;col++){
                arr2D[row][col] = (int)(Math.random()*100); // assigning random value of two digits
            }
        }

        // printing all the values of the arr2D

        System.out.println("Printing using enhanced for loop.");

        for(int[] row: arr2D){
            for(int num: row){
                System.out.print(num+" ");
            }
            System.out.println(); // moves printing cursor to new line
        }



        // Printing using toString() method

        System.out.println("Printing using toString() Method.");

        for(int[] row: arr2D){
            System.out.println(Arrays.toString(row));
        }

    }
}
