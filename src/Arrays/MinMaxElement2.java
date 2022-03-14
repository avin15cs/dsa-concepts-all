package Arrays;

public class MinMaxElement2 {
    static class Pair{
        int min;
        int max;
    }
    static Pair minMax(int[] a){
        Pair minmax=new Pair();
        minmax.max=a[0];
        minmax.min=a[0];
        for(int i=1;i<a.length;i++){
            if(minmax.max<a[i])
                minmax.max=a[i];
            if(minmax.min>a[i])
                minmax.min=a[i];
        }
        return minmax;
    }

    public static void main(String[] args) {
        int[] a={6,2,10,7,11,15};
        Pair minmax=minMax(a);
        System.out.println("Maximum Element= "+minmax.max);
        System.out.println("Minimum Element= "+minmax.min);
    }
}
