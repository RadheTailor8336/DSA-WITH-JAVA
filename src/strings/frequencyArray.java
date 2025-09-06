package strings;

import java.util.Scanner;

public class frequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];
        // 0-a, 1-b
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i); // fetch array at specific index
            int idx = (int)ch - 97; // ascii value of the character
            freq[idx]++;

        }
        int maxFreq = -1;
        for(int i =0;i<freq.length;i++){
                maxFreq = Math.max(maxFreq,freq[i]);

        }
        for(int i =0;i<freq.length;i++){
          if(freq[i] == maxFreq){
              char ch = (char)(i+97); // typecasting int to char, and +97 for ascii value to print char
              System.out.println(ch + " ");
          }

        }


    }
}
