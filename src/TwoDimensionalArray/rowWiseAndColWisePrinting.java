package TwoDimensionalArray;

public class rowWiseAndColWisePrinting {
    public static void main(String[] args) {
        // 1 2
        // 3 4
        // 5 6
        int[][] arr ={{1,2},{3,4},{5,6}};
        int m = arr.length;
        int n = arr[0].length;



        // col wise print
//        for (int j= 0; j <n ; j++) {
//            for (int i = 0; i < m; i++) {
//                System.out.print(arr[i][j]+ " ");
//
//            }
//            System.out.println();
//
//        }
        System.out.println();

    //storing in a new array
        int[][] transpose = new int[n][m];
        for (int j= 0; j <m ; j++) {
            for (int i = 0; i < n; i++) {
               transpose[i][j] = arr[j][i];

            }
            System.out.println();

        }
        for(int[] ele: transpose){
            for(int x: ele){
                System.out.print(x+ "  ");
            }
            System.out.println();
        }






    }
}
