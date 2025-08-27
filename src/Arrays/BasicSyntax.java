package Arrays;

public class BasicSyntax {
    
        public static void main(String[] args){
            int x=5;
    
            //array
            int[] arr ; //declaration
            arr = new int[5];  //memory allocation
            //initialising individual elements
            arr[0]=10;
            arr[1]=20;
            arr[2]=30;
            arr[3]=40;
            arr[4]=50;

            //output of array element
            System.out.print(arr[0] + " ");
            //update kr sakte hain value
            arr[0]=99;
            arr[0] +=10;
            System.out.print(arr[0] + " ");

    
    
        }
        
    
    
}
