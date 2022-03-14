package Recursion.Strings.PowerSets;

import java.util.ArrayList;

//Using IBH Approach
public class PowerSetIPReturnArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = powerSet("abc");
        System.out.println(strings);

    }

    //faith: bc->[--,-c,b-,bc]
    //expectation: abc->[---,--c,-b-,-bc,a--,a-c,ab-,abc]
    static ArrayList<String> powerSet(String ip) {
        if (ip.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
              return list;
        }
        char c = ip.charAt(0);//a
        String ros=ip.substring(1);//bc //ros-> rest of string
        ArrayList<String> rres= powerSet(ros);//[--,-c,b-,bc] //rres-->recursion result

        ArrayList<String> fres= new ArrayList<>();
        for(String rstr: rres){
            fres.add(rstr);
            fres.add(c+rstr);
        }
        return fres;
    }
}
