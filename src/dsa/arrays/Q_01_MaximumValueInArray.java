package dsa.arrays;

public class Q_01_MaximumValueInArray {
    public static void main(String[] args) {
        int[] arr = {3,4,7,0,100,947};

        // calculating maximum value in arr
        int max=maximumValue(arr);

        // printing the maximum value
        System.out.println("The maximum value present in this Array is: " + max);
    }

    // write a function which returns maximum value of any integer array.
    static int maximumValue(int[] array){
        // handling error if array is empty.
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int maxvalue=array[0];

        for(int element:array){
            if(element>maxvalue){
                maxvalue=element;
            }
        }
        return maxvalue;
    }
}
