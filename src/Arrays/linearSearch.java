package Arrays;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target element:");
        int x = sc.nextInt();
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array element : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //solution
        boolean flag = false; // false means not found
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                flag = true; // means found
                break;
            }

        }
        if(flag == true) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}

