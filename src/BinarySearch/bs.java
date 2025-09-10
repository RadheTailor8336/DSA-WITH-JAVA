package BinarySearch;

public class bs {
    public static void main(String[] args) {
        int[] arr = {10,23,46,89,91,97,107,140,264};
        int n = arr.length;
        int target = 46;
        int lo =0;
        int hi = n-1;
        boolean flag = false; // false means not present
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target){
                flag = true;
                break;
            }
            else if(arr[mid]>target) hi = mid-1;
            else if(arr[mid]<target) lo = mid+1;
        }
        if(flag == true) System.out.println("Target Present");
        else System.out.println("Target not found");


    }
}


// Leetcode 704. Binary Search
// Optimised and brute force approach both includes

/* actual Binary Search
class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid]>target) hi = mid-1;
            else lo = mid+1;
        }
        return -1;

        }

    }
 */



/* brute force
         int result = 0;
         boolean flag = false;
         for(int i=0;i<nums.length;i++){
             if(nums[i]== target){
                 result = i;
                 flag = true;
                 break;

             }
             }
             if(flag == false){
                 result = -1;
             }

               return result;
 */