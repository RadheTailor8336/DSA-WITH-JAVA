package Arrays;

public class nextGreatestElement {
    public static void main(String[] args) {

        // Input array
        int[] arr = {12, 8, 41, 37, 49, 16, 28, 21};
        int n = arr.length;

        // Answer array jisme hum result store karenge
        int[] ans = new int[n];

        // Last element ke right me kuch nahi hota,
        // isliye uska answer hamesha -1 hota hai
        ans[n-1] = -1;



//        // Method 1 : Brute Force
//        // Outer loop: har element ke liye
//        for(int i = 0; i < n-1; i++){
//
//            // Initially maximum ko bahut chhoti value se set karte hain
//            // taaki koi bhi element isse bada hi nikle
//            int mx = Integer.MIN_VALUE;
//
//            // Inner loop: current element ke right side me search karo
//            for(int j = i+1; j < n; j++){
//                // Har element ko compare karke max nikalte raho
//                mx = Math.max(mx, arr[j]);
//            }
//
//            // Right side ka maximum answer array me daal do
//            ans[i] = mx;
//        }

        // Method 2 : Optimised
        int nge = arr[n-1];
        for(int i = n-2; i>=0;i--){
                ans[i] = nge;
                nge = Math.max(nge,arr[i]);
        }


        // Print original array
        System.out.println("Original Array:");
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println(); // new line

        // Print answer array
        System.out.println("Next Greatest Element Array:");
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
