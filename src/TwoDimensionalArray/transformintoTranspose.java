package TwoDimensionalArray;

import java.sql.SQLOutput;

public class transformintoTranspose {
    public static void print(int[][] arr){
        int m = arr.length, n = arr[0].length;
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        print(arr);


        // Transposing it
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <=i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            
        }
        print(arr);

        // rotate -> reverse each row
        for(int i =0; i < m; i++){
            int a = 0, b = m-1;
            while(a<b) {
                //swap arr[i][a] and arr[i][b]
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++; b--;
            }
        }
    }

}


// Leetcode 48. Rotate Image
/**
 * class Solution {
 *     public void rotate(int[][] arr) {
 *          int m = arr.length;
 *
 *       // Transposing it
 *         for (int i = 0; i < m; i++) {
 *             for (int j = 0; j <=i; j++) {
 *                 int temp = arr[i][j];
 *                 arr[i][j] = arr[j][i];
 *                 arr[j][i] = temp;
 *             }
 *
 *
 *         }
 *
 *                 // Then rotate the array
 *          for(int i =0; i < m; i++){
 *             int a = 0, b = m-1;
 *             while(a<b) {
 *                 //swap arr[i][a] and arr[i][b]
 *                 int temp = arr[i][a];
 *                 arr[i][a] = arr[i][b];
 *                 arr[i][b] = temp;
 *                 a++; b--;
 *             }
 *         }
 *
 *
 *     }
 * }
 *
 *
 *
 */


