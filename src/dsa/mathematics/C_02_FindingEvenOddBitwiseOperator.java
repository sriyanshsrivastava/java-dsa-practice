package dsa.mathematics;

/*
    Question: Given a number n find if it is odd or even. Use Bitwise operator.
    Point: Every number is calculated in binary form internally.

 */

public class C_02_FindingEvenOddBitwiseOperator {
    public static void main(String[] args) {
        System.out.println(findEvenOdd(10));
        System.out.println(findEvenOdd(7));

    }

    static String findEvenOdd(int n){
        return (n&1)==1?"Odd":"Even";
    }
}
