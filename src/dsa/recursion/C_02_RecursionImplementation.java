package dsa.recursion;

/*
    Recursion Concepts :-

    Recursion is a programming technique where a function calls itself to solve smaller parts of a problem.
    Think of it like standing in front of two mirrors – the reflection keeps repeating into smaller versions of you.

    Analogy:
    Imagine you are stacking plates. To clean them, you pick the top one, clean it, then move to the next.
    Similarly, in recursion:
    1. You solve the current (simple) part of the problem.
    2. You hand over the rest of the work to a smaller version of yourself (function calls itself).
    3. Once the simplest case (base case) is reached, you stop (just like no plates left to clean).
    4. Then everything unwinds backwards, returning from each function call.

    In this code:
    - The function `print(n)` prints the value of `n`.
    - It keeps calling itself with `n+1` until `n == 5`.
    - When `n` is 5, it prints it and **does not call itself again**, which is the base case.
    - This prevents an infinite loop and allows the program to return cleanly.

*/

public class C_02_RecursionImplementation {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==5){ // checking when n gets =5, and then printing 5 and returning. means terminate function call here.
            System.out.println(n);
            return; // print() above function will terminate here.
        }
        System.out.println(n);
        print(n+1); // function calling itself, calling function itself is recursion in programming.
    }
}
