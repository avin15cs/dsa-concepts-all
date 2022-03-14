package RecursionTheConcept.SubsetSum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrintSubSetTopDown {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int tar = Integer.parseInt(br.readLine());
        ArrayList<String> ans=printTargetSumSubsets(arr, 0, "", 0, tar);
        for(String s: ans)
            System.out.println(s);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static ArrayList<String> printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(sos>tar) {
            ArrayList<String> bres=new ArrayList<>();
            return bres;
        }

        if(idx==arr.length){
            ArrayList<String> bres=new ArrayList<>();
            if(sos==tar)
                bres.add(set);
            return bres;
        }

        ArrayList<String> lrec=printTargetSumSubsets(arr,idx+1,set,sos,tar);
        ArrayList<String> rrec=printTargetSumSubsets(arr,idx+1,set+arr[idx]+", ",sos+arr[idx],tar);

        lrec.addAll(rrec);
        return lrec;

    }
}
