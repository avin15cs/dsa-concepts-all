package Arrays.MergeIntervals;
import java.util.Arrays;
public class MinimumNoOfPlatforms {
    public static void main(String[] args) {
        int[] arr={10, 22, 28, 29, 30, 49};
        int[] dep={-6,-3, -2, 28, 29, 30, 57};

        int ans=minPlatforms(arr,dep);
        System.out.println(ans);
    }

    public static int minPlatforms(int[] arr, int[] dep) {
        // write the solution here..
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=0,j=0;
        int minPlat=1,count=0;
        int n=arr.length;

        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                count++;
                System.out.println("Arrival Time: "+arr[i]+" Departure Time: "+dep[j]+" Count="+count);
                i++;


                minPlat=Math.max(minPlat,count);
            }else{
                j++;
                count--;
            }
        }

        return minPlat;

    }
}
