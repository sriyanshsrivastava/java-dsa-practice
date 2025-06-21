package dsa.arrays;

public class C_01_ArraysConcepts {
    public static void main(String[] args) {
        // Q: Store a roll number

        int a =19;

        // Q; store a person's name;
        String name = "Sriyansh srivastava";

        // Q: store 5 roll numbers.
        int rno1=23;
        int rno2=33;
        int rno3=43;
        int rno4=46;
        int rno5=51;

        // Q: What if someone says Store 500 roll numbers, do we need to write above line again and again?
        // Answer is - NO, here is why Arrays comes into picture.

        // Array syntax
        // datatype[] variable_name / reference_variable_name = new datatype[size];

        // store 5 roll numbers:

        int[] rons1 = new int[5];

        // or directly

        int[] rnos2 = {23,12,45,32,15};

        // we can not mix datatypes in any array it contains only one type of datatype for all the values into the array.

        int[] ros; // declaration of array. ros is getting defined in stack.
        ros =new int[5]; // initialisation: actually here object is being created in the heap memory;

        // printing the value which is on third index, index starts from 0.
        System.out.println(rnos2[2]);

        // printing all the value of array rnos2 using enhanced for loop.
        for(int roll:rnos2){
            System.out.print(roll+ " ");
        }
        System.out.println();

        // String array
        String[] arr = new String[4];
        System.out.println(arr[0]);


    }
}
