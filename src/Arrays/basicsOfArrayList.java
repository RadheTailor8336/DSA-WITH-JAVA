package Arrays;

import java.util.ArrayList;

public class basicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0, 10); // initialization
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);
        System.out.println(arr.size());
        //  System.out.println(arr);  // arraylist ke elements ko print krta hain op- [10, 20, 30, 40, 50, 60]
        System.out.print(arr);

        System.out.println();
        arr.set(2, 300); // modify krne ke liye
        System.out.print(arr);

        System.out.println();
        arr.add(90); // push back krta hai array list mein value ko
        System.out.println(arr.size());
        System.out.print(arr);
    }
}
