package Arrays;
import java.util.Scanner;

public class outputOfArray {
    public static void main(String[] args) {
        System.out.println("Enter Array size");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];




        //input -> for loop
        for (int i = 0; i <=n-1; i++) {
            arr[i] = sc.nextInt();

        }

        //output -> for loop
        for (int i = 0; i <=n-1; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
