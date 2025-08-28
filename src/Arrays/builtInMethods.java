package Arrays;
import java.util.Arrays;

public class builtInMethods {

    public static void main(String[] args){
        int [] arr = {30,10,40,23,89,34};
        for(int ele : arr){ //  its a for each loop to print all the elements in array
            System.out.print(ele+ " ");
        }

        Arrays.sort(arr); // built in functions to sort an array
        System.out.println();

        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }



    }
}
