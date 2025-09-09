package basicSorting;

public class bubbleSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        print(arr);
        //Bubble sort 1
//        for (int x = 0; x <= n-1; x++) {
//            for (int i = 0; i < n - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//
//                }
//            }
//        }
        //Bubble sort 2
//        for (int x = 0; x <= n-1; x++) {
//            for (int i = 0; i < n-1 - x; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//
//                }
//            }
//        }

        // Bubble sort optimised
        for (int x = 0; x <= n-1; x++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                }
            }
            // check if this pass has sorted or not
            boolean flag = true;
            for (int i = 0; i < n-1; i++) {

                if(arr[i]>arr[i+1])
                    flag= false;
                    break;
                
            }
            if(flag == true) break;
        }


        print(arr);

        }
    }

    // Leetcode 283. Move Zeroes
/**
 *class Solution {
 *     public void moveZeroes(int[] arr){
 *         int n = arr.length;
 *         int noz = 0;
 *         for(int ele : arr){
 *             if(ele == 0) noz++;
 *         }
 *
 *         for(int x =0;x<noz;x++){
 *             for(int i=0;i<n-1-x;i++){
 *                 if(arr[i]==0){
 *                     int temp = arr[i];
 *                     arr[i] = arr[i+1];
 *                     arr[i+1] = temp;
 *                 }
 *             }
 *         }
 *
 *     }
 * }
 *
 */

