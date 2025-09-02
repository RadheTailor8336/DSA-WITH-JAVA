package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsTwoD {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);  a.add(20);  a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40);   b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
         d.add(60);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c);l.add(d);

       // System.out.print(l + " ");

//        for (int i = 0; i < a.size(); i++) {
//            System.out.print(a.get(i) + " ");
//
//        }
        for (int i = 0; i < l.size() ; i++) {
            for (int j = 0; j <l.get(i).size() ; j++) {
                System.out.print(l.get(i).get(j) + " ");

            }
            System.out.println();



        }



    }
}


/** 118. Pascal's Triangle Leetcode
 *

 * class Solution {
 *     public List<List<Integer>> generate(int n) {
 *         List<List<Integer>> ans = new ArrayList<>();
 *         for(int i =0; i<n; i++){
 *             List<Integer> l = new ArrayList<>();
 *             for(int j = 0; j<=i; j++){
 *                if(j ==0 || j == i) l.add(1);
 *
 *             else{
 *                 l.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
 *             }
 *         }
 *             ans.add(l);
 *
 *         }
 *
 *         return ans;
 *     }
 * }
 *
 *  */
