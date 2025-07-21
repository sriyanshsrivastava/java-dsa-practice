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

/*
    Why and When Should We Use Recursion:

    ► When to Use Recursion:
    1. When a problem has a **repeating or nested structure**.
    2. When a task can be **broken down into smaller versions of the same task**.
    3. When dealing with **hierarchical or tree-like data** (e.g., XML/JSON, file directories).
    4. When implementing **divide and conquer** algorithms.
    5. When using **backtracking** to explore multiple solutions.

    ► Why Use Recursion:
    1. **Cleaner and simpler code** – Some problems are more naturally expressed using recursion than loops.
    2. **Solves problems where loop logic becomes too complicated** or hard to track.
    3. **Mimics mathematical definitions** (like factorial, Fibonacci, etc.).
    4. Makes algorithms like tree traversals much more readable and intuitive.

    ► Common Examples:
    1. **Mathematical Problems**
       - Factorial: `n! = n * (n-1)!`
       - Fibonacci: `F(n) = F(n-1) + F(n-2)`
       - GCD using Euclidean algorithm

    2. **Tree Traversal**
       - Inorder, Preorder, Postorder traversal of binary trees

    3. **Backtracking Problems**
       - Sudoku Solver
       - N-Queens Problem
       - Generating all permutations or combinations

    4. **Divide and Conquer Algorithms**
       - Merge Sort
       - Quick Sort
       - Binary Search

    5. **File System Traversal**
       - Listing all files in nested folders

    ► Example (Factorial):
    ```java
    int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
*/