package strings;

public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb); // abcdef
        sb.deleteCharAt(3); // delete the character at specific index
        System.out.println(sb); //abcef
        sb.delete(2,5); // delets characters from 2 to 4
        System.out.println(sb);  // ab
        sb.insert(1,'g'); // add elemnt at specific index and shift the characters to the right side
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
