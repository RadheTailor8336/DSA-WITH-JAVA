package TwoDimensionalArray;

public class maxInArray {
    public static void main(String[] args) {
        int[][] arr = {{1,5,6},{2,-9,3},{5,10,3}};
        int mx = Integer.MIN_VALUE;  // less than 0
        int m = arr.length;
        int n = arr[0].length;
        int sum =0;

        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                mx = Math.max(mx,arr[i][j]); // find the max between two elements
               // System.out.print(arr[i][j]+ " ");
            }

        }
        System.out.println("Max is :" +mx);


        // To print the sum of all elements in array

        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                sum+= arr[i][j];
                // System.out.print(arr[i][j]+ " ");
            }

        }
        System.out.println("Sum is :" +sum);

    }
}
