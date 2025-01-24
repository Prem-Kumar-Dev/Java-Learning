//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Arrays;


class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        char[] st = s.toCharArray();
        for (int i=0; i<st.length;i++){
            int temp= (int)st[i];
            if(arr[97-temp]==-1){
                arr[97-temp]=i;
            }else{
                arr[97-temp]+=1;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return 's';
    }
}
