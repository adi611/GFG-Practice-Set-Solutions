// Find duplicates in an array 

/* Given an array a[] of size N which contains elements from 0 to N-1, 
    you need to find all the elements 
    occurring more than once in the given array.*/



import java.io.*;
import java.util.*;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            ++a[arr[i]];
        }
        ArrayList<Integer> val = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(a[i]>1)
            val.add(i);
        }
        for(int i=0;i<val.size();i++){
            return(val);
        }
        val.add(-1);
        return val;
    }
}
