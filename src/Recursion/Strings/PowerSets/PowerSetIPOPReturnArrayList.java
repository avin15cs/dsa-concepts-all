package Recursion.Strings.PowerSets;

import java.util.ArrayList;

public class PowerSetIPOPReturnArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = powerSet("abc","");
        System.out.println(strings);

    }
    static ArrayList<String> powerSet(String ip, String op) {
        if (ip.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(op);
            return list;
        }
        char c = ip.charAt(0);
        //local to this call
        ArrayList<String> ansLeft = powerSet(ip.substring(1),c+op);
        ArrayList<String> ansRight = powerSet(ip.substring(1),op);;

        ansLeft.addAll(ansRight);
        return ansLeft;
    }
}
