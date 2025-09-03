package strings;

import java.util.Scanner;

public class intputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name :");
        String str = sc.nextLine();
        System.out.print("Hi");
        System.out.print(str);
    }

}
