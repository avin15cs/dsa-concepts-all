package Recursion.ArrayPatterns;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AllIndices {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here

        if(idx==arr.length)
            return new int[fsf];

        int ans[];
        if(arr[idx]==x){
            ans=allIndices(arr,x,idx+1,fsf+1);
            ans[fsf]=idx;

            return ans;
        }

        return allIndices(arr,x,idx+1,fsf);
    }

}
