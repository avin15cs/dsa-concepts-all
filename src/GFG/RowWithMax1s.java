package GFG;

public class RowWithMax1s {

    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};

        int ans=rowWithMax1s(arr,4,4);
        System.out.println(ans);
    }
    static int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int i=0,j=m-1, maxRow=-1;
        while(i<n){
            while(j>=0 && arr[i][j]!=0){
                maxRow=i;
                j--;
            }

            i++;
        }
        return maxRow;
    }
}
