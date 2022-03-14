package Recursion.Strings.PowerSets;

public class PrintPowerSet {
    public static void main(String[] args) {
        printSubset("abc"," ");
    }
    static void printSubset(String ip,String op) {
        if(ip.length()==0) {
            System.out.print(op+" ");
            return;
        }
        String op2 = op + ip.charAt(0);
        ip=ip.substring(1);
        printSubset(ip, op);
        printSubset(ip,op2);
    }
}
