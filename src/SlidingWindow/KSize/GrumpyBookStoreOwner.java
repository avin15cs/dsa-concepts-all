package SlidingWindow.KSize;

public class GrumpyBookStoreOwner {
    public static void main(String[] args) {
        int[] customers={1,0,1,2,1,1,7,5};
        int[] grumpy={0,1,0,1,0,1,0,1};
        int ans=maxSatisfied(customers,grumpy,3);
        System.out.println(ans);
    }
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        int n = grumpy.length;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0)
                satisfied += customers[i];
            customers[i] = grumpy[i] * customers[i];
        }

        int i = 0, j = 0, sum = 0, msum = 0;
        while (j < n) {
            sum += customers[j];
            if (j - i + 1 == minutes) {
                msum = Math.max(sum, msum);
                sum -= customers[i++];
            }
            j++;
        }

        return satisfied + msum;
    }
}
