package Arrays;

public class CombineTwoSortedArray {
    public static void main(String[] args) {
        int[] ans=ninjaAndSortedArrays(new int[]{0},new int[]{1}, 1,1);
        for(int i: ans)
            System.out.print(i+" ");
    }
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.

        int i=m-n-1,j=n-1, k=m-1;
        while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                k--;i--;
            }
            else {
                arr1[k]=arr2[j];
                j--;k--;
            }
        }
        while(i>=0){
            arr1[k]=arr1[i];
            k--;i--;
        }

        while(j>=0){
            arr1[k]=arr2[j];
            k--;j--;
        }
        return arr1;
    }
}
