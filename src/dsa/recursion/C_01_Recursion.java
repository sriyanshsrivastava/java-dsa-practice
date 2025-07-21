package dsa.recursion;

public class C_01_Recursion {
    public static void main(String[] args) {
        // write a function that prints hello world
        // our task is to print Hello world five times, with single function call, but we can not
        // have multiple println in the message() function. what we can do ?
        message();
    }

    static void message(){
        System.out.println("Hello world");
        message1(); // we are calling next following method after its execute println.
    }

    // similarly we will do this for all the functions.
    static void message1(){
        System.out.println("Hello world");
        message2();
    }
    static void message2(){
        System.out.println("Hello world");
        message3();
    }
    static void message3(){
        System.out.println("Hello world");
        message4();
    }
    static void message4(){
        System.out.println("Hello world");

    }


}
