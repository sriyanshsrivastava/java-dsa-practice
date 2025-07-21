package dsa.recursion;

public class Q_02_Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(20));
    }

    static int factorial(int n){
        if(n<2){
            return 1;
        }
        return  n * factorial(n-1);
    }
}
