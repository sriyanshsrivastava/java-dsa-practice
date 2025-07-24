package dsa.mathematics;
/*
    find the unique value in the array.
    Example:
        Input: [1,2,3,4,6,1,2,3,4]
        Output: 6
        Explanation: Because all the number is appearing twice only 6 appearing once in the array so answer is 6.
 */

public class C_03_FindUniqueInArray {
    public static void main(String[] args) {
        int[] arr ={2,3,4,3,2,6,4};
        System.out.println(findUnique(arr));
    }

    static int findUnique(int[] array){
        int unique = 0;
        for(int n:array){
            unique^=n; // XOR will give 0 for same number and number itself when XOR with 0.
        }
        return unique;
    }
}
