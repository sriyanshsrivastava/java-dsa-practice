package dsa.mathematics;

public class C_05_FindingNumberOfDigitsInBinaryRepresentation {
    public static void main(String[] args) {
        System.out.println(findDigitsOfBinary(30485));
        System.out.println(findDigitsOfBinary(10));

    }
    private static int findDigitsOfBinary(int n){
        return (int)(Math.log(n)/Math.log(2))+1;
    }
}
