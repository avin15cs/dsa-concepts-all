package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistribution {
    public static long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        Collections.sort(a);
        long minDiff=a.get((int)m)-a.get(0);
        long diff;

        for(long i=1;i<=n-m;i++)
        {
            diff=a.get((int)(i+m-1))-a.get((int)i);
            if(diff<minDiff)
                minDiff=diff;
        }
        return minDiff;

    }
    public static void main(String[] args) {
        ArrayList<Long> a = new ArrayList<>();
        a.add(3L);a.add(4L);
        a.add(1L);a.add(9L);
        a.add(56L);a.add(7L);
        a.add(9L);a.add(12L);

        System.out.println(findMinDiff(a,8,5));
    }

}
