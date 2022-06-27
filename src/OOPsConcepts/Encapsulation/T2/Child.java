package OOPsConcepts.Encapsulation.T2;

import OOPsConcepts.Encapsulation.T1.Encapsulation;

public class Child extends Encapsulation {
    public static void main(String[] args) {
        Child c=new Child();
        //doSleep() method can be accessed through Encapsulation child.
        c.doSleep();


        Encapsulation encapsulation = new Child();
        encapsulation.doWork();

    }
}

class GrandChild extends Child{
    public static void main(String[] args) {
        GrandChild grandChild=new GrandChild();
        grandChild.doSleep();
    }
}