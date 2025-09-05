package dsa.recursion;

public class C_04_DecrementConcept {
    public static void main(String[] args) {
        fun(5);

    }
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        //fun(n--); // this will assign first and then subtract
        // above code will give infinite loop which leads to stack overflow
        fun(--n); // subtract first and then assign
        // above statement will work as intended will print 54321
    }
}
