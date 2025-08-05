package dsa.mathematics;

/*
    Finding given number is power of two or not
    Example:
        Input:4
        Output: true
    Explanation: here 4 is the 2^2 show returning true.
 */

public class C_06_PowerOfTwoOrNot {
    public static void main(String[] args) {
        int number = 0;
        System.out.println(isPowerOfTwo(number));
    }
    private static boolean isPowerOfTwo(int number){
        if (number==0){
            return false;
        }
        return (number & (number-1))==0;
    }
}
