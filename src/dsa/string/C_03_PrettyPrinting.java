package dsa.string;

public class C_03_PrettyPrinting {
    public static void main(String[] args) {
        // formated printing
        float a = 453.1274f;
        System.out.printf("Formatted Number is %.2f",a); // only printing the value up to 2 decimal points.
        System.out.println();


        // printing the value of PI
        double pi = Math.PI;
        System.out.println(pi);

        // printing value of pi only up to 3 digits after decimal.
        System.out.printf("Pie : %.3f",pi);
        System.out.println();

        // placeholder printing in string
        System.out.printf("Hello my name is %s and i am %s.","Sriyansh","Coder");

    }
}
