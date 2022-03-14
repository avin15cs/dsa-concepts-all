package BitManipulation;

public class BinaryGap {
    public static void main(String[] args) {
        int ans=solution(32);
        System.out.println(ans);
    }
    public static int solution(int N) {
        int num=N,count=0, max=0;
        while(num!=0){
            int temp= num&1;
            System.out.print(temp);
            if(temp==0)
                count++;
            else{
                max=Math.max(max,count);
                count=0;
            }
            num=num>>1;
        }
        return max;
    }
}
