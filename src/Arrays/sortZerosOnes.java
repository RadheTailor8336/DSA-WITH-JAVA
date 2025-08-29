package Arrays;

public class sortZerosOnes {
    public static void main(String[] args){
        int[] arr= {1,0,0,1,1,0,0,0,1,0};
        int n = arr.length;

        //meththod1
//        int noOfZeros = 0, noOfONes = 0;
//        for(int i =0; i<n; i++){
//            if(arr[i]==0) noOfZeros++;
//            else noOfONes++;
//        }
//        for(int i =0; i<noOfZeros;i++){
//            arr[i] = 0;
//        }
//        for(int i = noOfZeros;i<n;i++){
//            arr[i] = 1;
//        }


        //method 2  -> one pass solution
        int i =0, j=n-1;
        while(i<j){
            if(arr[i] ==0) i++;
         if(arr[j] ==1) j--;

     //       if(i>j) break;
            if(i<j && arr[i] == 1 && arr[j] ==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for(int ele: arr){
            System.out.print(ele+ " ");
        }


    }
}
