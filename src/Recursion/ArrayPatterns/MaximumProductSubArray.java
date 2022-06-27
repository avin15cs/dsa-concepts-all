package Recursion.ArrayPatterns;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] a={-2,0,-1};
        int ans=maxProduct(a);

        System.out.println(ans);

    }

    public static int maxProduct(int[] nums) {
        boolean sign=true;
        int i=0;
        int pp=1,pn=1;
        while(i<nums.length){
            if(nums[i]<0)
                sign=(sign)?false:true;

            if(sign){
                if(pn>pp||pn==0){
                    pp=pn;
                    pn=1;
                }

                pp=pp*nums[i];
            }
            else{
                if(pn<pp)
                    pn=pp;
                pn=pn*Math.abs(nums[i]);
            }
            i++;
        }
        return pp;
    }
}
