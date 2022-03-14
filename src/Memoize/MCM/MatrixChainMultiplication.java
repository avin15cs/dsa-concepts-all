package Memoize.MCM;

public class MatrixChainMultiplication {

    public static void main(String[] args) {
        System.out.println(matrixMultiplication(4,new int[]{10,30,5,60}));
    }
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        return solve(arr,1,N-1);

    }

    static int solve(int a[],int i, int j){

        if(i>=j)
            return 0;


        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=solve(a,i,k)+a[i-1]*a[k]*a[j]+solve(a,k+1,j);

            if(temp<min)
                min=temp;
        }

        return min;
    }
}
