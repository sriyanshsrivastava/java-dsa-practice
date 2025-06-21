package dsa.arrays;

public class Q_01_MaximumValueInArray {
    public static void main(String[] args) {
        int[] arr = {3,4,7,0,100,947};

        // calculating maximum value in arr
        int max=maximumValue(arr);

        // printing the maximum value
        System.out.println("The maximum value present in this Array is: " + max);

        // calculating maximum value in arr from index 1 to index 3.
        // output should be 7
        int maxInRange = maximumValueInRange(arr,1,3);

        // printing the maximum value in range
        System.out.println("The maximum value of element in range is: "+ maxInRange);

        // simple finding in range in one statement.
        System.out.println(maximumValueInRange(arr,2,4));
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

    // write a function which returns maximum value in given array range or say subArray.
    // this function returns the maximum value between given indexes last index included.

    static int maximumValueInRange(int[] array, int fromIndex,int toIndex){
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int maximumValue = array[fromIndex];

        for (int i = fromIndex; i <= toIndex; i++){
            if(array[i]>maximumValue){
                maximumValue= array[i];
            }
        }
        return maximumValue;
    }
}
