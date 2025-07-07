package dsa.string;

/*
    -----------------------------------------------
                    String Class in Java
    -----------------------------------------------

    1. Overview:
       - String is a class in java.lang package.
       - It represents a sequence of characters.
       - Strings in Java are immutable, meaning their values cannot be changed once created.
       - String objects are widely used in Java programming for text manipulation.

    2. String Creation:
       - By String literal:
           String s1 = "Hello";
           - Stored in the String Constant Pool.
           - JVM reuses the object if it already exists with the same value.
       - By new keyword:
           String s2 = new String("Hello");
           - Creates a new object in the heap memory, even if the same literal exists.

    3. String Immutability:
       - Once a String object is created, its value cannot be altered.
       - Any modification (concat, replace, etc.) results in the creation of a new String object.
       - Advantages:
           - Security: Useful in sensitive data (passwords, class names).
           - Thread safety: Immutable objects are inherently thread-safe.
           - Caching: JVM optimizes memory using the String Constant Pool.

    4. Commonly Used Methods:
       - length()          : Returns the length of the string.
       - charAt(int index) : Returns the character at the specified index.
       - substring(int start, int end) : Extracts a substring.
       - toLowerCase(), toUpperCase() : Converts string to lower or upper case.
       - equals(Object obj) : Compares the contents of two strings.
       - equalsIgnoreCase() : Compares strings ignoring case.
       - compareTo(String another) : Lexicographically compares two strings.
       - contains(String seq) : Checks if a sequence exists in the string.
       - startsWith(String prefix), endsWith(String suffix) : Checks prefixes and suffixes.
       - replace(char old, char new) : Replaces characters.
       - split(String regex) : Splits the string into an array.
       - trim() : Removes leading and trailing whitespaces.
       - indexOf(char c), lastIndexOf(char c) : Finds the position of characters/substrings.

    5. String Comparison:
       - == : Compares references, not content.
       - equals() : Compares content/value.
       - compareTo() : Useful for sorting strings.

    6. String Concatenation:
       - Using + operator:
           String s3 = s1 + " World";
       - Using concat() method:
           String s4 = s1.concat(" World");
       - In loops or frequent modifications, avoid + operator due to performance overhead.

    7. StringBuilder and StringBuffer:
       - StringBuilder: Mutable sequence of characters, not synchronized (faster).
       - StringBuffer: Mutable and synchronized (thread-safe but slower).
       - Recommended to use them when string modifications are frequent.

    8. String Constant Pool (SCP):
       - A special memory region where string literals are stored.
       - JVM checks SCP first before creating a new string literal.

    9. Best Practices:
       - Prefer String literals when immutability is needed and strings are not modified.
       - Use StringBuilder/StringBuffer for string manipulations in loops or heavy operations.
       - Use equals() instead of == for content comparison.

    10. Miscellaneous:
       - String implements Comparable<String>, Serializable, and CharSequence interfaces.
       - NullPointerException occurs if you call methods on a null string reference.

    -----------------------------------------------
    Example:
       String str = "Java";
       System.out.println(str.length());        // Output: 4
       System.out.println(str.toUpperCase());   // Output: JAVA
    -----------------------------------------------
*/


public class C_01_StringClass {
    public static void main(String[] args) {
        String a = "Satish";
//        String b = "Satish";
        System.out.println(a);
        a = "Srivastava";   /*
                                this is not changing the original object "Satish" it is creating new one "Srivastava" and
                                referring new Object "Srivastava" with reference variable "a"
                                means address of the reference variable get changed and of new object "Srivastava".
                                this means Strings are immutable in nature for security purpose.
                            */
        System.out.println(a);



    }
}
