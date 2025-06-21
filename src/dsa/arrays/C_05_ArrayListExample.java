package dsa.arrays;

import java.util.ArrayList;

public class C_05_ArrayListExample {

    public static void main(String[] args) {
        // Collection Framework Arraylist
        // when we don't know how much size we want.

        ArrayList<Integer> list = new ArrayList<>(10); // ArrayList object with 10 initialCapacity we can put any number of number here.
                                                                    // initialCapacity does not affect the number of elements it can hold.
        list.add(10);
        list.add(30);
        list.add(44);
        list.add(52);
        list.add(80);

        // List before for loop
        System.out.println(list);

        // adding more numbers using for loop beyond 5 numbers;
        // we can add any number of elements independent of initialCapacity we passed in ArrayList constructor.
        for(int i = 0; i<10;i++ ){
            list.add((int)(Math.random()*100));
        }

        // list after for loop
        System.out.println(list);

        // Updating any element of ArrayList
        list.set(0,100); // changing index 0 value to 100 here in list 10 -> 100
        System.out.println(list);

        // Removing any element in the list.

        list.remove(1); // removing value which is on index 1 in this list which is 30.
        // printing list and will see 30 at index 1 is now no more in the list
        System.out.println(list); // we can see at index 1 it shows 44 means 30 has been removed.

        // fetching any element in the list.
        // to fetch list[Index] will not work in ArrayList we have to use ArrayListObject.get(Index) like below.
        int thirdElement = list.get(2);
        System.out.println(thirdElement);


    }
}
