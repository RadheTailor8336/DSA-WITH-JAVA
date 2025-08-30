package TwoDimensionalArray;
import java.util.Scanner;

public class outputUsingNestedLoops {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int m = arr.length; // no of rows/lines
        int n = arr[0].length; // no of cols


        //input of 2D Array
        for(int i =0; i<m; i++){ // rows
            for(int j = 0; j<n; j++){ // cols
                arr[i][j] = sc.nextInt();

            }

        }


        //output of 2D Array
        for(int i =0; i<m; i++){ // rows
            for(int j = 0; j<n; j++){ // cols

                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
