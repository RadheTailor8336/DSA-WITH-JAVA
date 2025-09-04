package strings;

public class modifyCharacterInString {
    public static void main(String[] args) {
        String s = "Hello";
        String t = s.substring(0,2) + "y"+ s.substring(2);
        System.out.println(t);
    }

}
