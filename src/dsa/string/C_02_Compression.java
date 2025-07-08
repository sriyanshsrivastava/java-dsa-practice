package dsa.string;

public class C_02_Compression {
    public static void main(String[] args) {
        String a = "satish";
        String b;
        b = a; // we can do this, but it's referencing same object and will have address of a only in b.
        String name1 = new String("Satish");
        String name2 = new String("Satish");
        // these two lines will create separate objects in the heap memory
        // when we do comparison operator '==' it will give me false
        // and when we use .equals() method this will give us true, which means it compares only values.
        // demo -
        System.out.println(name1==name2); // will print false
        System.out.println(name1.equals(name2)); // will print true, because value is same.
    }

}
