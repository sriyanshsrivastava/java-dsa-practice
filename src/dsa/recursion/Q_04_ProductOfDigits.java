package dsa.recursion;

public class Q_04_ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(123));

    }
    static int productOfDigits(int number){
        if(number%10==number){
            return number;
        }
        return (number%10) * productOfDigits(number/10);
    }
}
