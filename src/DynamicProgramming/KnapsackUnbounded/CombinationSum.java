package DynamicProgramming.KnapsackUnbounded;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {

    }
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> dp[]= new ArrayList[target+1];
//        int n=candidates.length;
//        int[][] t = new int[n+1][n+1];
//
//        for(int i=1;i<n;i++){
//            for(int j=1;j<n;j++){
//                if(candidates[i-1]<j){
//                    t[i][j]=Math.max(t[i][j-candidates[i-1]],t[i-1][j]);
//                }
//                else
//                    t[i][j]=t[i-1][j];
//            }
//        }
//
//        for(int a[]: t ){
//            List<Integer> ls=new ArrayList<>();
//                Collections.addAll(ls, a);
//        }
//        return list;
//    }
}
