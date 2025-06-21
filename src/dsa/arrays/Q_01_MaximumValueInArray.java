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

        // wrong finding with exception handling.
        try{
            int result = maximumValueInRange(arr,2,3);
            System.out.println(result);
        }catch(IllegalArgumentException e){
            System.out.println("Please check the Arguments you are Passing, array should not be empty, and start index should be smaller then end Index.");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Start or end index out of bounds. Please Check the indexes you are passing.");
        }catch (Exception e){
            System.out.println("Something went wrong. Please check !!!");
        }
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

    static int maximumValueInRange(int[] array, int start,int end){
        // checking if passed array is empty or not?
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        // checking if ranges are given properly
        if(end < start){
            throw new IllegalArgumentException("Please check the Indexes You passed, start index should be Smaller then end index.");
        }

        // if end is out of bound.
        if (start < 0 || end >= array.length) {
            throw new IndexOutOfBoundsException("Start or end index is out of array bounds");
        }


        int maximumValue = array[start];

        for (int i = start; i <= end; i++) {
            if (array[i] > maximumValue) {
                    maximumValue = array[i];
            }
        }

        return maximumValue;
    }
}
