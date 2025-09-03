package strings;

public class plusOperator {
    public static void main(String[] args) {
        String s = "abc";
        String t = "pqr";
        s = s + t ;
        System.out.println(s);
        System.out.println(s + 10 + 20); // op =  abcpqr1020
        System.out.println(10 + 20 + s); // 30abcpqr

    }
}
