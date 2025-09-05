package dsa.recursion;

public class Q_03_SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
        System.out.println(sumOfDigits(1000));
        System.out.println(sumOfDigits(12015));

    }
    static int sumOfDigits(int number){
        if(number==0){
            return 0;
        }
        int lastDigit = number%10;
        number /= 10;
        int sum =lastDigit + sumOfDigits(number);
        return sum;
    }
}
