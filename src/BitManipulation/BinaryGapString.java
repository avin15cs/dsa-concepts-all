package BitManipulation;

public class BinaryGapString {
    public static void main(String[] args) {
        int ans=solution(1041);
        System.out.println(ans);
    }
    public static int solution(int N) {
        int num=N,count=0, max=0;
        StringBuffer s=new StringBuffer();
        while(num!=0){
            s=s.append(num&1);
            num=num>>1;
        }
        s=s.reverse();
        int i=0,j=0;
        while(i<s.length()){
            j=i+1;
            while(j<s.length() && s.charAt(j)=='0' && s.charAt(i)=='1'){
                count++;j++;
            }
            if(j==s.length()) count=0;
            max=Math.max(count,max);
            count=0;i=j;
        }
        return max;
    }
}
