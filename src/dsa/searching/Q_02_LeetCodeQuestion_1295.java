package dsa.searching;

/*
    Given an array "nums" of integer, return how many of them
    contain and even number of digits.

    Example:
        - Input : nums = [12,345,2,6,7896]
        - Output : 2
        - Explanation:
                 12 contains 2 digit (even number of digits.)
                 344 contains 3 digit (odd number of digits.)
                 2 contains 1 digit (odd number of digits.)
                 6 contains 1 digit (odd number of digits.)
                 7896 contains 4 digit (even number of digits.)

                 Therefore, only 12 and 7896 contains an even number of
                 digits to total number of such numbers is 2, which is our
                 output.

     Link : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
 */

public class Q_02_LeetCodeQuestion_1295 {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num:nums){
            if(evenDigitWithStringLength(num)){ // we can also use evenDigitWithWhileLoop() both will give the answer.
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even number of digit or not?
    private static boolean evenDigitWithWhileLoop(int num){
        // checking using while loop, the number of digits is even or not?
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count%2==0; // returning the value based on the condition in one line because it gives boolean value.
        // we can also achieve this using changing number to string and taking its length.
        // let's implement that below.
    }

    private static boolean evenDigitWithStringLength(int num){
        String s = Integer.toString(num);
        return s.length()%2==0;
    }
}
