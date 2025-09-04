package strings;

public class StringBuilderInJava {
    public static void main(String[] args) {
        String s = new String("Raghav");
        StringBuilder sb = new StringBuilder("abc"); // way to make strings
        System.out.println(sb);

        /*
         * 🔹 StringBuilder in Java
         *
         * ➡ StringBuilder ek mutable class hai (string modify ki ja sakti hai).
         * ➡ Located in java.lang package.
         * ➡ Fast and efficient for string manipulation (thread-safe nahi hai,
         *    isliye StringBuffer se fast hai).
         *
         * ✅ Commonly Used Constructors:
         *    - StringBuilder()              → empty builder with default capacity (16 chars)
         *    - StringBuilder(String str)    → builder initialized with given string
         *    - StringBuilder(int capacity)  → builder with given capacity
         *
         * ✅ Important Methods:
         *    - append(String s)      → string ke end me add karega
         *    - insert(int offset, s) → given position par insert karega
         *    - replace(start, end, s)→ substring ko replace karega
         *    - delete(start, end)    → substring ko delete karega
         *    - reverse()             → pura string reverse karega
         *    - capacity()            → current capacity return karega
         *    - ensureCapacity(n)     → minimum capacity set karega
         *    - charAt(i)             → ith character return karega
         *    - setCharAt(i, ch)      → ith character ko change karega
         *    - length()              → string ki current length dega
         *    - substring(start, end) → substring return karega
         *
         * 🔑 Use Case:
         *    - Jab hume bar-bar string modify karni ho (append, delete, reverse, etc.),
         *      to StringBuilder is better than String (immutable).
         */


    }
}
